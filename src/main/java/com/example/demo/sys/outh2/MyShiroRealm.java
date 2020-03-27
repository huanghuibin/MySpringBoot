package com.example.demo.sys.outh2;

import com.example.demo.sys.entity.SysUserEntity;
import com.example.demo.sys.entity.SysUserTokenEntity;
import com.example.demo.sys.service.ShiroService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/3/26
 * Time:14:58
 */
@Component
public class MyShiroRealm extends AuthorizingRealm {


    @Autowired
    private ShiroService shiroService;


    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof OAuth2Token;
    }

    /**
     * Authorization 授权
     *
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        SysUserEntity user = (SysUserEntity) principalCollection.getPrimaryPrincipal();
        Set<String> userPermissions = shiroService.getUserPermissions(user.getUserId());
        simpleAuthorizationInfo.setStringPermissions(userPermissions);
        return simpleAuthorizationInfo;
    }

    /**
     * Authentication 认证
     *
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String token = (String) authenticationToken.getPrincipal();

        SysUserTokenEntity tokenEntity = shiroService.queryByToken(token);

        //token失效
        if (null == tokenEntity || tokenEntity.getExpireTime().getTime() < System.currentTimeMillis()) {
            throw new IncorrectCredentialsException("token失效，请重新登陆");
        }
        // 查询用户信息
        SysUserEntity user = shiroService.queryUser(tokenEntity.getUserId());
        //账号锁定
        if (user.getDeleteFlag().equals("Y")) {
            throw new LockedAccountException("账号已被锁定，请联系管理员");
        }

        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user, token, getName());
        return info;
    }
}

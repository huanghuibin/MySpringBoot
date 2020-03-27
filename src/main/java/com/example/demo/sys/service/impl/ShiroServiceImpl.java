package com.example.demo.sys.service.impl;

import com.example.demo.common.utils.Constants;
import com.example.demo.sys.dao.SysMenuDao;
import com.example.demo.sys.dao.SysRoleDao;
import com.example.demo.sys.dao.SysUserDao;
import com.example.demo.sys.dao.SysUserTokenDao;
import com.example.demo.sys.entity.SysMenuEntity;
import com.example.demo.sys.entity.SysUserEntity;
import com.example.demo.sys.entity.SysUserTokenEntity;
import com.example.demo.sys.service.ShiroService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/3/26
 * Time:15:40
 */
@Service
public class ShiroServiceImpl implements ShiroService {

    @Autowired
    private SysUserDao sysUserDao;

    @Autowired
    private SysRoleDao sysRoleDao;

    @Autowired
    private SysMenuDao sysMenuDao;

    @Autowired
    private SysUserTokenDao sysUserTokenDao;

    @Override
    public Set<String> getUserPermissions(long userId) {
        List<String> permsList;
        // 系统管理元，拥有最高权限
        if (userId == Constants.SUPER_ADMIN){
            List<SysMenuEntity> menuList = sysMenuDao.selectList(null);
            permsList = new ArrayList<>(menuList.size());
            for (SysMenuEntity menu: menuList) {
                 permsList.add(menu.getPerms());
            }
        }else{
            permsList = sysUserDao.queryAllPerms(userId);
        }
        // 用户权限列表
        Set<String> permsSet = new HashSet<>();
        for (String perms: permsList) {
            if (StringUtils.isBlank(perms)){
                continue;
            }
            // 例如 sys:config:list,sys:config:info,sys:config:save,sys:config:update,sys:config:delete
            permsSet.addAll(Arrays.asList(perms.trim().split(",")));
        }
        return permsSet;
    }

    @Override
    public SysUserEntity queryUserByUserName(String username) {
        return sysUserDao.queryUserByUserName(username);
    }

    @Override
    public SysUserTokenEntity queryByToken(String token) {

        return sysUserTokenDao.queryByToken(token);
    }

    @Override
    public SysUserEntity queryUser(Long userId) {
        return sysUserDao.selectById(userId);
    }
}

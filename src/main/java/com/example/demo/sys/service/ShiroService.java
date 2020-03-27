package com.example.demo.sys.service;

import com.example.demo.sys.entity.SysUserEntity;
import com.example.demo.sys.entity.SysUserTokenEntity;

import java.util.Set;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/3/26
 * Time:15:39
 */
public interface ShiroService {

    public Set<String> getUserPermissions(long userId);

    SysUserEntity queryUserByUserName(String username);

    SysUserTokenEntity queryByToken(String token);

    SysUserEntity queryUser(Long userId);
}

package com.example.demo.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.sys.entity.SysUserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户信息表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-03-26 15:15:56
 */
@Mapper
public interface SysUserDao extends BaseMapper<SysUserEntity> {

    List<String> queryAllPerms(@Param("userId") long userId);

    SysUserEntity queryUserByUserName(@Param("username") String username);
}

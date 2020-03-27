package com.example.demo.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.sys.entity.SysUserTokenEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 系统用户Token
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-03-27 15:21:01
 */
@Mapper
public interface SysUserTokenDao extends BaseMapper<SysUserTokenEntity> {

    SysUserTokenEntity queryByToken(@Param("token") String token);
}

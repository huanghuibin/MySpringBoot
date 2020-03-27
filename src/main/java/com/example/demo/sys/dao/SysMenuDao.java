package com.example.demo.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.sys.entity.SysMenuEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 菜单权限表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-03-26 15:15:56
 */
@Mapper
public interface SysMenuDao extends BaseMapper<SysMenuEntity> {
	
}

package com.example.demo.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.sys.dao.SysUserRoleDao;
import com.example.demo.sys.entity.SysUserRoleEntity;
import com.example.demo.sys.service.SysUserRoleService;
import org.springframework.stereotype.Service;


@Service("sysUserRoleService")
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleDao, SysUserRoleEntity> implements SysUserRoleService {

//    @Override
//    public PageUtils queryPage(Map<String, Object> params) {
//        String key = (String) params.get("key");
//        String value = (String) params.get("value");
//
//        EntityWrapper<SysUserRoleEntity> SysUserRoleEntityWrapper = new EntityWrapper<>();
//        if(!StringUtils.isBlank(key) && !StringUtils.isBlank(value)){
//                SysUserRoleEntityWrapper.eq(key,value);
//        }
//        Page<SysUserRoleEntity> page = this.selectPage(
//                new Query<SysUserRoleEntity>(params).getPage(),
//                SysUserRoleEntityWrapper
//        );
//
//        return new PageUtils(page);
//    }

}

package com.example.demo.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.sys.dao.SysRoleDao;
import com.example.demo.sys.entity.SysRoleEntity;
import com.example.demo.sys.service.SysRoleService;
import org.springframework.stereotype.Service;


@Service("sysRoleService")
public class SysRoleServiceImpl extends ServiceImpl<SysRoleDao, SysRoleEntity> implements SysRoleService {

//    @Override
//    public PageUtils queryPage(Map<String, Object> params) {
//        String key = (String) params.get("key");
//        String value = (String) params.get("value");
//
//        EntityWrapper<SysRoleEntity> SysRoleEntityWrapper = new EntityWrapper<>();
//        if(!StringUtils.isBlank(key) && !StringUtils.isBlank(value)){
//                SysRoleEntityWrapper.eq(key,value);
//        }
//        Page<SysRoleEntity> page = this.selectPage(
//                new Query<SysRoleEntity>(params).getPage(),
//                SysRoleEntityWrapper
//        );
//
//        return new PageUtils(page);
//    }

}

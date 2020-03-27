package com.example.demo.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.sys.dao.SysRoleMenuDao;
import com.example.demo.sys.entity.SysRoleMenuEntity;
import com.example.demo.sys.service.SysRoleMenuService;
import org.springframework.stereotype.Service;


@Service("sysRoleMenuService")
public class SysRoleMenuServiceImpl extends ServiceImpl<SysRoleMenuDao, SysRoleMenuEntity> implements SysRoleMenuService {

//    @Override
//    public PageUtils queryPage(Map<String, Object> params) {
//        String key = (String) params.get("key");
//        String value = (String) params.get("value");
//
//        EntityWrapper<SysRoleMenuEntity> SysRoleMenuEntityWrapper = new EntityWrapper<>();
//        if(!StringUtils.isBlank(key) && !StringUtils.isBlank(value)){
//                SysRoleMenuEntityWrapper.eq(key,value);
//        }
//        Page<SysRoleMenuEntity> page = this.selectPage(
//                new Query<SysRoleMenuEntity>(params).getPage(),
//                SysRoleMenuEntityWrapper
//        );
//
//        return new PageUtils(page);
//    }

}

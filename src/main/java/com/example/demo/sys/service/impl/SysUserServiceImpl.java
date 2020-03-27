package com.example.demo.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.sys.dao.SysUserDao;
import com.example.demo.sys.entity.SysUserEntity;
import com.example.demo.sys.service.SysUserService;
import org.springframework.stereotype.Service;


@Service("sysUserService")
public class SysUserServiceImpl extends ServiceImpl<SysUserDao, SysUserEntity> implements SysUserService {

//    @Override
//    public PageUtils queryPage(Map<String, Object> params) {
//        String key = (String) params.get("key");
//        String value = (String) params.get("value");
//
//        EntityWrapper<SysUserEntity> SysUserEntityWrapper = new EntityWrapper<>();
//        if(!StringUtils.isBlank(key) && !StringUtils.isBlank(value)){
//                SysUserEntityWrapper.eq(key,value);
//        }
//        Page<SysUserEntity> page = this.selectPage(
//                new Query<SysUserEntity>(params).getPage(),
//                SysUserEntityWrapper
//        );
//
//        return new PageUtils(page);
//    }

}

package com.example.demo.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.sys.dao.SysUserTokenDao;
import com.example.demo.sys.entity.SysUserTokenEntity;
import com.example.demo.sys.service.SysUserTokenService;
import org.springframework.stereotype.Service;


@Service("sysUserTokenService")
public class SysUserTokenServiceImpl extends ServiceImpl<SysUserTokenDao, SysUserTokenEntity> implements SysUserTokenService {

//    @Override
//    public PageUtils queryPage(Map<String, Object> params) {
//        String key = (String) params.get("key");
//        String value = (String) params.get("value");
//
//        EntityWrapper<SysUserTokenEntity> SysUserTokenEntityWrapper = new EntityWrapper<>();
//        if(!StringUtils.isBlank(key) && !StringUtils.isBlank(value)){
//                SysUserTokenEntityWrapper.eq(key,value);
//        }
//        Page<SysUserTokenEntity> page = this.selectPage(
//                new Query<SysUserTokenEntity>(params).getPage(),
//                SysUserTokenEntityWrapper
//        );
//
//        return new PageUtils(page);
//    }

}

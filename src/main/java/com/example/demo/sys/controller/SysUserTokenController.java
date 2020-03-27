//package com.example.demo.sys.controller;
//
//import java.util.Arrays;
//import java.util.Map;
//import java.util.Date;
//
//import org.apache.shiro.authz.annotation.RequiresPermissions;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import io.renren.modules.admin.entity.SysUserTokenEntity;
//import io.renren.modules.admin.service.SysUserTokenService;
//import io.renren.common.utils.PageUtils;
//import io.renren.common.utils.R;
//
//
//
///**
// * 系统用户Token
// *
// * @author chenshun
// * @email sunlightcs@gmail.com
// * @date 2020-03-27 15:21:01
// */
//@RestController
//@RequestMapping("admin/sysusertoken")
//public class SysUserTokenController {
//    @Autowired
//    private SysUserTokenService sysUserTokenService;
//
//    /**
//     * 列表
//     */
//    @RequestMapping("/list")
//    @RequiresPermissions("admin:sysusertoken:list")
//    public R list(@RequestParam Map<String, Object> params){
//        PageUtils page = sysUserTokenService.queryPage(params);
//
//        return R.ok().put("page", page);
//    }
//
//
//    /**
//     * 信息
//     */
//    @RequestMapping("/info/{userId}")
//    @RequiresPermissions("admin:sysusertoken:info")
//    public R info(@PathVariable("userId") Long userId){
//			SysUserTokenEntity sysUserToken = sysUserTokenService.selectById(userId);
//
//        return R.ok().put("sysUserToken", sysUserToken);
//    }
//
//    /**
//     * 保存
//     */
//    @RequestMapping("/save")
//    @RequiresPermissions("admin:sysusertoken:save")
//    public R save(@RequestBody SysUserTokenEntity sysUserToken){
//
//			sysUserTokenService.insert(sysUserToken);
//
//        return R.ok();
//    }
//
//    /**
//     * 修改
//     */
//    @RequestMapping("/update")
//    @RequiresPermissions("admin:sysusertoken:update")
//    public R update(@RequestBody SysUserTokenEntity sysUserToken){
//			sysUserTokenService.updateById(sysUserToken);
//
//        return R.ok();
//    }
//
//    /**
//     * 删除
//     */
//    @RequestMapping("/delete")
//    @RequiresPermissions("admin:sysusertoken:delete")
//    public R delete(@RequestBody Long[] userIds){
//			sysUserTokenService.deleteBatchIds(Arrays.asList(userIds));
//
//        return R.ok();
//    }
//
//}

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
//import io.renren.modules.admin.entity.SysUserEntity;
//import io.renren.modules.admin.service.SysUserService;
//import io.renren.common.utils.PageUtils;
//import io.renren.common.utils.R;
//
//
//
///**
// * 用户信息表
// *
// * @author chenshun
// * @email sunlightcs@gmail.com
// * @date 2020-03-26 15:15:56
// */
//@RestController
//@RequestMapping("admin/sysuser")
//public class SysUserController {
//    @Autowired
//    private SysUserService sysUserService;
//
//    /**
//     * 列表
//     */
//    @RequestMapping("/list")
//    @RequiresPermissions("admin:sysuser:list")
//    public R list(@RequestParam Map<String, Object> params){
//        PageUtils page = sysUserService.queryPage(params);
//
//        return R.ok().put("page", page);
//    }
//
//
//    /**
//     * 信息
//     */
//    @RequestMapping("/info/{userId}")
//    @RequiresPermissions("admin:sysuser:info")
//    public R info(@PathVariable("userId") String userId){
//			SysUserEntity sysUser = sysUserService.selectById(userId);
//
//        return R.ok().put("sysUser", sysUser);
//    }
//
//    /**
//     * 保存
//     */
//    @RequestMapping("/save")
//    @RequiresPermissions("admin:sysuser:save")
//    public R save(@RequestBody SysUserEntity sysUser){
//
//			sysUserService.insert(sysUser);
//
//        return R.ok();
//    }
//
//    /**
//     * 修改
//     */
//    @RequestMapping("/update")
//    @RequiresPermissions("admin:sysuser:update")
//    public R update(@RequestBody SysUserEntity sysUser){
//			sysUserService.updateById(sysUser);
//
//        return R.ok();
//    }
//
//    /**
//     * 删除
//     */
//    @RequestMapping("/delete")
//    @RequiresPermissions("admin:sysuser:delete")
//    public R delete(@RequestBody String[] userIds){
//			sysUserService.deleteBatchIds(Arrays.asList(userIds));
//
//        return R.ok();
//    }
//
//}

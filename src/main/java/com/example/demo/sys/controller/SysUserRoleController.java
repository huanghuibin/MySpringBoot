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
//import io.renren.modules.admin.entity.SysUserRoleEntity;
//import io.renren.modules.admin.service.SysUserRoleService;
//import io.renren.common.utils.PageUtils;
//import io.renren.common.utils.R;
//
//
//
///**
// * 用户和角色关联表
// *
// * @author chenshun
// * @email sunlightcs@gmail.com
// * @date 2020-03-26 15:15:56
// */
//@RestController
//@RequestMapping("admin/sysuserrole")
//public class SysUserRoleController {
//    @Autowired
//    private SysUserRoleService sysUserRoleService;
//
//    /**
//     * 列表
//     */
//    @RequestMapping("/list")
//    @RequiresPermissions("admin:sysuserrole:list")
//    public R list(@RequestParam Map<String, Object> params){
//        PageUtils page = sysUserRoleService.queryPage(params);
//
//        return R.ok().put("page", page);
//    }
//
//
//    /**
//     * 信息
//     */
//    @RequestMapping("/info/{userId}")
//    @RequiresPermissions("admin:sysuserrole:info")
//    public R info(@PathVariable("userId") String userId){
//			SysUserRoleEntity sysUserRole = sysUserRoleService.selectById(userId);
//
//        return R.ok().put("sysUserRole", sysUserRole);
//    }
//
//    /**
//     * 保存
//     */
//    @RequestMapping("/save")
//    @RequiresPermissions("admin:sysuserrole:save")
//    public R save(@RequestBody SysUserRoleEntity sysUserRole){
//
//			sysUserRoleService.insert(sysUserRole);
//
//        return R.ok();
//    }
//
//    /**
//     * 修改
//     */
//    @RequestMapping("/update")
//    @RequiresPermissions("admin:sysuserrole:update")
//    public R update(@RequestBody SysUserRoleEntity sysUserRole){
//			sysUserRoleService.updateById(sysUserRole);
//
//        return R.ok();
//    }
//
//    /**
//     * 删除
//     */
//    @RequestMapping("/delete")
//    @RequiresPermissions("admin:sysuserrole:delete")
//    public R delete(@RequestBody String[] userIds){
//			sysUserRoleService.deleteBatchIds(Arrays.asList(userIds));
//
//        return R.ok();
//    }
//
//}

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
//import io.renren.modules.admin.entity.SysRoleEntity;
//import io.renren.modules.admin.service.SysRoleService;
//import io.renren.common.utils.PageUtils;
//import io.renren.common.utils.R;
//
//
//
///**
// * 角色信息表
// *
// * @author chenshun
// * @email sunlightcs@gmail.com
// * @date 2020-03-26 15:15:56
// */
//@RestController
//@RequestMapping("admin/sysrole")
//public class SysRoleController {
//    @Autowired
//    private SysRoleService sysRoleService;
//
//    /**
//     * 列表
//     */
//    @RequestMapping("/list")
//    @RequiresPermissions("admin:sysrole:list")
//    public R list(@RequestParam Map<String, Object> params){
//        PageUtils page = sysRoleService.queryPage(params);
//
//        return R.ok().put("page", page);
//    }
//
//
//    /**
//     * 信息
//     */
//    @RequestMapping("/info/{roleId}")
//    @RequiresPermissions("admin:sysrole:info")
//    public R info(@PathVariable("roleId") String roleId){
//			SysRoleEntity sysRole = sysRoleService.selectById(roleId);
//
//        return R.ok().put("sysRole", sysRole);
//    }
//
//    /**
//     * 保存
//     */
//    @RequestMapping("/save")
//    @RequiresPermissions("admin:sysrole:save")
//    public R save(@RequestBody SysRoleEntity sysRole){
//
//			sysRoleService.insert(sysRole);
//
//        return R.ok();
//    }
//
//    /**
//     * 修改
//     */
//    @RequestMapping("/update")
//    @RequiresPermissions("admin:sysrole:update")
//    public R update(@RequestBody SysRoleEntity sysRole){
//			sysRoleService.updateById(sysRole);
//
//        return R.ok();
//    }
//
//    /**
//     * 删除
//     */
//    @RequestMapping("/delete")
//    @RequiresPermissions("admin:sysrole:delete")
//    public R delete(@RequestBody String[] roleIds){
//			sysRoleService.deleteBatchIds(Arrays.asList(roleIds));
//
//        return R.ok();
//    }
//
//}

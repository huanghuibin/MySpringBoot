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
//import io.renren.modules.admin.entity.SysRoleMenuEntity;
//import io.renren.modules.admin.service.SysRoleMenuService;
//import io.renren.common.utils.PageUtils;
//import io.renren.common.utils.R;
//
//
//
///**
// * 角色和菜单关联表
// *
// * @author chenshun
// * @email sunlightcs@gmail.com
// * @date 2020-03-26 15:15:56
// */
//@RestController
//@RequestMapping("admin/sysrolemenu")
//public class SysRoleMenuController {
//    @Autowired
//    private SysRoleMenuService sysRoleMenuService;
//
//    /**
//     * 列表
//     */
//    @RequestMapping("/list")
//    @RequiresPermissions("admin:sysrolemenu:list")
//    public R list(@RequestParam Map<String, Object> params){
//        PageUtils page = sysRoleMenuService.queryPage(params);
//
//        return R.ok().put("page", page);
//    }
//
//
//    /**
//     * 信息
//     */
//    @RequestMapping("/info/{roleId}")
//    @RequiresPermissions("admin:sysrolemenu:info")
//    public R info(@PathVariable("roleId") String roleId){
//			SysRoleMenuEntity sysRoleMenu = sysRoleMenuService.selectById(roleId);
//
//        return R.ok().put("sysRoleMenu", sysRoleMenu);
//    }
//
//    /**
//     * 保存
//     */
//    @RequestMapping("/save")
//    @RequiresPermissions("admin:sysrolemenu:save")
//    public R save(@RequestBody SysRoleMenuEntity sysRoleMenu){
//
//			sysRoleMenuService.insert(sysRoleMenu);
//
//        return R.ok();
//    }
//
//    /**
//     * 修改
//     */
//    @RequestMapping("/update")
//    @RequiresPermissions("admin:sysrolemenu:update")
//    public R update(@RequestBody SysRoleMenuEntity sysRoleMenu){
//			sysRoleMenuService.updateById(sysRoleMenu);
//
//        return R.ok();
//    }
//
//    /**
//     * 删除
//     */
//    @RequestMapping("/delete")
//    @RequiresPermissions("admin:sysrolemenu:delete")
//    public R delete(@RequestBody String[] roleIds){
//			sysRoleMenuService.deleteBatchIds(Arrays.asList(roleIds));
//
//        return R.ok();
//    }
//
//}

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
//import io.renren.modules.admin.entity.SysMenuEntity;
//import io.renren.modules.admin.service.SysMenuService;
//import io.renren.common.utils.PageUtils;
//import io.renren.common.utils.R;
//
//
//
///**
// * 菜单权限表
// *
// * @author chenshun
// * @email sunlightcs@gmail.com
// * @date 2020-03-26 15:15:56
// */
//@RestController
//@RequestMapping("admin/sysmenu")
//public class SysMenuController {
//    @Autowired
//    private SysMenuService sysMenuService;
//
//    /**
//     * 列表
//     */
//    @RequestMapping("/list")
//    @RequiresPermissions("admin:sysmenu:list")
//    public R list(@RequestParam Map<String, Object> params){
//        PageUtils page = sysMenuService.queryPage(params);
//
//        return R.ok().put("page", page);
//    }
//
//
//    /**
//     * 信息
//     */
//    @RequestMapping("/info/{menuId}")
//    @RequiresPermissions("admin:sysmenu:info")
//    public R info(@PathVariable("menuId") String menuId){
//			SysMenuEntity sysMenu = sysMenuService.selectById(menuId);
//
//        return R.ok().put("sysMenu", sysMenu);
//    }
//
//    /**
//     * 保存
//     */
//    @RequestMapping("/save")
//    @RequiresPermissions("admin:sysmenu:save")
//    public R save(@RequestBody SysMenuEntity sysMenu){
//
//			sysMenuService.insert(sysMenu);
//
//        return R.ok();
//    }
//
//    /**
//     * 修改
//     */
//    @RequestMapping("/update")
//    @RequiresPermissions("admin:sysmenu:update")
//    public R update(@RequestBody SysMenuEntity sysMenu){
//			sysMenuService.updateById(sysMenu);
//
//        return R.ok();
//    }
//
//    /**
//     * 删除
//     */
//    @RequestMapping("/delete")
//    @RequiresPermissions("admin:sysmenu:delete")
//    public R delete(@RequestBody String[] menuIds){
//			sysMenuService.deleteBatchIds(Arrays.asList(menuIds));
//
//        return R.ok();
//    }
//
//}

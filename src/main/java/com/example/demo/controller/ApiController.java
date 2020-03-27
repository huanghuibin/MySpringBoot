package com.example.demo.controller;

import com.example.demo.annotation.Check;
import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/3/6
 * Time:17:04
 */
@RestController
@AllArgsConstructor
public class ApiController {

    private UserService userService;


    @RequestMapping("/test")
    @RequiresPermissions("user:create")
    public String test(){
//        userService.save();
        return "hello world";
    }
}

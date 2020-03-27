package com.example.demo.common.exception;

import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/3/26
 * Time:16:39
 */
@RestControllerAdvice
public class GlobalException {
    @ExceptionHandler(AuthorizationException.class)
    public String handleAuthorizationException(AuthorizationException e){
        System.out.println(e.getMessage());
        return "没有权限，请联系管理员授权";
    }

}

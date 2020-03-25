package com.example.demo.annotation;

import java.lang.annotation.*;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/3/6
 * Time:17:08
 */
@Target({ElementType.PARAMETER,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Check {
    String[] params();
}


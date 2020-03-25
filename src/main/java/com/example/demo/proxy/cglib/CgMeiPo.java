package com.example.demo.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/3/13
 * Time:14:09
 */
public class CgMeiPo implements MethodInterceptor {


    // 获得被代理人的资料
    public Object getInstance(Object obj) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(obj.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("媒婆开始帮忙找了");
        methodProxy.invokeSuper(o, objects);
        System.out.println("媒婆照完了");
        return null;
    }
}

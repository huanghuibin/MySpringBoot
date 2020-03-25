package com.example.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/3/11
 * Time:15:38
 */
public class MeiPo implements InvocationHandler {

    private Person target;

    public Object getInStance(Person target) {
        this.target = target;
        Class clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始寻找");
        this.target.findLove();
        return null;
    }
}

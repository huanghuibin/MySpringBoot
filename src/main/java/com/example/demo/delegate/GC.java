package com.example.demo.delegate;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/3/18
 * Time:16:02
 */
public class GC implements IExecutor {
    @Override
    public void doSomething(String param) {
        System.out.println("格聪做事情");
    }
}

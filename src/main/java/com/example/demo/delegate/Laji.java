package com.example.demo.delegate;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/3/18
 * Time:16:02
 */
public class Laji implements IExecutor {
    @Override
    public void doSomething(String param) {
        System.out.println("laji 做事情");
    }
}

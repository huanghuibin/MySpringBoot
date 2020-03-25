package com.example.demo.countdownlatch;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/3/19
 * Time:9:57
 */

/**
 * 饿汉式 线程安全
 */
public class Singleton1 {
    private Singleton1(){}
    private static Singleton1 singleton = new Singleton1();
    public static Singleton1 getInstance(){
        return singleton;
    }
}

package com.example.demo.countdownlatch;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/3/19
 * Time:9:57
 */

/**
 * 懒汉式，线程问题
 */
public class Singleton {
    private Singleton(){}
    private static  Singleton singleton;
    public static Singleton getInstance(){
        if (null == singleton) {
            singleton = new Singleton();
        }
        return singleton;
    }
}

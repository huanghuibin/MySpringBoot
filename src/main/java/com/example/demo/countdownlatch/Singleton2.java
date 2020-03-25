package com.example.demo.countdownlatch;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/3/19
 * Time:9:57
 */

/**
 * 双重校验所 线程安全
 */
public class Singleton2 {
    private Singleton2(){}
    private static Singleton2 singleton;
    public static Singleton2 getInstance(){
        if (null == singleton ){
            synchronized (Singleton2.class){
                if (null == singleton ){
                    singleton = new Singleton2();
                }
            }
        }
        return singleton;
    }
}

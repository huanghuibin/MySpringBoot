package com.example.demo.countdownlatch;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/3/19
 * Time:9:57
 */

/**
 *  枚举 线程安全
 */
public enum  Singleton4 {
    INSTANCE;
    public static Singleton4 getInstance(){
        return Singleton4.INSTANCE;
    }
}

package com.example.demo.countdownlatch;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/3/19
 * Time:9:57
 */

/**
 *  静态内部类 线程安全
 */
public class Singleton3 {
    private Singleton3(){}
    private  static  class Sing {
        private final static Singleton3 singleton =  new Singleton3();

    }

    public static Singleton3 getInstance(){
        return Sing.singleton;
    }
}

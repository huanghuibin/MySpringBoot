package com.example.demo.factory.normolFactory;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/3/18
 * Time:14:37
 */
public class Ttest {
    public static void main(String[] args) {
        Factory factory = new AFactory();
        factory.create().name();
    }
}

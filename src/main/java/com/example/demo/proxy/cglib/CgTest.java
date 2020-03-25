package com.example.demo.proxy.cglib;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/3/13
 * Time:14:13
 */
public class CgTest {
    public static void main(String[] args) {
        Laughing instance = (Laughing) new CgMeiPo().getInstance(new Laughing());
        instance.findLove();
    }
}

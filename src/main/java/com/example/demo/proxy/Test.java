package com.example.demo.proxy;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/3/11
 * Time:15:39
 */
public class Test {
    public static void main(String[] args) {
        Person inStance = (Person) new MeiPo().getInStance(new Laji());
        inStance.findLove();
        System.out.println(inStance);
    }
}

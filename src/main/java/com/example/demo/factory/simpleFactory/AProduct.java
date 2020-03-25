package com.example.demo.factory.simpleFactory;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/3/18
 * Time:14:21
 */
public class AProduct implements  InterfaceFactory{
    @Override
    public void name() {
        System.out.println("A");
    }
}

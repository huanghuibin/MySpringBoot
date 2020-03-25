package com.example.demo.factory.simpleFactory;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/3/18
 * Time:14:27
 */
public class FactoryTest {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        InterfaceFactory a = simpleFactory.create("A");
        a.name();
    }
}

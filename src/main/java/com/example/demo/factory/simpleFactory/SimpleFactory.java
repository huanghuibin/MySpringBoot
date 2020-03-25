package com.example.demo.factory.simpleFactory;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/3/18
 * Time:14:20
 */
public class SimpleFactory {
    public InterfaceFactory create(String name) {
        switch (name) {
            case "A":
                return new AProduct();
            case "B":
                return new BProduct();
            default:
                System.out.println("输入有误");
                return null;
        }
    }
}

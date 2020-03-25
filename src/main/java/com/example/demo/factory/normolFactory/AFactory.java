package com.example.demo.factory.normolFactory;

import com.example.demo.factory.simpleFactory.AProduct;
import com.example.demo.factory.simpleFactory.InterfaceFactory;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/3/18
 * Time:14:34
 */
public class AFactory implements Factory {
    @Override
    public InterfaceFactory create() {
        return new AProduct();
    }
}

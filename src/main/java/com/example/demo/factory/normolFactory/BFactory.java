package com.example.demo.factory.normolFactory;

import com.example.demo.factory.simpleFactory.BProduct;
import com.example.demo.factory.simpleFactory.InterfaceFactory;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/3/18
 * Time:14:35
 */
public class BFactory implements Factory {
    @Override
    public InterfaceFactory create() {
        return new BProduct();
    }
}

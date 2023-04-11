package com.chen.pattern.factory.abstract_factory;

/**
 * @Author:ChenYueAn
 * @Date: 2023/4/11  16:59
 * @Description:
 * @Version 1.0
 */
public class MeiShiFactory implements Factory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public TianDian createTianDian() {
        return new MoChaMuSi();
    }
}

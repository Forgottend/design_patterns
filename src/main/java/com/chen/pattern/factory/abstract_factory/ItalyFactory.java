package com.chen.pattern.factory.abstract_factory;

/**
 * @Author:ChenYueAn
 * @Date: 2023/4/11  17:01
 * @Description:
 * @Version 1.0
 */
public class ItalyFactory implements Factory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public TianDian createTianDian() {
        return new TiLaMiSu();
    }
}

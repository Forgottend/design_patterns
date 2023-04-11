package com.chen.pattern.factory.factory_method;

/**
 * @Author:ChenYueAn
 * @Date: 2023/4/11  15:01
 * @Description:
 * @Version 1.0
 */
public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}

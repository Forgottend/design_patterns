package com.chen.pattern.factory.factory_method;

/**
 * @Author:ChenYueAn
 * @Date: 2023/4/11  14:58
 * @Description:美式咖啡工厂对象
 * @Version 1.0
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {

        return new AmericanCoffee();

    }
}

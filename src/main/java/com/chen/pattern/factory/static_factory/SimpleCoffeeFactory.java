package com.chen.pattern.factory.static_factory;

/**
 * @Author:ChenYueAn
 * @Date: 2023/4/11  14:33
 * @Description: 简单咖啡工厂类
 * @Version 1.0
 */
public class SimpleCoffeeFactory {
    public static Coffee createCoffee(String type){
        //声明Coffee类型的变量，根据不同类型创建不同的咖啡子类对象
        Coffee coffee = null;
        if("american".equals(type)){
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)){
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，您所点的咖啡种类不存在");
        }


        return coffee;
    }
}

package com.chen.pattern.factory.simple_factory;

/**
 * @Author:ChenYueAn
 * @Date: 2023/4/11  14:11
 * @Description:
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //1.创建咖啡店类
        CoffeeStore coffeeStore = CoffeeStore.getInstance();
        //2.获取咖啡
        Coffee coffee = coffeeStore.orderCoffee("american");
        System.out.println(coffee);
        System.out.println(coffee.getName());
        Coffee coffee1 = coffeeStore.orderCoffee("latte");
        System.out.println(coffee1);
        System.out.println(coffee1.getName());
    }
}

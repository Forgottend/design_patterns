package com.chen.pattern.factory.factory_method;

/**
 * @Author:ChenYueAn
 * @Date: 2023/4/11  15:07
 * @Description:
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建咖啡店对象
        CoffeeStore coffeeStore = new CoffeeStore(new AmericanCoffeeFactory());
        Coffee coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getName());
        System.out.println(coffee);
    }
}

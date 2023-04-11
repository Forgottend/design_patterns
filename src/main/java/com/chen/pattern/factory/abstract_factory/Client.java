package com.chen.pattern.factory.abstract_factory;

/**
 * @Author:ChenYueAn
 * @Date: 2023/4/11  17:05
 * @Description:
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStory coffeeStory = CoffeeStory.getCoffeeStory();
        coffeeStory.setFactory(new ItalyFactory());
        Coffee coffee = coffeeStory.orderCoffee();
        System.out.println(coffee.getName());
        TianDian tianDian = coffeeStory.orderTianDian();
        System.out.println(tianDian.getName());

    }
}

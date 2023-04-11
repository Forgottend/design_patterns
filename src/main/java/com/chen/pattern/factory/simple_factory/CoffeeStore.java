package com.chen.pattern.factory.simple_factory;

/**
 * @Author:ChenYueAn
 * @Date: 2023/4/11  14:07
 * @Description:
 * @Version 1.0
 */
public class CoffeeStore {
    private CoffeeStore(){}
    private static CoffeeStore coffeeStore = new CoffeeStore();
    public static CoffeeStore  getInstance(){
        return coffeeStore;
    }
    public Coffee orderCoffee(String type){
        SimpleCoffeeFactory simpleCoffeeFactory = new SimpleCoffeeFactory();
        //调用生产咖啡对象
        Coffee coffee = simpleCoffeeFactory.createCoffee(type);
        //加配料
        coffee.addMilk();
        coffee.addMilk();

        return coffee;
    }
}

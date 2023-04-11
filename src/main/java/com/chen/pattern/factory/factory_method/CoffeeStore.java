package com.chen.pattern.factory.factory_method;

/**
 * @Author:ChenYueAn
 * @Date: 2023/4/11  14:07
 * @Description:
 * @Version 1.0
 */
public class CoffeeStore {
    private CoffeeStore(){}
    private CoffeeFactory coffeeFactory;

    private static CoffeeStore coffeeStore = new CoffeeStore();

    public CoffeeStore(CoffeeFactory factory) {
        this.coffeeFactory = factory;
    }
    public static CoffeeStore  getInstance(){
        return coffeeStore;
    }
    public Coffee orderCoffee(){
        Coffee coffee = coffeeFactory.createCoffee();
        //加配料
        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}

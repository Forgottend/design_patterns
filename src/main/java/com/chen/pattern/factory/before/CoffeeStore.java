package com.chen.pattern.factory.before;

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
        //声明Coffee类型的变量，根据不同类型创建不同的咖啡子类对象
        Coffee coffee = null;
        if("american".equals(type)){
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)){
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，您所点的咖啡种类不存在");
        }
        //加配料
        coffee.addMilk();
        coffee.addMilk();

        return coffee;
    }
}

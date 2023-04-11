package com.chen.pattern.factory.abstract_factory;

/**
 * @Author:ChenYueAn
 * @Date: 2023/4/11  17:01
 * @Description:
 * @Version 1.0
 */
public class CoffeeStory {
    private CoffeeStory(){}
    private static CoffeeStory coffeeStory = new CoffeeStory();
    public static CoffeeStory getCoffeeStory(){
        return coffeeStory;
    }
    private Factory factory;
    public void setFactory(Factory factory){
        this.factory = factory;
    }
    //点咖啡
    public Coffee orderCoffee(){
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
    //点甜点
    public TianDian orderTianDian(){
        return factory.createTianDian();
    }

}

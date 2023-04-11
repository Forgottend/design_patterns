package com.chen.pattern.factory.simple_factory;

/**
 * @Author:ChenYueAn
 * @Date: 2023/4/11  14:03
 * @Description:咖啡类
 * @Version 1.0
 */
public abstract class Coffee {
    public abstract String getName();
    //加糖
    public void addSugar(){
        System.out.println("加糖");
    }
    //加奶
    public void addMilk(){
        System.out.println("加奶");
    }
}

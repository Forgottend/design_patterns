package com.chen.pattern.factory.factory_method;

/**
 * @Author:ChenYueAn
 * @Date: 2023/4/11  14:57
 * @Description: 工厂抽象类
 * @Version 1.0
 */
public interface CoffeeFactory {
    //创建咖啡对象的方法
    Coffee createCoffee();
}

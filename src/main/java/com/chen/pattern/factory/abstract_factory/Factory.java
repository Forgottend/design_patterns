package com.chen.pattern.factory.abstract_factory;

/**
 * @Author:ChenYueAn
 * @Date: 2023/4/11  16:57
 * @Description:
 * @Version 1.0
 */
public interface Factory {
    //生产咖啡
    Coffee createCoffee();
    //生产甜点
    TianDian createTianDian();
}

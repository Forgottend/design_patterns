package com.chen.pattern.singleton.demo1;

/**
 * @Author:ChenYueAn
 * @Date: 2023/4/10  15:23
 * @Description:饿汉式：静态成员变量
 * @Version 1.0
 */
public class Singleton {
    //1.私有构造方法
    private Singleton(){}

    //2.在本类中创建该类对象
    private static Singleton instance = new Singleton();

    //3.提供一个公共的访问方式，让外界获取该对象
    public static Singleton getInstance(){
        return instance;
    }
}

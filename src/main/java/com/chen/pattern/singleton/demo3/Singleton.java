package com.chen.pattern.singleton.demo3;

/**
 * @Author:ChenYueAn
 * @Date: 2023/4/10  15:54
 * @Description:懒汉式：线程不安全
 * @Version 1.0
 */
public class Singleton {
    //1.私有构造方法
    private Singleton(){}

    //2.声明本类型变量
    private static Singleton instance;

    //3.对外提供访问方式
    public static synchronized Singleton getInstance(){//加锁保证线程安全，但是性能会大大降低
        //首先判断对象是否为null，为null则创建，不为null则说明创建过了，直接返回，但是线程不安全
        if (instance==null){

            instance = new Singleton();
        }
        return instance;
    }
}

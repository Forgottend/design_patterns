package com.chen.pattern.singleton.demo2;

/**
 * @Author:ChenYueAn
 * @Date: 2023/4/10  15:34
 * @Description:饿汉式 静态代码块
 * @Version 1.0
 */
public class Singleton {
    //1.私有构造方法
    private Singleton(){}
    //声明Singleton类型的变量
    private static Singleton instance; //null

    //在静态代码块中进行赋值
    static {
        instance = new Singleton();
    }
    //对外提供获取该类对象的方法
    public static Singleton getInstance(){
        return instance;
    }
}

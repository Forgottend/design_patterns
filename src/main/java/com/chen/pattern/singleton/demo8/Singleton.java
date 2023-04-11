package com.chen.pattern.singleton.demo8;

/**
 * @Author:ChenYueAn
 * @Date: 2023/4/10  18:05
 * @Description:
 * @Version 1.0
 */
public class Singleton {
    //私有构造方法
    private Singleton() {
    }

    //定义一个静态内部类
    //定义一个静态内部类
    private static class SingletonHolder {
        private static final Singleton instance = new Singleton();
    }

    //提供公共的访问方式
    public static Singleton getInstance() {
        return Singleton.SingletonHolder.instance;
    }
}

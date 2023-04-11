package com.chen.pattern.singleton.demo7;

import java.io.Serializable;

/**
 * @Author:ChenYueAn
 * @Date: 2023/4/10  17:44
 * @Description:
 * @Version 1.0
 */
public class Singleton implements Serializable {
    //私有构造方法
    private Singleton(){}

    //定义一个静态内部类
    //定义一个静态内部类
    private static class SingletonHolder{
        private static final Singleton instance = new Singleton();
    }
    //提供公共的访问方式
    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }

    //当进行反序列化时，会自动调用该方法，将该方法的返回值直接返回
    public Object readResolve(){
        return SingletonHolder.instance;
    }
}

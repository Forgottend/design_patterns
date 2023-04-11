package com.chen.pattern.singleton.demo8;

import java.lang.reflect.Constructor;

/**
 * @Author:ChenYueAn
 * @Date: 2023/4/10  18:06
 * @Description:通过反射破解单例模式
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) throws Exception {
        //1.获取class对象
        Class clazz = Singleton.class;
        //2.通过反射获取无参构造方fa
        Constructor constructors = clazz.getDeclaredConstructor();
        //3.取消访问检查
        constructors.setAccessible(true);
        //4.创建对象
        Singleton instance = (Singleton) constructors.newInstance();
        Singleton instance2 = (Singleton) constructors.newInstance();
        System.out.println(instance==instance2);

    }
}

package com.chen.pattern.singleton.demo2;


/**
 * @Author:ChenYueAn
 * @Date: 2023/4/10  15:43
 * @Description:
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //1.创建singleton类的对象
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        //判断两个对象是否是同一对象
        System.out.println(instance==instance1);
    }
}

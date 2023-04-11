package com.chen.pattern.singleton.demo6;

/**
 * @Author:ChenYueAn
 * @Date: 2023/4/10  17:40
 * @Description:
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance==instance2);
    }


}

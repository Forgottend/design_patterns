package com.chen.pattern.singleton.demo4;

/**
 * @Author:ChenYueAn
 * @Date: 2023/4/10  16:21
 * @Description: 双重检查锁保证线程安全和性能
 * @Version 1.0
 */
public class Singleton {
    //1.私有构造方法
    private Singleton(){}
    //2.创建变量
    private static volatile Singleton instance;
    //3.提供访问方法
    public static Singleton getInstance(){
        if (instance ==null){//将锁放入if判断内部，这样当对象创建后就不需要每次都去抢锁，提高性能
            //由于先判断所有存在多线性的情况，所有要再加锁来保证只要一个线程能创建对象，所以获取到锁之后再次判断，双重检查既保证了线程安全，又提高了性能
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

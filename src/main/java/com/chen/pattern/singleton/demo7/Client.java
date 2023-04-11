package com.chen.pattern.singleton.demo7;

import java.io.*;

/**
 * @Author:ChenYueAn
 * @Date: 2023/4/10  17:47
 * @Description: 通过序列化破解单例模式
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) throws Exception {
        //writeObjectToFile();
        readObjectFromFile();
        readObjectFromFile();

    }
    //从文件中读取数据
    public static void readObjectFromFile() throws Exception {
        //1.创建文件输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\cya\\Desktop\\a.txt"));
        //2.读取对象
        Singleton instance = (Singleton) ois.readObject();
        System.out.println(instance);
 //       Thread.sleep(1000);
//        Singleton instance2 = (Singleton) ois.readObject();
//        System.out.println(instance==instance2);
        //关闭资源
        ois.close();
    }
    //向文件中写数据
    public static void writeObjectToFile() throws IOException {
        //1.获取singleton对象
        Singleton instance = Singleton.getInstance();
        //2.创建输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\cya\\Desktop\\a.txt"));
        //3.写对象
        oos.writeObject(instance);
        //4.释放资源
        oos.close();
    }
}

package com.chen.principles.demo1;

/**
 * @Author:ChenYueAn
 * @Date: 2023/4/7  12:27
 * @Description:
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //1.创建搜狗输入法对象
        SougouInput input = new SougouInput();
        //2.创建皮肤对象
        DefaultSkin skin = new DefaultSkin();
        //3.将皮肤设置到输入法中
        input.setSkin(skin);
        //4.显示皮肤
        input.display();
        //这样我们需要新的皮肤的时候只需要加即可，而不需要改变原本的代码
    }
}

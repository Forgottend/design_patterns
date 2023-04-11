package com.chen.principles.demo1;

/**
 * @Author:ChenYueAn
 * @Date: 2023/4/7  12:19
 * @Description:
 * @Version 1.0
 */
public class SougouInput {
    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }
    public void display(){
        skin.display();
    }
}

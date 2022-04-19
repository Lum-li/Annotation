package com.itheima.bean;

import org.springframework.stereotype.Component;

@Component("mouse")
public class Mouse {
    public void eat(){
        System.out.println("Mouse+eat");
    }
}

package com.itheima.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

//@Component
@Data
//如果用到CartonProperties就生成bean对象
@EnableConfigurationProperties(CartonProperties.class)
public class CartonCatandMouse {
    private  Cat cat;
    private  Mouse mouse;
    private CartonProperties cartonProperties;


    public CartonCatandMouse(CartonProperties cartonProperties) {
//      这里设计自动注入的问题CartonProperties必须在bean中注入不然会找不到bean对象
        this.cartonProperties=cartonProperties;
         cat =new Cat();
         mouse=new Mouse();
         cat.setAge(4);
         cat.setName( (cartonProperties.getCat()!=null &&!cartonProperties.getCat().getName().equals("")) ?cartonProperties.getCat().getName() : "tom");
         mouse.setAge(3);
         mouse.setName("jerry");

    }

    public void play(){
        System.out.println(cat.getName()+cat.getAge()+"抓到了"+mouse.getName()+mouse.getAge());
    }
}

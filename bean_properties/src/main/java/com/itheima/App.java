package com.itheima;

import com.itheima.bean.CartonCatandMouse;
import com.itheima.bean.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

@Import(CartonCatandMouse.class)
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        try (ConfigurableApplicationContext ctx = SpringApplication.run(App.class)) {
            CartonCatandMouse caton = (CartonCatandMouse)ctx.getBean(CartonCatandMouse.class);
            caton.play();

            for (String name : ctx.getBeanDefinitionNames()) {
                if(name.equals("test")){
                    Test t = ctx.getBean(Test.class);
                    System.out.println(name);
                    t.test();
                }
            }




        }
    }
}

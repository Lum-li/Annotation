package com.itheima;

import com.itheima.bean.Mouse;
import com.itheima.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Bean {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext这个方法不需要用注解去注释SpringConfig类，可以自己将类注入到容器里面
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        for (String name : context.getBeanDefinitionNames()) {
            System.out.println(name);
            if(name.equals("mouse")){
                Mouse mouse = (Mouse) context.getBean("mouse");
                mouse.eat();
            }
        }

    }
}

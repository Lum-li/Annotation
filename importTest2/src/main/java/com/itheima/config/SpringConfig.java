package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.bean.Cat;
import com.itheima.bean.MYImportSelector;
import com.itheima.bean.Mouse;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

//@Import({MYImportSelector.class, Mouse.class})
//@Import(Mouse.class)/
///这个注解加载的全路径名 com.itheima.bean.Mouse

@ComponentScan("com.itheima")
public class SpringConfig {
    @Bean
//    有这个类就执行后面
//    @ConditionalOnClass(name="com.itheima.bean.Mouse")
//    @ConditionalOnClass(Mouse.class)
//    没有这个类就执行注意是类不是bean名
//    @ConditionalOnMissingClass("com.itheima.bean.Dog")
    @ConditionalOnBean(name="jerry")
    public Cat tom (){
        return new Cat();
    }

    @Bean
//    创建数据库bean对象的时候的时候判断有没有用到数据库
    @ConditionalOnClass(name="com.mysql.jdbc.Driver")
    public DruidDataSource dataSource(){
        return  new DruidDataSource();
    }

}

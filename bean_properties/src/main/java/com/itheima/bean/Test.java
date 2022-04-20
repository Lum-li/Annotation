package com.itheima.bean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.stereotype.Component;

//@ConditionalOnClass(name="import org.springframework.data.redis.core.RedisOperations")
//@ConditionalOnClass({RedisOperations.class})
//@Component("test")
public class Test {
    private String name ;
    private  int age;
    public void test(){
        System.out.println("test");
    }
}

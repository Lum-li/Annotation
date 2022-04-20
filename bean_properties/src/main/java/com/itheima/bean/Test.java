package com.itheima.bean;

import cn.itcast.service.ItCountService;
import org.springframework.beans.factory.annotation.Autowired;

//@ConditionalOnClass(name="import org.springframework.data.redis.core.RedisOperations")
//@ConditionalOnClass({RedisOperations.class})
//@Component("test")
public class Test {
    private String name ;
    private  int age;
    public void test(){
        System.out.println("test");
    }

    @Autowired
    private ItCountService itCountService;
}

package com.itheima.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@Component
@Data
//@ConfigurationProperties这个注解扫描注解去获取参数，被扫描的类必须是在bean中注入
@ConfigurationProperties(prefix = "carton")
public class CartonProperties {
    private Cat cat;
    private Mouse mouse;
}

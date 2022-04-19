package com.itheima.config;

import com.itheima.bean.MYImportSelector;
import com.itheima.bean.Mouse;
import org.springframework.context.annotation.Import;

@Import({MYImportSelector.class, Mouse.class})
public class SpringConfig {
}

package com.itheima.bean;

import org.springframework.core.type.AnnotationMetadata;

public class MYImportSelector implements org.springframework.context.annotation.ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {

        try {
//            获取class不用注入容器只要有这个类就行
            Class<?> clazz = Class.forName("com.itheima.bean.Cat");
            if(clazz !=null)
            return new String[]{"com.itheima.bean.Cat"};
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return null;
    }



}

package com.example.springboot;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @description:
 * @author: zxl
 * @create: 2020-10-20 15:47
 **/
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{MyImportBean.class.getName()};
    }


}
class MyImportBean {
    public MyImportBean() {
        System.out.println("@MyImport //注解开关");
    }

    public void setName(String name) {
        System.out.println(name);
    }


}
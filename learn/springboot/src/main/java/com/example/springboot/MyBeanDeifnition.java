package com.example.springboot;

import org.springframework.context.annotation.Import;

/**
 * @description:
 * @author: zxl
 * @create: 2020-10-20 16:16
 **/
@Import(MyImportBeanDefinitionRegistrar.class)
public @interface MyBeanDeifnition {
}

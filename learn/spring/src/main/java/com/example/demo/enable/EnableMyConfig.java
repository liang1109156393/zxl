package com.example.demo.enable;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @description:
 * @author: zxl
 * @create: 2020-09-22 14:22
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({MyConfiguration.class,HelloWorldImportSelector.class})
public @interface EnableMyConfig {
}

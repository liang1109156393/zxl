package com.frame.springboot;

/**
 * @description:
 * @author: zxl
 * @create: 2020-10-20 13:49
 **/
public class SimpleBean {

    public String getName(String name){
        System.out.println(name+"spring.factories自动装配");
        return name ;
    }
}

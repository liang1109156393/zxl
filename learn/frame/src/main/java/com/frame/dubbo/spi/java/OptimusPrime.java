package com.frame.dubbo.spi.java;
/**
 * @description:
 * @author: zxl
 * @create: 2020-10-26 09:15
 **/
public class OptimusPrime implements Robot {

    private String name ;
    @Override
    public void sayHello() {
        System.out.println("Hello, I am Optimus Prime.");
    }
    public void setName(String name ) {
        this.name = name ;
    }
}

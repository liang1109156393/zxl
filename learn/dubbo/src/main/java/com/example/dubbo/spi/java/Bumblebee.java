package com.example.dubbo.spi.java;

/**
 * @description:
 * @author: zxl
 * @create: 2020-10-26 09:15
 **/
public class Bumblebee implements Robot {

    @Override
    public void sayHello() {
        System.out.println("Hello, I am Bumblebee.");
    }
}


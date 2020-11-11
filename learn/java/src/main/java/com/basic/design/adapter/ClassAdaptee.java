package com.basic.design.adapter;

/**
 * @description:适配者
 * @author: zxl
 * @create: 2020-11-11 13:14
 **/
public class ClassAdaptee {

    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.adaptee();
    }

    public void adaptee() {
        System.out.println("=====");
    }
}

/**
 * @description: 类适配器
 * @author: zxl
 * @create: 2020-11-11 13:15
 **/

class Adapter extends ClassAdaptee implements Target {
    @Override
    public void say() {
        adaptee();
    }
}

/**
 * @description: 目标接口
 * @author: zxl
 * @create: 2020-11-11 13:13
 **/
interface Target {
    void say();
}
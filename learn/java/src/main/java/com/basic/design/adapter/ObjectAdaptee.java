package com.basic.design.adapter;

/**
 * @description: 对象适配器
 * @author: zxl
 * @create: 2020-11-11 13:37
 **/
public class ObjectAdaptee {
    public void request() {

    }
}

interface ObjectTarget {
    void say();
}

class ObjectAdapter implements ObjectTarget {
    private ObjectAdaptee adaptee;

    public ObjectAdapter(ObjectAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void say() {
        System.out.println("ddddddddddd");
        adaptee.request();
    }
}
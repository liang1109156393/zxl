package com.basic.design.factory;

/**
 * @description: 在工厂方法的基础上，工厂中创建同簇的多个产品对象(许多产品)
 * @author: zxl
 * 当增加一个新的产品族时只需增加一个新的具体工厂，不需要修改原代码，满足开闭原则。
 * 当产品族中需要增加一个新种类的产品时，则所有的工厂类都需要进行修改，不满足开闭原则。
 * @create: 2020-11-19 18:44
 **/
public class AbstractFactory {
}


interface IAbstractFactory {
    Product createProduct();

    AbstractOtherProduct createOtherProduct();
}

class AbstractFactoryA implements IAbstractFactory {

    @Override
    public Product createProduct() {
        return new ProductA();
    }

    @Override
    public AbstractOtherProduct createOtherProduct() {
        return new AbstractOtherProductA();
    }
}

class AbstractFactoryB implements IAbstractFactory {

    @Override
    public Product createProduct() {
        return new ProductB();
    }

    @Override
    public AbstractOtherProduct createOtherProduct() {
        return new AbstractOtherProductA();
    }
}


interface AbstractProduct {
    void createProductName(String name);
}

class AbstractProductA implements AbstractProduct {

    @Override
    public void createProductName(String name) {
        System.out.println(name);
    }
}


class AbstractProductB implements AbstractProduct {

    @Override
    public void createProductName(String name) {
        System.out.println(name);

    }


}

interface AbstractOtherProduct {
    void createAbstractOtherProduct(String name);
}

class AbstractOtherProductA implements AbstractOtherProduct {

    @Override
    public void createAbstractOtherProduct(String name) {
        System.out.println(name);
    }
}
package com.basic.design.factory;

/**
 * @description: 工厂方法
 * @author: zxl
 * @create: 2020-11-19 18:24
 **/
public class FactoryMethod {
    public static void main(String[] args) {
        FactoryA factoryA = new FactoryA();
        Product product = factoryA.createProduct();
    }


}

interface IFactory {
    Product createProduct();
}

class FactoryA implements IFactory {

    @Override
    public Product createProduct() {
        return new ProductA();
    }
}

class FactoryB implements IFactory {

    @Override
    public Product createProduct() {
        return new ProductB();
    }
}


interface Product {
    void createProductName(String name);
}

class ProductA implements Product {

    @Override
    public void createProductName(String name) {
        System.out.println(name);
    }
}

class ProductB implements Product {

    @Override
    public void createProductName(String name) {
        System.out.println(name);

    }
}


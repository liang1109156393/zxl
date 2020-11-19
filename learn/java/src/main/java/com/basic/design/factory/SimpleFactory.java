package com.basic.design.factory;

/**
 * @description: 简单工厂方法
 * @author: zxl
 * @create: 2020-11-19 18:17
 **/
public class SimpleFactory {
    public static void main(String[] args) {
        Car jeepCar = SimpleFactory.createCar("jeepCar");
        jeepCar.carColor("read");
    }



    public static Car createCar(String carName){
        if(carName.equals("jeepCare")){
            return  new JeepCar();
        }else {
            return new BenChiCar();
        }
    }
}


interface Car{
     void carColor(String carColor);
}
class JeepCar implements Car{

    @Override
    public void carColor(String carColor) {
        System.out.println(carColor);
    }
}
class BenChiCar implements Car{
    @Override
    public void carColor(String carColor) {
        System.out.println(carColor);
    }
}


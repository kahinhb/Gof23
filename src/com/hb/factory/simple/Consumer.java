package com.hb.factory.simple;

//简单工厂模式
public class Consumer {
    public static void main(String[] args) {
//Car car =new Wuling();
//Car car2 =new Tesla();
        Car car = CarFactory.getCar("五菱");
        Car car1 = CarFactory.getCar("特斯拉");
        car.name();
        car1.name();
    }
}

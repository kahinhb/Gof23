package com.hb.factory.method;

public class Consumer {
    public static void main(String[] args) {
        Car car = new WulingFactory().getCar();
        Car car1 = new TeslaFactory().getCar();
        car.name();
        car1.name();
        Car car2 = new MobaiFactory().getCar();
        car2.name();
    }
}

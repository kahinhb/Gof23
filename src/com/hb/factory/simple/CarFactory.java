package com.hb.factory.simple;

public class CarFactory {
    public static  Car getCar(String Car){
        if(Car.equals("五菱")){
            return new Wuling();
        }else if(Car.equals("特斯拉")){
            return new Tesla();
        }else{
            return null;
        }
    }
}

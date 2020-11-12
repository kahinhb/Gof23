package com.hb.builder.demo;

public class Director {
//只会工人按照顺序建房子
    public  Product bulid(Bulider bulider){
        bulider.buildA();
        bulider.buildB();
        bulider.buildC();
        bulider.buildD();

        return bulider.getProduct();

    }
}

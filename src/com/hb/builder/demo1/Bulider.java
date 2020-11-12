package com.hb.builder.demo1;



public abstract class Bulider {
    abstract Bulider buildA(String msg);//汉堡
    abstract Bulider buildB(String msg);//薯条
    abstract Bulider buildC(String msg);//可乐
    abstract Bulider buildD(String msg);//甜点
//套餐
    abstract Product getProduct();
}

package com.hb.builder.demo;

public abstract class Bulider {
    abstract void buildA();//地基
    abstract void buildB();//钢筋工程
    abstract void buildC();//铺电线
    abstract void buildD();//粉刷
//完工
    abstract Product getProduct();
}

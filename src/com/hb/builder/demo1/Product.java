package com.hb.builder.demo1;
//套餐
public class Product {

    private String BulidA= "汉堡";

    private String BulidB= "薯条";

    private String BulidC= "可乐";

    private String BulidD= "甜点";

    public String getBulidA() {
        return BulidA;
    }

    public void setBulidA(String bulidA) {
        this.BulidA = bulidA;
    }

    public String getBulidB() {
        return BulidB;
    }

    public void setBulidB(String bulidB) {
        this.BulidB = bulidB;
    }

    public String getBulidC() {
        return BulidC;
    }

    public void setBulidC(String bulidC) {
        this.BulidC = bulidC;
    }

    public String getBulidD() {
        return BulidD;
    }

    public void setBulidD(String bulidD) {
        this.BulidD = bulidD;
    }

    @Override
    public String toString() {
        return "Product{" +
                "bulidA='" + BulidA + '\'' +
                ", bulidB='" + BulidB + '\'' +
                ", bulidC='" + BulidC + '\'' +
                ", bulidD='" + BulidD + '\'' +
                '}';
    }
}

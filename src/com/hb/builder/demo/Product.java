package com.hb.builder.demo;

public class Product {

    private String bulidA;

    private String bulidB;

    private String bulidC;

    private String bulidD;

    public String getBulidA() {
        return bulidA;
    }

    public String getBulidB() {
        return bulidB;
    }

    public String getBulidC() {
        return bulidC;
    }

    public String getBulidD() {
        return bulidD;
    }

    public void setBulidA(String bulidA) {
        this.bulidA = bulidA;
    }

    public void setBulidB(String bulidB) {
        this.bulidB = bulidB;
    }

    public void setBulidC(String bulidC) {
        this.bulidC = bulidC;
    }

    public void setBulidD(String bulidD) {
        this.bulidD = bulidD;
    }

    @Override
    public String toString() {
        return "Product{" +
                "bulidA='" + bulidA + '\'' +
                ", bulidB='" + bulidB + '\'' +
                ", bulidC='" + bulidC + '\'' +
                ", bulidD='" + bulidD + '\'' +
                '}';
    }
}

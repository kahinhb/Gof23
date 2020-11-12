package com.hb.builder.demo;

public class Worker extends Bulider{

    private Product product;
    public Worker(){
    product =new Product();}
    @Override
    void buildA() {
        product.setBulidA("地基");
        System.out.println("地基");
    }

    @Override
    void buildB() {
        product.setBulidB("钢筋工程");
        System.out.println("钢筋工程");
    }

    @Override
    void buildC() {
        product.setBulidC("铺电线");
        System.out.println("铺电线");
    }

    @Override
    void buildD() {
        product.setBulidD("粉刷");
        System.out.println("粉刷");
    }

    @Override
    Product getProduct() {
        return product;
    }
}

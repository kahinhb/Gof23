package com.hb.builder.demo1;



public class Worker extends Bulider{

    private Product product;

    public Worker(){
        product =new Product();
    }
    @Override
    Bulider buildA(String msg) {
        product.setBulidA(msg);
        return this;
    }

    @Override
    Bulider buildB(String msg) {
        product.setBulidB(msg);
        return this;
    }

    @Override
    Bulider buildC(String msg) {
        product.setBulidC(msg);
        return this;
    }

    @Override
    Bulider buildD(String msg) {
        product.setBulidD(msg);
        return this;
    }

    @Override
    Product getProduct() {
        return product;
    }
}

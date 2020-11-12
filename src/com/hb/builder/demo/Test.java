package com.hb.builder.demo;

public class Test {

    public static void main(String[] args) {
        Director director = new Director();
        Product bulid = director.bulid(new Worker());
        System.out.println(bulid.toString());
    }
}
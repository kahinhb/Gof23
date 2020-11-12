package com.hb.factory.abstract1;

//抽象工厂模式
public class Client {
    public static void main(String[] args) {
        System.out.println("============小米系列产品==========");
        XiaomiFactory xiaomiFactory =new XiaomiFactory();
        IphoneProduct iphoneProduct = xiaomiFactory.iphoneProduct();
        iphoneProduct.callup();
        iphoneProduct.sendSMS();

        IPouterProduct iPouterProduct = xiaomiFactory.iPouterProduct();
        iPouterProduct.openWifi();

        System.out.println("============华为系列产品==========");
        HuaweiFactory huaweiFactory =new HuaweiFactory();
        iphoneProduct = huaweiFactory.iphoneProduct();
        iphoneProduct.callup();
        iphoneProduct.sendSMS();

        iPouterProduct = huaweiFactory.iPouterProduct();
        iPouterProduct.openWifi();
    }
}

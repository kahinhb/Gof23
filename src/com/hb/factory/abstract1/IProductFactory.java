package com.hb.factory.abstract1;

//抽象产品工厂
public interface IProductFactory {
    //生产路由器
    IPouterProduct iPouterProduct();
    //生产手机
    IphoneProduct iphoneProduct();
}

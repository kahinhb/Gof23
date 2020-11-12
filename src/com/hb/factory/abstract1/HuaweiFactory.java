package com.hb.factory.abstract1;

public class HuaweiFactory implements IProductFactory{
    @Override
    public IPouterProduct iPouterProduct() {
        return new HuaweiRouter();
    }

    @Override
    public IphoneProduct iphoneProduct() {
        return new HuaweiPhone();
    }
}

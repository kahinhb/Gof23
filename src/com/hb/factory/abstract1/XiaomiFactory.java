package com.hb.factory.abstract1;

public class XiaomiFactory implements IProductFactory{
    @Override
    public IPouterProduct iPouterProduct() {
        return new XiaomiRouter();
    }

    @Override
    public IphoneProduct iphoneProduct() {
        return new XiaomiPhone();
    }
}

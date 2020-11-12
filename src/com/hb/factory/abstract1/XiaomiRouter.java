package com.hb.factory.abstract1;

public class XiaomiRouter implements IPouterProduct{
    @Override
    public void start() {
        System.out.println("启动小米路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米路由器");
    }

    @Override
    public void openWifi() {
        System.out.println("启动小米路由器wifi");
    }

    @Override
    public void setting() {
        System.out.println("设置小米路由器");
    }
}

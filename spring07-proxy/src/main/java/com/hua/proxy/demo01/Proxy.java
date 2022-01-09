package com.hua.proxy.demo01;

public class Proxy implements Rent{
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        sign();
        fare();
    }

    public void seeHouse() {
        System.out.println("中介带你看房子");
    }

    public void sign() {
        System.out.println("签约租赁合同");
    }

    public void fare() {
        System.out.println("收取中介费");
    }
}

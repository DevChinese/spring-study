package com.hua.proxy.demo01;

public class Client {
    public static void main(String[] args) {
        // 被代理的角色，房东要租房子
        Host host = new Host();
        // 代理，中介帮房东租房子，但是代理一般会有些附属操作
        Proxy proxy = new Proxy(host);

        // 你不必找房东，直接找中介租房即可
        proxy.rent();
    }
}

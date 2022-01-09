package com.hua.proxy.demo03;

public class Client {

    public static void main(String[] args) {
        // 真实角色
        Rent host = new Host();

        // 代理角色，现在没有
        ProxyInvocationHandler pih =  new ProxyInvocationHandler();

        // 通过调用程序处理角色来处理我们要调用的接口
        // 设置要代理的角色
        pih.setRent(host);
        // 动态生成代理类的实例
        Rent proxy = (Rent) pih.getProxy();
        // 通过代理调用方法
        proxy.rent();

    }

}

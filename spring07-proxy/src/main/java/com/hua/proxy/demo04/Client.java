package com.hua.proxy.demo04;

import com.hua.proxy.demo02.UserService;
import com.hua.proxy.demo02.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        // 真实角色
        UserService userService = new UserServiceImpl();

        // 代理角色不存在，需动态生成
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        pih.setTarget(userService);  // 设置需要代理的对象
        // 动态生成代理类实例
        UserService proxy = (UserService) pih.getProxy();

        proxy.add();
    }
}

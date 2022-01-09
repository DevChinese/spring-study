package com.hua.spring08.diy;

/**
 * 方式二：自定义切面类
 */
public class DiyPointcut {
    public void before() {
        System.out.println("=============before===============");
    }

    public void after() {
        System.out.println("=============after===============");
    }
}

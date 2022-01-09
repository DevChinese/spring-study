package com.hua.spring08.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeLog implements MethodBeforeAdvice {

    /**
     * @param method 要执行的目标对象的方法
     * @param args 方法的参数
     * @param target 目标对象
     * @throws Throwable ..
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "执行了" + method.getName() + "方法被执行了");
    }
}

package com.hua.spring08.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 方式三：注解方式实现AOP
 */

@Aspect  // 标注这是一个切面
public class AnnotationPointcut {

    @Before("execution(* com.hua.spring08.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("=============before===============");
    }

    @After("execution(* com.hua.spring08.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("=============before===============");
    }

    // 在环绕增强中，可以给定一个参数，代表要切入点
    @Around("execution(* com.hua.spring08.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("=============around before===============");

        Signature signature = jp.getSignature();
        System.out.println("signature: " + signature);

        // 执行方法
        Object proceed = jp.proceed();

        System.out.println("=============around after===============");

        System.out.println(proceed);
    }
}

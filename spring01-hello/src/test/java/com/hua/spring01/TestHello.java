package com.hua.spring01;

import com.hua.spring01.pojo.Hello;
import com.hua.spring01.pojo.User2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHello {
    @Test
    public void testHello() {
        // 加载bean.xml，生成管理bean的上下文，即spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // getBean: 参数为spring bean配置中的id
        Hello hello = (Hello) context.getBean("hello");
        hello.sayHello();

        User2 user3 = (User2) context.getBean("user3");
        System.out.println(user3.getName());

        User2 user4 = (User2) context.getBean("user4");
        System.out.println(user4.getName());


    }
}

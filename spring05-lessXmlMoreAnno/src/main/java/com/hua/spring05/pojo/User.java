package com.hua.spring05.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component  // 等价于<bean id="user" class="com.hua.spring05.pojo.User"/>
@Scope("singleton")  // 通过@Scope可指定bean是否是单例，与xml中bean标签中的scope属性是一样的
public class User {
    // 通过 @Value 可以注入简单类型的属性的值，该注解也可以房子set方法上
    @Value("华仔") // 相当于<property name="name" value="华仔"/>
    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Value("18")
    public void setAge(int age) {
        this.age = age;
    }
}

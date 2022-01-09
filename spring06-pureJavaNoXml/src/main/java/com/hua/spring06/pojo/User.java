package com.hua.spring06.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// 如果仅使用在JavaConfig中以bean注解的方式注册bean，@Component注解可以没有
// 给加上@Component注解，是为了可以再JavaConfig以@ComponentScan("com.hua.spring06.pojo.User")的方式注入该类的实例
@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }

    @Value("华仔")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}

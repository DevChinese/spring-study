package com.hua.spring06.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component  // 在IOC容器中注册的bean id为 aaBb，即类名首字母小写
public class AaBb {
    private String name;

    public String getName() {
        return name;
    }

    @Value("aabb")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AaBb{" +
                "name='" + name + '\'' +
                '}';
    }
}

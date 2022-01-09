package com.hua.spring06.config;

import com.hua.spring06.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Configuration 也会被注入到IOC容器中，因为它本身也是一个 @Component
 * @Configuration 代表这是一个配置类，实现了和applicationContext.xml一样的功能
 * 可以给配置类加上 @ComponentScan 注解进行bean扫描，扫描生成的对象实例的bean id是类名首字母小写
 * 可以给配置类加上 @Import 注解来引入其他配置类
 */

@Configuration
@ComponentScan("com.hua.spring06.pojo")
@Import(AppConfig2.class)
public class AppConfig {
    // 注册一个bean，就相当于之前在applicationContext.xml中写的一个bean标签
    // 这个方法的名字，就相当于bean标签id属性的值
    // 方法的返回值类型，相当于bean标签的class属性的值
    @Bean
    public User getUser() {
        return new User();
    }
}

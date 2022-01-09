package com.hua.spring04.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * [ @Autowired ] 可以放在属性上，也可以放在set方法上，前提有相应的bean装配在IOC容器中
 * [ @Autowired ] 一般匹配属性名，或者属性类型
 * [ @Autowired ] 默认byName寻找bean，当没有对应的id的bean时，也可通过type查找，需注意如下规则
 *  假如属性名为cat：
 *      若IOC容器中存在两个Cat类型bean，id分别为 cat，cat1，则会匹配到cat
 *      若IOC容器中存在两个Cat类型bean，id分别为 cat1，cat1，则会匹配失败，报错；这种情形可叠加@Qualifier(bean-id)注解
 * @Qualifier 必须和 @Autowired 叠加使用
 *
 *
 * 还有个 @Resource 注解可实现与 @Autowired 一样的功能，不属于spring，归属于javax.annotation，了解即可
 */

public class People {
    // 如果现实声明Autowired的required = false，则该属性值可以null，否则该属性必须有值
    @Autowired(required = false)
//    @Qualifier("cat1")
    private Cat cat;

    private Dog dog;

    private String name;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    @Autowired
    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}

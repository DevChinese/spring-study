package com.hua.spring01.pojo;

public class User2 {
    private String name;

    public User2(String name) {
        System.out.println("User2的有参构造！");
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    @Override
    public String toString() {
        return "User2{" +
                "name='" + name + '\'' +
                '}';
    }
}

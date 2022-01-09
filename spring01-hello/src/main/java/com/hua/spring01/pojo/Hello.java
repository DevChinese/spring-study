package com.hua.spring01.pojo;

public class Hello {
    private static final String PREFIX = "你好呀！ ";

    private User user;

    public Hello() {
        System.out.println("Hello的无参构造方法");
    }

    public void sayHello() {
        System.out.println(PREFIX + user.getName());
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "user=" + user +
                '}';
    }
}

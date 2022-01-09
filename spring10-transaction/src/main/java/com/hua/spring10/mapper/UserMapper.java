package com.hua.spring10.mapper;

import com.hua.spring10.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectUser();

    void addUser(User user);

    void deleteUser(int id);

    void addAndSelect(User user);

}

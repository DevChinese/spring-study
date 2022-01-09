package com.hua.spring09.mapper;

import com.hua.spring09.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectUser();
}

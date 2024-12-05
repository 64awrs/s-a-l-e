package com.liz.mapper;

import com.liz.entity.User;

import java.util.List;

public interface UserMapper {

    int getTotalCount();

    List<User> getAll();
}

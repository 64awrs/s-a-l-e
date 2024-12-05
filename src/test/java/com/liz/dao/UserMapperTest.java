package com.liz.dao;

import com.liz.entity.User;
import com.liz.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import java.util.List;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserMapperTest {

    @Resource
    private UserMapper mapper;

    @Test
    @DisplayName("获取数据数量")
    void getTotalCount() {
        int num  = mapper.getTotalCount();
        System.out.println(num);
    }

    @Test
    @DisplayName("查询数据")
    void getAll() {
        List<User> userList = mapper.getAll();
        System.out.println(userList);
    }
}

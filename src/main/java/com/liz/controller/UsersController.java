package com.liz.controller;

import com.liz.entity.Response;
import com.liz.entity.User;
import com.liz.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

//注解 annotation
@RestController
@CrossOrigin  //允许跨域访问
@RequestMapping("api/users")
public class UsersController {
    @Resource
    private UserMapper userMapper;

    @RequestMapping("all")
    public Response<List<User>> getAllUsers(){
        List<User> users = userMapper.getAll();

        //封装响应对象
        Response<List<User>> response = new Response<List<User>>(users,10);

        return  response;
    }
}

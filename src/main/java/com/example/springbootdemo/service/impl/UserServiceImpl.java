package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.dao.UserMapper;
import com.example.springbootdemo.model.User;
import com.example.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserInfo() {
        return userMapper.findUserInfo();
    }
}

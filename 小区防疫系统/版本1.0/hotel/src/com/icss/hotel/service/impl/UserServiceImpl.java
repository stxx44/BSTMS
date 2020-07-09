package com.icss.hotel.service.impl;

import com.icss.hotel.dao.UserMapper;
import com.icss.hotel.domain.User;
import com.icss.hotel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String account) {
        return userMapper.login(account);
    }

    @Override
    public int register(User user){
        return userMapper.register(user);
    }
}

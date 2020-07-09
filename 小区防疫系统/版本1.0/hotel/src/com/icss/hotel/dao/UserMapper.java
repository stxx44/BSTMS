package com.icss.hotel.dao;

import com.icss.hotel.domain.User;

public interface UserMapper {
    /**
     * 登录方法
     *
     * @param account 用户输入的账号
     * @return
     */
    User login(String account);

    /**
     * 注册方法
     *
     * @param user 用户输入信息
     * @return
     */
    int register(User user);
}
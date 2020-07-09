package com.icss.hotel.dao;

import com.icss.hotel.domain.Emp;
import com.icss.hotel.domain.User;

import java.util.List;

public interface UserMapper {
    /**
     * 登录方法
     *
     * @param account 用户输入的账号
     * @return
     */
    User login(String account);

}
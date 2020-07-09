package com.icss.hotel.service;

import com.icss.hotel.domain.User;

public interface UserService {
   User login(String account);

   int register(User user);
}

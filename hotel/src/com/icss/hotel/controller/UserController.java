package com.icss.hotel.controller;

import com.icss.hotel.dao.UserMapper;
import com.icss.hotel.domain.Type;
import com.icss.hotel.domain.User;
import com.icss.hotel.service.OrderService;
import com.icss.hotel.service.RoomService;
import com.icss.hotel.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
    @Autowired
    private UserMapper userMapper;
    @ResponseBody
    @RequestMapping("/login.action")
    public Map<String, Object> logon(String account, String password) {
        resultMap.clear();
        User user = userMapper.login(account);
        if (user == null) {
            resultMap.put("code", 202);
            resultMap.put("msg", "账号不存在");
        } else if (!user.getPassword().equals(password)) {
            resultMap.put("code", 201);
            resultMap.put("msg", "密码错误");
        } else {
            resultMap.put("code", 200);
            resultMap.put("msg", "登录成功");
            resultMap.put("result", user);
        }
        return resultMap;
    }
}

package com.icss.hotel.controller;

import com.icss.hotel.domain.User;
import com.icss.hotel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
    @Autowired
    private UserService userService;
    @ResponseBody
    @RequestMapping("/login.action")
    public Map<String, Object> login(String account, String password) {
        resultMap.clear();
        User user = userService.login(account);
        if (user == null) {
            resultMap.put("code", 202);
            resultMap.put("msg", "账号不存在");
        } else if (!user.getPassword().equals(password)) {
            resultMap.put("code", 201);
            resultMap.put("msg", "密码错误");
        } else if(user.getLevel().equals(1)){
            resultMap.put("code", 200);
            resultMap.put("msg", "登录成功");
            resultMap.put("result", user);
        }else{
            resultMap.put("code", 199);
            resultMap.put("msg", "登录成功");
            resultMap.put("result", user);
        }
        return resultMap;
    }
    @ResponseBody
    @RequestMapping("/register.action")
    public Map<String, Object> regsiter(User user) {
        resultMap.clear();
        int result = userService.register(user);
        if (result != -1) {
            resultMap.put("code", 200);
            resultMap.put("msg", "注册成功");
        } else {
            resultMap.put("code", 201);
            resultMap.put("msg", "注册失败");
        }
        return resultMap;
    }
}

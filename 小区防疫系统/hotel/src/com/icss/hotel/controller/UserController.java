package com.icss.hotel.controller;

import com.icss.hotel.dao.UserMapper;
import com.icss.hotel.domain.Group;
import com.icss.hotel.domain.GroupList;
import com.icss.hotel.domain.Type;
import com.icss.hotel.domain.User;
import com.icss.hotel.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
    @Autowired
    private UserService userService;
    @Autowired
    private GroupService groupService;
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
            resultMap.put("msg", "欢迎登录，管理员");
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
    @ResponseBody
    @RequestMapping("/checkAccount.action")
    public Map<String, Object> checkAccout(String account) {
        resultMap.clear();
        User user = userService.checkAccount(account);
        if (user == null) {
            resultMap.put("code", 200);
        } else {
            resultMap.put("code", 201);
            resultMap.put("msg", "已存在账号");
        }
        return resultMap;
    }

    @ResponseBody
    @RequestMapping("/queryGroupId.action")
    public Map<String,Object> queryGroupId(String account){
        resultMap.clear();
        String result = userService.queryGroupId(account);
        if(result !=null){
            resultMap.put("code",201);
            resultMap.put("msg","已经加入小区或创建");
        }
        else
        {
            resultMap.put("code",200);
        }
        return resultMap;
    }

    @ResponseBody
    @RequestMapping("/updateGroupId.action")
    public Map<String,Object> updateGroupId(Group group){
        resultMap.clear();
        int result;
        if((userService.queryGroupId(group.getAccount()) ==null)) {
            if (groupService.queryGroupId(group.getGroup_id()) != null) {
                if (group.getGroup_name().equals(groupService.getGroupName(group.getGroup_id()))) {
                    result = userService.updateGroupId(group);
                    if (result != -1) {
                        resultMap.put("code", 200);
                        resultMap.put("msg", "加入成功");
                    } else {
                        resultMap.put("code", 201);
                        resultMap.put("msg", "加入失败");

                    }
                } else {
                    resultMap.put("code", 201);
                    resultMap.put("msg", "组团名出错");
                }

            }
            else {
                resultMap.put("code",201);
                resultMap.put("msg","不存在该组团码");
            }
        }
        else {
            resultMap.put("code", 201);
            resultMap.put("msg", "已有组团，无法再次加入");
        }

        return resultMap;
    }
    @ResponseBody
    @RequestMapping("/getGroupId.action")
    public Map<String,Object> getGroupId(String account){
        resultMap.clear();
        String s = userService.getGroupId(account);
        resultMap.put("code",s);
        resultMap.put("msg",s);
        return resultMap;
    }

    @ResponseBody
    @RequestMapping("/getAllaccount.action")
    public Map<String, Object> getAllaccount(String group_id){
        resultMap.clear();
        List<User> user = userService.getAllaccount(group_id);
        System.out.println(group_id);
        if(user.size()>0){
            resultMap.put("code", 200);
            resultMap.put("msg", "查询成功");
            resultMap.put("u", user);
        }
        else {
            resultMap.put("code", 201);
            resultMap.put("msg", "失败");
        }
        return resultMap;
    }

    @ResponseBody
    @RequestMapping("/getUserById.action")
    public Map<String,Object>getUserById(String account){
        resultMap.clear();
        User user = userService.getUserById(account);
        if(user!=null){
            resultMap.put("code",200);
            resultMap.put("msg","查询成功");
            resultMap.put("userById",user);
        }
        else{
            resultMap.put("code",201);

        }
        return resultMap;
    }

    @ResponseBody
    @RequestMapping("/updateState.action")
    public Map<String,Object>getUserById(User user){
        int i = userService.updateState(user);
        if(i!=-1){
            resultMap.put("code",200);
            resultMap.put("msg","修改权限成功");
        }
        else{
            resultMap.put("code",201);
            resultMap.put("msg","修改失败");
        }
        return resultMap;
    }
    @ResponseBody
    @RequestMapping("/getPassword.action")
    public Map<String,Object>getPassword(User user){
        resultMap.clear();
        String password = userService.getPassword(user);
        if(password.equals(user.getPassword())){
            resultMap.put("code",200);
        }
        else{
            resultMap.put("code",201);
            resultMap.put("msg","密码错误");
        }
        return resultMap;

    }
    @ResponseBody
    @RequestMapping("/updatePassword.action")
    public Map<String,Object>updatePassword(User user)
    {
        int i = userService.updatePassword(user);
        if(i!=-1){
            resultMap.put("code",200);
            resultMap.put("msg","修改密码成功");
        }
        else {
            resultMap.put("code",201);
            resultMap.put("msg","修改密码失败");
        }
        return resultMap;
    }
    @ResponseBody
    @RequestMapping("/getUser.action")
    public Map<String,Object>getUser(String account)
    {
        resultMap.clear();
        User user = userService.getUser(account);
        System.out.println(user.getName());
        resultMap.put("code",200);
        resultMap.put("userInformation",user);
        return resultMap;
    }

    @ResponseBody
    @RequestMapping("/managerRegister.action")
    public Map<String,Object>managerRegister(User user)
    {
        resultMap.clear();
        int i = userService.managerRegister(user);
        if(i!=-1){
            resultMap.put("code",200);
            resultMap.put("msg","管理员注册成功");
        }
        else {
            resultMap.put("code",201);
            resultMap.put("msg","管理员注册失败");
        }
        return resultMap;
    }
}

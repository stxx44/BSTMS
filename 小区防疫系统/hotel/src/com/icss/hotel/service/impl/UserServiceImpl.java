package com.icss.hotel.service.impl;

import com.icss.hotel.dao.TypeMapper;
import com.icss.hotel.dao.UserMapper;
import com.icss.hotel.domain.Group;
import com.icss.hotel.domain.GroupList;
import com.icss.hotel.domain.Type;
import com.icss.hotel.domain.User;
import com.icss.hotel.service.TypeService;
import com.icss.hotel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public User checkAccount(String account) {
        return userMapper.checkAccount(account);
    }

    @Override
    public String queryGroupId(String account) {
        return userMapper.queryGroupId(account);
    }

    @Override
    public int updateGroupId(Group group) {
        return userMapper.updateGroupId(group);
    }

    @Override
    public int updateGroupListId(GroupList groupList) {
        return userMapper.updateGroupListId(groupList);
    }

    @Override
    public String getGroupId(String account) {
        return userMapper.getGroupId(account);
    }

    @Override
    public List<User> getAllaccount(String group_id) {
        return userMapper.getAllaccount(group_id);
    }

    @Override
    public User getUserById(String account) {
        return userMapper.getUserById(account);
    }

    @Override
    public int updateState(User user) {
        return userMapper.updateState(user);
    }

    @Override
    public String getPassword(User user) {
        return userMapper.getPassword(user);
    }

    @Override
    public int updatePassword(User user) {
        return userMapper.updatePassword(user);
    }

    @Override
    public User getUser(String account) {
        return userMapper.getUser(account);
    }

    @Override
    public int deleteGroup(String group_id) {
        return userMapper.deleteGroup(group_id);
    }

    @Override
    public int managerRegister(User user) {
        return userMapper.managerRegister(user);
    }


}

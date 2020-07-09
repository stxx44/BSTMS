package com.icss.hotel.dao;

import com.icss.hotel.domain.Group;
import com.icss.hotel.domain.GroupList;
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

    /**
     * 注册方法
     *
     * @param user 用户输入信息
     * @return
     */
    int register(User user);

    User checkAccount(String account);

    String queryGroupId(String account);

    int updateGroupId(Group group);

    String getGroupId(String account);

    int updateGroupListId(GroupList groupList);

    List<User> getAllaccount(String group_id);

    User getUserById(String account);

    int updateState(User user);

    String getPassword(User user);

    int updatePassword(User user);

    User getUser(String account);

    int deleteGroup(String group_id);

    int managerRegister(User user);
}
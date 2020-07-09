package com.icss.hotel.service;

import com.icss.hotel.domain.Group;
import com.icss.hotel.domain.GroupList;
import com.icss.hotel.domain.User;

import java.util.List;

public interface UserService {
   User login(String account);

   int register(User user);

   User checkAccount(String account);

   String queryGroupId(String account);

   int updateGroupId(Group group);

   int updateGroupListId(GroupList groupList);

   String getGroupId(String account);

   List<User> getAllaccount(String group_id);

   User getUserById(String account);

   int updateState(User user);

   String getPassword(User user);

   int updatePassword(User user);

   User getUser(String account);

   int deleteGroup(String group_id);

   int managerRegister(User user);
}

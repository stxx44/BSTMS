package com.icss.hotel.service;

import com.icss.hotel.domain.Group;
import com.icss.hotel.domain.GroupList;

import java.util.List;

public interface GroupService {
   int addGroup(Group group);

   List<Group>queryAllGroup();

   int addGroupList(GroupList groupList);

   Group queryGroupId(String group_id);

   int joinGroup(GroupList groupList);

   Group findGroup(String group_id);

   int checkLevel(String account);

   String getGroupName(String group_id);

   int deleteGroup(Group group);
}

package com.icss.hotel.service.impl;

import com.icss.hotel.dao.GroupMapper;
import com.icss.hotel.dao.UserMapper;
import com.icss.hotel.domain.Group;
import com.icss.hotel.domain.GroupList;
import com.icss.hotel.domain.User;
import com.icss.hotel.service.GroupService;
import com.icss.hotel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService{
    @Autowired
    private GroupMapper groupMapper;
    @Override
    public int addGroup(Group group) {
        return groupMapper.addGroup(group);
    }

    @Override
    public List<Group> queryAllGroup() {
        return groupMapper.queryAllGroup();
    }

    @Override
    public int addGroupList(GroupList groupList) {
        return groupMapper.addGroupList(groupList);
    }

    @Override
    public Group queryGroupId(String group_id) {
        return groupMapper.queryGroupId(group_id);
    }

    @Override
    public int joinGroup(GroupList groupList) {
        return groupMapper.joinGroup(groupList);
    }

    @Override
    public Group findGroup(String group_id) {
        return groupMapper.findGroup(group_id);
    }

    @Override
    public int checkLevel(String account) {
        return groupMapper.checkLevel(account);
    }

    @Override
    public String getGroupName(String group_id) {
        return groupMapper.getGroupName(group_id);
    }

    @Override
    public int deleteGroup(Group group) {
        return groupMapper.deleteGroup(group);
    }
}

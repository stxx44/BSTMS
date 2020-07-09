package com.icss.hotel.service.impl;

import com.icss.hotel.dao.GroupMapper;
import com.icss.hotel.domain.Group;
import com.icss.hotel.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {
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
}

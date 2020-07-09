package com.icss.hotel.dao;

import com.icss.hotel.domain.Group;

import java.util.List;

public interface GroupMapper {
    int addGroup(Group group);

   List<Group> queryAllGroup();
}
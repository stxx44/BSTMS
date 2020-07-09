package com.icss.hotel.service;

import com.icss.hotel.domain.Group;

import java.util.List;

public interface GroupService {
   int addGroup(Group group);

   List<Group>queryAllGroup();
}

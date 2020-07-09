package com.icss.hotel.service.impl;

import com.icss.hotel.dao.RoomMapper;
import com.icss.hotel.domain.Room;
import com.icss.hotel.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomMapper roomMapper;

    @Override
    public List<Map<String, Object>> queryAllRoom() {
        return roomMapper.queryAllRoom();
    }

    @Override
    public int addRoom(Room room) {
        return roomMapper.addRoom(room);
    }

    @Override
    public List<Room> queryRoomByState() {
        return roomMapper.queryRoomByState();
    }

    @Override
    public int delRoom(String rnum) {
        return roomMapper.delRoom(rnum);
    }

    @Override
    public Room queryRoomById(String rnum){return roomMapper.queryRoomById(rnum);}

    @Override
    public int updateRoom(Room room){return roomMapper.updateRoom(room);}

    @Override
    public int updateRoomByRnum(int rnum){return roomMapper.updateRoomStateByRnum(rnum);}

    @Override
    public Room queryRoomExist(String rnum){return roomMapper.queryRoomExist(rnum);}

}

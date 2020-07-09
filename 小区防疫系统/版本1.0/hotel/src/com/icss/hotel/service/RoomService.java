package com.icss.hotel.service;

import com.icss.hotel.domain.Room;

import java.util.List;
import java.util.Map;

public interface RoomService {

    /**
     * 显示所有客房
     *
     * @return
     */
    List<Map<String, Object>> queryAllRoom();

    /**
     * 添加客房
     *
     * @param room
     * @return
     */
    int addRoom(Room room);

    /**
     * 显示可用的房间
     */
    List<Room> queryRoomByState();

    int delRoom(String rnum);

    Room queryRoomById(String rnum);

    int updateRoom(Room room);

    int updateRoomByRnum(int rnum);

    Room queryRoomExist(String rnum);

}

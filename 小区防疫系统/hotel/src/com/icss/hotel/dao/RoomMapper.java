package com.icss.hotel.dao;

import com.icss.hotel.domain.Room;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface RoomMapper {

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

    List<Room> queryRoomByState();

    int updateRoomState(@Param("rno") int rno, @Param("state") int state);

    int delRoom(String  rnum);

    Room queryRoomById(String rnum);

    int updateRoom(Room room);

    Room queryRoomExist(String rnum);

    int updateRoomStateByRnum(@Param("rnum") int rnum) ;
}
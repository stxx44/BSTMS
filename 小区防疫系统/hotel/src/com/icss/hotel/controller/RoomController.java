package com.icss.hotel.controller;

import com.icss.hotel.domain.Room;
import com.icss.hotel.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/room")
public class RoomController extends BaseController {

    @Autowired
    private RoomService roomService;

    @ResponseBody
    @RequestMapping("/queryAllRoom.action")
    public Map<String, Object> queryAllRoom() {
        resultMap.clear();
        List<Map<String, Object>> list = roomService.queryAllRoom();
        if (list.isEmpty()) {
            resultMap.put("code", 201);
            resultMap.put("msg", "没有客房相关数据");
        } else {
            resultMap.put("code", 200);
            resultMap.put("msg", "查询成功");
            resultMap.put("rooms", list);
        }
        return resultMap;
    }

    @ResponseBody
    @RequestMapping("/addRoom.action")
    public Map<String, Object> addRoom(Room room) {
        resultMap.clear();
        Room room1;
        room1 = roomService.queryRoomExist(room.getRnum());
        if(room1 != null)
        {
            resultMap.put("code",201);
            resultMap.put("msg","已存在该客房号");
        }
        else{
            int result = roomService.addRoom(room);
            if (result != -1) {
                resultMap.put("code", 200);
                resultMap.put("msg", "添加客房成功");
            }
            else
            {
                resultMap.put("code", 202);
                resultMap.put("msg", "添加客房失败");
            }
        }
        return resultMap;
    }

    @ResponseBody
    @RequestMapping("/delRoom.action")
    public Map<String,Object> delRoom(String rnum){
        resultMap.clear();
        int result = roomService.delRoom(rnum);
        if(result !=-1){
            resultMap.put("code",200);
            resultMap.put("msg","删除客房成功");
        }
        else{
            resultMap.put("code",201);
            resultMap.put("msg","删除客房失败");
        }
        return resultMap;
    }

    @ResponseBody
    @RequestMapping("/queryRoomById.action")
    public Map<String, Object> queryTypeById(String rnum) {
        resultMap.clear();
        Room room = roomService.queryRoomById(rnum);
        resultMap.put("code", 200);
        resultMap.put("msg", "查询成功");
        resultMap.put("room", room);
        return resultMap;
    }

    @ResponseBody
    @RequestMapping("/updateRoom.action")
    public Map<String, Object> updateType(Room room) {
        resultMap.clear();
        int result = roomService.updateRoom(room);
        if (result != -1) {
            resultMap.put("code", 200);
            resultMap.put("msg", "更新客房信息成功");
        } else {
            resultMap.put("code", 201);
            resultMap.put("msg", "更新客房信息失败");
        }
        return resultMap;
    }
}

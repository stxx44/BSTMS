package com.icss.hotel.controller;

import com.icss.hotel.domain.Type;
import com.icss.hotel.domain.Order;
import com.icss.hotel.service.OrderService;
import com.icss.hotel.service.RoomService;
import com.icss.hotel.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/type")
public class TypeController extends BaseController {

    @Autowired
    private TypeService typeService;

    @Autowired
    public OrderService orderService;

    @Autowired
    public RoomService roomService;

    @ResponseBody
    @RequestMapping("/addType.action")
    public Map<String, Object> addType(Type type) {
        resultMap.clear();
        int result = typeService.addType(type);
        if (result != -1) {
            resultMap.put("code", 200);
            resultMap.put("msg", "添加客房类型成功");
        } else {
            resultMap.put("code", 201);
            resultMap.put("msg", "添加客房类型失败");
        }
        return resultMap;
    }

    @ResponseBody
    @RequestMapping("/queryAllType.action")
    public Map<String, Object> queryAllType() {
        resultMap.clear();
        List<Type> list = typeService.queryAllType();
        if (list.size() > 0) {
            resultMap.put("code", 200);
            resultMap.put("msg", "查询成功");
            resultMap.put("typeList", list);
        } else {
            resultMap.put("code", 201);
            resultMap.put("msg", "没有客房类型相关数据");
        }
        return resultMap;
    }


    @ResponseBody
    @RequestMapping("/delType.action")
    public Map<String, Object> delType(Integer tno) {
        resultMap.clear();
        int result = typeService.delType(tno);
        if (result != -1) {
            resultMap.put("code", 200);
            resultMap.put("msg", "删除客房类型成功");
        } else {
            resultMap.put("code", 201);
            resultMap.put("msg", "删除客房类型失败");
        }
        return resultMap;
    }

    @ResponseBody
    @RequestMapping("/queryTypeById.action")
    public Map<String, Object> queryTypeById(Integer tno) {
        resultMap.clear();
        Type type = typeService.queryTypeById(tno);
        resultMap.put("code", 200);
        resultMap.put("msg", "查询成功");
        resultMap.put("type", type);
        return resultMap;
    }

    @ResponseBody
    @RequestMapping("/updateType.action")
    public Map<String, Object> updateType(Type type) {
        resultMap.clear();
        int result = typeService.updateType(type);
        if (result != -1) {
            resultMap.put("code", 200);
            resultMap.put("msg", "更新客房信息成功");
        } else {
            resultMap.put("code", 201);
            resultMap.put("msg", "更新客房信息失败");
        }
        return resultMap;
    }

    @ResponseBody
    @RequestMapping("/updateRestNum.action")
    public Map<String,Object> updateRestNum(Type type){
        resultMap.clear();
        int result = typeService.updateRestNum(type);
        if(result != -1){
            resultMap.put("code", 200);
            resultMap.put("msg", "更新客房信息成功");
        } else{
            resultMap.put("code",201);
            resultMap.put("msg","更新客房信息失败");
        }
        return resultMap;
    }
}

package com.icss.hotel.controller;

import com.icss.hotel.domain.Order;
import com.icss.hotel.domain.Type;
import com.icss.hotel.service.CustomerService;
import com.icss.hotel.service.OrderService;
import com.icss.hotel.service.RoomService;
import com.icss.hotel.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 订单处理控制器
 */
@Controller
public class OrderController extends BaseController{

    @Autowired
    OrderService orderService;

    @Autowired
    CustomerService customerService;

    @Autowired
    RoomService roomService;

    @Autowired
    TypeService typeService;

    @RequestMapping("/queryOrder.action")
    @ResponseBody
    public Object queryAllOrder(){
        Map<String,Object> map = new HashMap<>();
        map.put("r",roomService.queryRoomByState());
        map.put("c",customerService.getAllCustomer());
        map.put("o",orderService.queryAllOrder());
        return map;
    }

    @RequestMapping("/queryOrdern.action")
    @ResponseBody
    public Object queryAllOrdern(){
        Map<String,Object> map = new HashMap<>();
        map.put("r",roomService.queryRoomByState());
        map.put("c",customerService.getAllCustomer());
        map.put("o",orderService.queryAllOrdern());
        return map;
    }
    @RequestMapping("/moveIn.action")
    @ResponseBody
    public Object moveIn(Order order){
        int i = orderService.moveIn(order);
        return executeDML(i,"入住");
    }

    @RequestMapping("/checkOut.action")
    @ResponseBody
    public Object checkOut(Order order){
        int i;
        int sum ;
        int days;
        roomService.updateRoomByRnum(order.getRnum());
        orderService.checkOut(order.getOno());
        days = orderService.getDays(order.getOno());
        sum = (days * order.getPrice())/10;
        typeService.updateRestNumn(order.getTname());
        i = customerService.updateIntegral(order.getCno(),sum);
        return executeDML(i,"退房成功");
    }

}

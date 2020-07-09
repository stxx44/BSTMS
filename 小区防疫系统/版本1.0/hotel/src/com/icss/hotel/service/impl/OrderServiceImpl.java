package com.icss.hotel.service.impl;

import com.icss.hotel.dao.OrderMapper;
import com.icss.hotel.dao.RoomMapper;
import com.icss.hotel.dao.TypeMapper;
import com.icss.hotel.domain.Order;
import com.icss.hotel.service.OrderService;
import com.icss.hotel.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    OrderMapper orderMapper;

    @Autowired
    RoomMapper roomMapper;

    @Autowired
    TypeMapper typeMapper;

    @Override
    public List<Order> queryAllOrder() {
        return orderMapper.queryAllOrder();
    }

    @Override
    public int moveIn(Order order) {
        roomMapper.updateRoomState(order.getRno(),1);
        return orderMapper.moveIn(order);
    }

    @Override
    public int checkOut(int ono){return orderMapper.checkOut(ono);}

    @Override
    public int getDays(int ono){return orderMapper.getDays(ono);}

    @Override
    public List<Order> queryAllOrdern() {
        return orderMapper.queryAllOrdern();
    }
}

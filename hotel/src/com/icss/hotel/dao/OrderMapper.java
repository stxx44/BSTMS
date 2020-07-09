package com.icss.hotel.dao;

import com.icss.hotel.domain.Order;

import java.util.List;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer ono);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer ono);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    List<Order> queryAllOrder();

    int moveIn(Order order);

    int checkOut(int ono);

    int getDays(int ono);

    List<Order> queryAllOrdern();
}
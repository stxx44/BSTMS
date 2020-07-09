package com.icss.hotel.service;

import com.icss.hotel.domain.Order;

import java.util.List;

public interface OrderService {
    public List<Order> queryAllOrder();
    public List<Order> queryAllOrdern();
    int moveIn(Order order);

    int checkOut(int ono);

    int getDays(int ono);
}

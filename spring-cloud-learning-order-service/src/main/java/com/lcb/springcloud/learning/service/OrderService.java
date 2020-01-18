package com.lcb.springcloud.learning.service;

import com.lcb.springcloud.learning.common.po.Order;

import java.util.List;

public interface OrderService {
    Order queryById(Integer id);

    List<Order> queryAll();

    Integer addOrder(Order order);
}

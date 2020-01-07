package com.lcb.springcloud.learning.service.impl;

import com.lcb.springcloud.learning.dao.OrderDao;
import com.lcb.springcloud.learning.po.Order;
import com.lcb.springcloud.learning.service.OrderService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public Order queryById(@Param("id") Integer id) {
        return orderDao.queryById(id);
    }

    @Override
    public List<Order> queryAll() {
        return orderDao.queryAll();
    }

    @Override
    public Integer addOrder(Order order) {
        return orderDao.addOrder(order);
    }
}

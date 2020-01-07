package com.lcb.springcloud.learning.dao;

import com.lcb.springcloud.learning.po.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderDao {
    Order queryById(Integer id);

    List<Order> queryAll();

    Integer addOrder(Order order);
}

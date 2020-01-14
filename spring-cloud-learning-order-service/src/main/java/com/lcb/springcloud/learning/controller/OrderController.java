package com.lcb.springcloud.learning.controller;

import com.lcb.springcloud.learning.po.Order;
import com.lcb.springcloud.learning.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("/add")
    public String addStudent(@RequestBody Order order) {
        if (orderService.addOrder(order) != 1) {
            return "添加失败！";
        }
        return "添加成功！";
    }

    @GetMapping("/get/{id}")
    public Order queryById(@PathVariable(name = "id") Integer id) {
        return orderService.queryById(id);
    }

    @GetMapping("/gets")
    public List<Order> queryAll() {
        return orderService.queryAll();
    }

    @GetMapping("/discovery")
    public Object getDiscoveryInfo() {
        List<ServiceInstance> instances = discoveryClient.getInstances("ORDER-SERVICE-8002");
        for (ServiceInstance ins : instances) {
            System.out.println(ins.getServiceId() + "\t" + ins.getHost() + "\t" + ins.getPort() + "\t"
                    + ins.getUri());
        }
        return this.discoveryClient;
    }

}

package com.lcb.springcloud.learning.controller;

import com.lcb.springcloud.learning.po.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/consumer")
public class StudentController {

    //private final String REST_URL_PREFIX = "http://localhost:8001";
    //服务名称
    private final String REST_URL_PREFIX = "http://STUDENT-SERVICE-8001";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/get/{id}")
    public Object queryById(@PathVariable(name = "id") Integer id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/student/get/" + id, Object.class);
    }

    @GetMapping("/gets")
    public Object queryAll() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/student/gets", Object.class);
    }

    @PostMapping("/add")
    public Object add(@RequestBody Student student) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/student/add", student, Object.class);
    }

    @GetMapping("/discovery")
    public Object getDiscoveryInfo() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/student/discovery", Object.class);
    }

}

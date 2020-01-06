package com.lcb.springcloud.learning.controller;

import com.lcb.springcloud.learning.po.Student;
import com.lcb.springcloud.learning.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("/student/add")
    public String addStudent(@RequestBody Student student) {
        if (!studentService.addStudent(student)) {
            return "添加失败！";
        }
        return "添加成功！";
    }

    @GetMapping("/student/get/{id}")
    public Student queryById(@PathVariable(name = "id") Integer id) {
        return studentService.queryById(id);
    }

    @GetMapping("/student/gets")
    public List<Student> queryAll() {
        return studentService.queryAll();
    }

    @GetMapping("/student/discovery")
    public Object getDiscoveryInfo() {
        List<ServiceInstance> instances = discoveryClient.getInstances("STUDENT-SERVICE-8001");
        for (ServiceInstance ins : instances) {
            System.out.println(ins.getServiceId() + "\t" + ins.getHost() + "\t" + ins.getPort() + "\t"
                    + ins.getUri());
        }
        return this.discoveryClient;
    }
}

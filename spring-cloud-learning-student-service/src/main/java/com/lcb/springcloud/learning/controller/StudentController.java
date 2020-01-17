package com.lcb.springcloud.learning.controller;

import com.lcb.springcloud.learning.po.Student;
import com.lcb.springcloud.learning.response.ResponseResult;
import com.lcb.springcloud.learning.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * 新增
     *
     * @param student
     * @return
     */
    @PostMapping("/add")
    public Object addStudent(@RequestBody Student student) {
        if (!studentService.addStudent(student)) {
            return ResponseResult.fail(1000, "添加失败！");
        }
        return ResponseResult.success();
    }

    /**
     * 根据id查询学生信息
     *
     * @param id
     * @return
     */
    @GetMapping("/get/{id}")
    public Object queryById(@PathVariable(name = "id") Integer id) {
        return ResponseResult.success(studentService.queryById(id));
    }

    /**
     * 获取所有学生信息
     *
     * @return
     */
    @GetMapping("/gets")
    public Object queryAll() {
        return ResponseResult.success(studentService.queryAll());
    }

    @GetMapping("/discovery")
    public Object getDiscoveryInfo() {
        List<ServiceInstance> instances = discoveryClient.getInstances("STUDENT-SERVICE-8001");
        for (ServiceInstance ins : instances) {
            System.out.println(ins.getServiceId() + "\t" + ins.getHost() + "\t" + ins.getPort() + "\t"
                    + ins.getUri());
        }
        return this.discoveryClient;
    }
}

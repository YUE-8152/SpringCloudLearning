package com.lcb.springcloud.learning.controller;

import com.lcb.springcloud.learning.common.po.Student;
import com.lcb.springcloud.learning.common.service.StudentFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/feign/student")
public class StudentController {

    @Autowired
    private StudentFeignService feignService;

    @GetMapping("/get/{id}")
    public Object queryById(@PathVariable(name = "id") Integer id) {
        return feignService.queryById(id);
    }

    @GetMapping("/gets")
    public Object queryAll() {
        return feignService.queryAll();
    }

    @PostMapping("/add")
    public Object add(@RequestBody Student student) {
        return feignService.add(student);
    }
}

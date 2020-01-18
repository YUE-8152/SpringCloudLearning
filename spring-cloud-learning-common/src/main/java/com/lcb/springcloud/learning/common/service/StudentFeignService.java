package com.lcb.springcloud.learning.common.service;

import com.lcb.springcloud.learning.common.po.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "STUDENT-SERVICE-8001")
@RequestMapping("/student")
public interface StudentFeignService {

    @GetMapping("/get/{id}")
    public Object queryById(@PathVariable(name = "id") Integer id);

    @GetMapping("/gets")
    public Object queryAll();

    @PostMapping("/add")
    public Object add(@RequestBody Student student);
}

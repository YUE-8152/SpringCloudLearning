package com.lcb.springcloud.learning.service;

import com.lcb.springcloud.learning.po.Student;

import java.util.List;

public interface StudentService {
    public boolean addStudent(Student student);

    public Student queryById(Integer id);

    public List<Student> queryAll();
}

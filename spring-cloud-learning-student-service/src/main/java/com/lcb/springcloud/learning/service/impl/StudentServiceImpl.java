package com.lcb.springcloud.learning.service.impl;

import com.lcb.springcloud.learning.dao.StudentDao;
import com.lcb.springcloud.learning.common.po.Student;
import com.lcb.springcloud.learning.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public boolean addStudent(Student student) {
        boolean b = studentDao.addStudent(student);
        return b;
    }

    @Override
    public Student queryById(Integer id) {
        Student student = studentDao.queryById(id);
        return student;
    }

    @Override
    public List<Student> queryAll() {
        List<Student> list = studentDao.queryAll();
        return list;
    }
}

package com.lcb.springcloud.learning.dao;

import com.lcb.springcloud.learning.common.po.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StudentDao {
    public boolean addStudent(Student student);

    public Student queryById(@Param("id")Integer id);

    public List<Student> queryAll();
}

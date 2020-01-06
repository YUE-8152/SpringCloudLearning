package com.lcb.springcloud.learning.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentDaoTest {

    @Autowired
    private StudentDao studentDao;

    @Test
    public void addStudent() {
    }

    @Test
    public void queryById() {
    }

    @Test
    public void queryAll() {
        System.out.println(studentDao.queryAll());
    }
}

package com.lcb.springcloud.learning.service;
import com.lcb.springcloud.learning.StudentServiceApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = StudentServiceApp.class)
public class StudentServiceTest {

    @Autowired
    private StudentService studentService;

    @Test
    public void testQueryAll(){
        System.out.println(studentService.queryAll());
    }
}

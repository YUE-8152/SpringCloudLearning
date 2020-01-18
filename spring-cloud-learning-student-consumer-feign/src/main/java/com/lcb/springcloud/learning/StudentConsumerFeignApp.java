package com.lcb.springcloud.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.lcb.springcloud.learning"})
public class StudentConsumerFeignApp {
    public static void main(String[] args) {
        SpringApplication.run(StudentConsumerFeignApp.class, args);
    }
}


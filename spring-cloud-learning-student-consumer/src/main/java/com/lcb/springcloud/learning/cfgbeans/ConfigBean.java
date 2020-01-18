package com.lcb.springcloud.learning.cfgbeans;

import com.netflix.loadbalancer.IRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced  //开启Ribbon负责均衡，Ribbon是基于Netfix Ribbon实现的一客户端负载均衡工具
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    public IRule myRule() {
        return null;
    }
}

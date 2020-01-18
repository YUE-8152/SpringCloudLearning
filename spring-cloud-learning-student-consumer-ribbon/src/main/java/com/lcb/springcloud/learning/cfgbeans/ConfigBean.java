package com.lcb.springcloud.learning.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
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

    @Bean
    public IRule myRule() {
        //自定义的负载均衡算法
        //return new RandomRule();  //轮询（默认）
        return new RandomRule();   //随机
    }
}

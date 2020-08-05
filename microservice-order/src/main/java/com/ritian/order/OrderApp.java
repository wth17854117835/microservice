package com.ritian.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @author: wangth_oup
 * @date: 2020-04-14 17:19
 * @description:
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
@EnableFeignClients
public class OrderApp {
    public static void main(String[] args) {
        SpringApplication.run(OrderApp.class, args);
    }

    /**
     * 向Spring容器中定义RestTemplate对象
     * @return
     */
    @Bean
    @LoadBalanced // 标注此注解后，RestTemplate就具有了客户端负载均衡能力
    public RestTemplate restTemplate() {
//        return new RestTemplate();
        return new RestTemplate(new OkHttp3ClientHttpRequestFactory());
    }

}

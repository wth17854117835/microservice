package com.ritian.eureka;

/**
 * @author: wangth_oup
 * @date: 2020-04-14 17:53
 * @description:
 **/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka注册中心
 */
@SpringBootApplication
@EnableEurekaServer //声明这是一个Eureka服务
public class AppEureka {
    public static void main(String[] args) {
        SpringApplication.run(AppEureka.class, args);
    }
}

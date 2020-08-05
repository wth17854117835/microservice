package com.ritian.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: wangth_oup
 * @date: 2020-04-16 17:11
 * @description:
 **/
@SpringBootApplication //声明这是一个Spring Boot项目
@EnableEurekaClient
//@ComponentScan(basePackageClasses = {"com.ritian.item.controller","com.ritian.item.service"})//手动指定bean组件扫描范围
//启动类放到包的最外层，这样不配置componentscan也可以扫描， 放到里面的，得配置上componentscan
public class ItemApp {
    public static void main(String[] args) {
        SpringApplication.run(ItemApp.class, args);
    }
}
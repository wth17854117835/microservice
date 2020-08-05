package com.ritian.item.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author: wangth_oup
 * @date: 2020-04-16 17:15
 * @description: 手动刷新获取码云上的最新配置 http://localhost:8084/actuator/refresh
 **/
@Component
@Data
@RefreshScope//需要为动态更新配置内容的bean添加@RefreshScope注解
public class JDBCConfig {
    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    @Value("${jdbc.driverClassName}")
    private String driverClassName;
}

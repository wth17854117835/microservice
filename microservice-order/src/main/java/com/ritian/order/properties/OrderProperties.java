package com.ritian.order.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: wangth_oup
 * @date: 2020-04-14 17:36
 * @description:
 **/
@Component
@ConfigurationProperties(prefix="myspcloud")
@Data
public class OrderProperties {
    private ItemProperties item = new ItemProperties();
}

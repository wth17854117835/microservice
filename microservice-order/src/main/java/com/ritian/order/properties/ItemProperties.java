package com.ritian.order.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: wangth_oup
 * @date: 2020-04-14 17:37
 * @description:
 **/
@Component
@ConfigurationProperties
@Data
public class ItemProperties {
    private String url;
}

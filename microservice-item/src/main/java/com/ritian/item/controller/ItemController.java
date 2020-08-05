package com.ritian.item.controller;

import com.ritian.item.config.JDBCConfig;
import com.ritian.item.entity.Item;
import com.ritian.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wangth_oup
 * @date: 2020-04-16 17:14
 * @description:
 **/
@RestController
public class ItemController {
    @Value("${server.port}")
    private String port;

    @Autowired
    private ItemService itemService;

    @Autowired
    private JDBCConfig jdbcConfig;

    /**
     * 对外提供接口服务，查询商品信息
     * @param id
     * @return
     */
    @GetMapping(value = "item/{id}")
    public Item queryItemById(@PathVariable("id") Long id) {
        System.out.println("service port："+port);
        return this.itemService.queryItemById(id);
    }

    @GetMapping(value = "testconfig")
    public String testconfig(){
        return this.jdbcConfig.toString();
    }

}

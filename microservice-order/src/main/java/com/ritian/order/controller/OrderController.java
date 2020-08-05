package com.ritian.order.controller;

import com.ritian.order.entity.Order;
import com.ritian.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wangth_oup
 * @date: 2020-04-14 17:17
 * @description:
 **/
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping(value = "order/{orderId}")
    public Order queryOrderById(@PathVariable("orderId") String orderId) {
        return this.orderService.queryOrderById(orderId);
    }

    @GetMapping(value = "order2/{orderId}")
    public Order queryOrderById2(@PathVariable("orderId") String orderId) {
        return this.orderService.queryOrderByIdx(orderId);
    }
}

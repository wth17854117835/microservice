package com.ritian.order.entity;

import lombok.Data;

/**
 * @author: wangth_oup
 * @date: 2020-04-14 16:54
 * @description:
 **/
@Data
public class OrderDetail {

    private String orderId;
    private Item item = new Item();

    public OrderDetail() {
    }

    public OrderDetail(String orderId, Item item) {
        this.orderId = orderId;
        this.item = item;
    }
}

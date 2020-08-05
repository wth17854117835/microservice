package com.ritian.order.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author: wangth_oup
 * @date: 2020-04-14 16:53
 * @description:
 **/
@Data
public class Order {

    private String orderId;
    private Long userId;
    private Date createDate;
    private Date updateDate;
    private List<OrderDetail> orderDetails;

    public Order() {
    }

    public Order(String orderId, Long userId, Date createDate, Date updateDate, List<OrderDetail> orderDetails) {
        this.orderId = orderId;
        this.userId = userId;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.orderDetails = orderDetails;
    }
}

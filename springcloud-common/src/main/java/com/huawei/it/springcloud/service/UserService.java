package com.huawei.it.springcloud.service;

import com.huawei.it.springcloud.entities.Order;

public interface UserService {
    Order getOrder(String orderId);
    void addOrder(Order order);
}

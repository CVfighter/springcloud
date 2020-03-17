package com.huawei.it.springcloud.service;

import com.huawei.it.springcloud.entities.Item;

import java.util.List;

public interface ItemService {
    List<Item> getItems(String orderId);
    void decreaseNumbers(List<Item> items);
}

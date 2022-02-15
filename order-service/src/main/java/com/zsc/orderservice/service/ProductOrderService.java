package com.zsc.orderservice.service;


import com.zsc.orderservice.entity.ProductOrder;

public interface ProductOrderService {
    ProductOrder save(int userId, int productId);
}
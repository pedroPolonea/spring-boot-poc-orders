package com.orders.service;

import com.orders.entity.OrderEntity;
import com.orders.entity.OrderItemsEntity;

import java.util.List;
import java.util.Optional;

public interface OrderItemsService {

    List<OrderItemsEntity> getAll();

    Optional<OrderItemsEntity> getId(Long id);

    List<OrderItemsEntity> findByOrder(OrderEntity order);

    OrderItemsEntity save(OrderItemsEntity orderItems);
}

package com.orders.service;

import com.orders.entity.OrderEntity;

import java.util.List;
import java.util.Optional;

public interface OrderService {

    List<OrderEntity> getAll();

    Optional<OrderEntity> getId(Long id);

    OrderEntity save(OrderEntity order);
}

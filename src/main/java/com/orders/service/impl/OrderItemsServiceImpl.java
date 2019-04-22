package com.orders.service.impl;

import com.orders.entity.OrderEntity;
import com.orders.entity.OrderItemsEntity;
import com.orders.repository.OrderItemsRepository;
import com.orders.service.OrderItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderItemsServiceImpl implements OrderItemsService {
    @Autowired
    private OrderItemsRepository orderItemsRepository;

    @Override
    public List<OrderItemsEntity> getAll() {
        return orderItemsRepository.findAll();
    }

    @Override
    public Optional<OrderItemsEntity> getId(Long id) {
        return orderItemsRepository.findById(id);
    }

    @Override
    public List<OrderItemsEntity> findByOrder(OrderEntity order) {
        return orderItemsRepository.findByOrderAsc(order);
    }

    @Override
    public OrderItemsEntity save(OrderItemsEntity orderItems) {
        return orderItemsRepository.save(orderItems);
    }
}

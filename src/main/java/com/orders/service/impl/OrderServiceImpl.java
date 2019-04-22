package com.orders.service.impl;

import com.orders.entity.OrderEntity;
import com.orders.repository.OrderRepository;
import com.orders.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<OrderEntity> getAll() {
        return orderRepository.findAll();
    }

    @Override
    public Optional<OrderEntity> getId(Long id) {
        return orderRepository.findById(id);
    }

    @Override
    public OrderEntity save(OrderEntity order) {
        return orderRepository.save(order);
    }
}

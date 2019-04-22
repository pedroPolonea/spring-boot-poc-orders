package com.orders.repository;

import com.orders.entity.OrderEntity;
import com.orders.entity.OrderItemsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderItemsRepository extends JpaRepository<OrderItemsEntity, Long> {

    List<OrderItemsEntity> findByOrder(OrderEntity orderEntity);
}

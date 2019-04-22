package com.orders.service;

import com.orders.entity.ProductEntity;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<ProductEntity> getAll();

    Optional<ProductEntity> getId(Long id);

    ProductEntity save(ProductEntity product);
}

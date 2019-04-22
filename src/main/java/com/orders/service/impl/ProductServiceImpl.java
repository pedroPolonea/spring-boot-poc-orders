package com.orders.service.impl;

import com.orders.entity.ProductEntity;
import com.orders.repository.ProductRepository;
import com.orders.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;


    @Override
    public List<ProductEntity> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<ProductEntity> getId(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public ProductEntity save(ProductEntity product) {
        return productRepository.save(product);
    }
}

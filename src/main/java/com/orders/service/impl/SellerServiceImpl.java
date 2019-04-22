package com.orders.service.impl;

import com.orders.entity.ProductEntity;
import com.orders.entity.SellerEntity;
import com.orders.repository.SellerRepository;
import com.orders.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerRepository sellerRepository;


    @Override
    public List<SellerEntity> getAll() {
        return sellerRepository.findAll();
    }

    @Override
    public Optional<SellerEntity> getId(Long id) {
        return sellerRepository.findById(id);
    }

    @Override
    public SellerEntity save(SellerEntity seller) {
        return sellerRepository.save(seller);
    }


}

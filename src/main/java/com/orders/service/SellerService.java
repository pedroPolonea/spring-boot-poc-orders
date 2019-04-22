package com.orders.service;

import com.orders.entity.SellerEntity;

import java.util.List;
import java.util.Optional;

public interface SellerService {

    List<SellerEntity> getAll();

    Optional<SellerEntity> getId(Long id);

    SellerEntity save(SellerEntity seller);

}

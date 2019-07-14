package com.orders.service;

import com.orders.entity.ProductEntity;
import com.orders.map.vo.ProductVO;
import javassist.NotFoundException;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<ProductEntity> getAll();

    Optional<ProductEntity> getId(Long id);

    List<ProductEntity> findAllActive();

    ProductVO save(ProductVO productVO);

    ProductVO update(Optional<ProductVO> productVO) throws Exception;

    void delete(final Optional<Long> id) throws NotFoundException;
}

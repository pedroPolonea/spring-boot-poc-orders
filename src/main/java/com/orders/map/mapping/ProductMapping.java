package com.orders.map.mapping;

import com.orders.entity.ProductEntity;
import com.orders.map.vo.ProductSummaryVO;
import com.orders.map.vo.ProductVO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapping {

    ProductVO productEntityToProductVO(ProductEntity product);

    ProductEntity productVOToProductEntity(ProductVO vo);

    List<ProductSummaryVO> productEntityToProductSummaryVO(List<ProductEntity> products);

}

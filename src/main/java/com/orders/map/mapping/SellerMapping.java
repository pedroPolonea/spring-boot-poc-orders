package com.orders.map.mapping;

import com.orders.entity.SellerEntity;
import com.orders.map.vo.SellerSummaryVO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SellerMapping {

    SellerSummaryVO sellerEntityToSellerSummaryVO(SellerEntity sellerEntity);

    List<SellerSummaryVO> sellerEntityToSellerSummaryVO(List<SellerEntity> sellers);
}

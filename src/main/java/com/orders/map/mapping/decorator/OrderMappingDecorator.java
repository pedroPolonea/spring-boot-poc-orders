package com.orders.map.mapping.decorator;

import com.orders.entity.OrderEntity;
import com.orders.map.mapping.OrderMapping;
import com.orders.map.mapping.SellerMapping;
import com.orders.map.vo.OrderSummaryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public abstract class OrderMappingDecorator implements OrderMapping {

    @Autowired
    private SellerMapping sellerMapping;

    @Autowired
    @Qualifier("delegate")
    protected OrderMapping delegate;

    @Override
    public OrderSummaryVO orderEntityToOrderSummaryVO(OrderEntity order){
        OrderSummaryVO orderSummaryVO = delegate.orderEntityToOrderSummaryVO(order);
        orderSummaryVO.setSellerSummaryVO(sellerMapping.sellerEntityToSellerSummaryVO(order.getSellerEntity()));
        return orderSummaryVO;
    }
}

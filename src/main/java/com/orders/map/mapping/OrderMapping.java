package com.orders.map.mapping;

import com.orders.entity.OrderEntity;
import com.orders.entity.OrderItemsEntity;
import com.orders.map.mapping.decorator.OrderMappingDecorator;
import com.orders.map.vo.OrderSummaryVO;
import org.apache.commons.collections4.CollectionUtils;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.math.BigDecimal;
import java.util.List;


@Mapper(componentModel = "spring")
@DecoratedWith(OrderMappingDecorator.class)
public interface OrderMapping {

    @Mapping(target = "sellerSummaryVO", ignore = true)
    @Mapping(target = "amountItems", expression = "java((int)java.util.Optional.ofNullable(order.getItems()).stream().count())")
    @Mapping(source = "order.items", target = "amountValue", qualifiedByName = "sumValue")
    OrderSummaryVO orderEntityToOrderSummaryVO(OrderEntity order);

    @Named("sumValue")
    default BigDecimal sumValue(final List<OrderItemsEntity> items) {
        BigDecimal value = BigDecimal.ZERO;

        if(items != null) {
            for (OrderItemsEntity item : items) {
                value.add(item.getUnitaryValue().multiply(new BigDecimal(item.getAmount())));
            }
        }

        return value;
    }
}

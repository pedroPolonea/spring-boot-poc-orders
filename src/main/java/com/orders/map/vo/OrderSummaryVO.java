package com.orders.map.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderSummaryVO {

    private Long id;

    private SellerSummaryVO sellerSummaryVO;

    private String orderStatus;

    private LocalDateTime dateCreation;

    private Integer amountItems;

    private Integer amountProduct;

    private BigDecimal amountValue;
}

package com.orders.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "order_items")
public class OrderItemsEntity {

    @Id
    @Column(name = "ID_ORDER_ITENS", unique = true, nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name="ID_ORDER", nullable=false)
    private OrderEntity order;

    @ManyToOne
    @JoinColumn(name="ID_PRODUCT", nullable=false)
    private ProductEntity product;

    @Column(name ="UNITARY_VALUE", nullable = false)
    private BigDecimal unitaryValue;

    @Column(name = "AMOUNT", nullable = false)
    private Integer amount;



}

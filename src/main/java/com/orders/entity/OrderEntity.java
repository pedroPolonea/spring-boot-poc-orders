package com.orders.entity;

import com.orders.entity.enums.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "orders")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID_ORDERS", unique = true, nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name="ID_SELLER", nullable=false)
    private SellerEntity sellerEntity;

    @Enumerated(EnumType.STRING)
    @Column(name = "ORDER_STATUS")
    private OrderStatus orderStatus;

    @Column(name = "DAT_CREATION", nullable = false)
    private LocalDateTime dateCreation;

    @OneToMany(mappedBy="order", orphanRemoval=true, cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrderItemsEntity> items;

    @PrePersist
    public void prePersist() {
        this.dateCreation = LocalDateTime.now();
        this.orderStatus = OrderStatus.OPEN;
    }
}

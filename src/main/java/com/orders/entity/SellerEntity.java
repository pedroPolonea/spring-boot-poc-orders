package com.orders.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "sellers")
public class SellerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID_SELLER", nullable = false, unique = true)
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "DAT_CREATION")
    private LocalDateTime dateCreation;

    @Column(name = "ACTIVE", nullable = false)
    private Boolean active;

    @OneToMany(mappedBy="sellerEntity", orphanRemoval=true, cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrderEntity> order;

    @PrePersist
    public void prePersist() {
        this.dateCreation = LocalDateTime.now();
        this.active = true;
    }
}

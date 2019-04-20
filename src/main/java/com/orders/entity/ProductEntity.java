package com.orders.entity;

import com.orders.entity.enums.ProductType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "products")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID_PRODUCT", nullable = false, unique = true)
    private Long Id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "AMOUNT", nullable = false)
    private Integer amount;

    @Column(name ="UNITARY_VALUE", nullable = false)
    private BigDecimal unitaryValue;

    @Column(name = "ACQUISITION_VALUE", nullable = false)
    private BigDecimal acquisitionValue;

    @Column(name = "DAT_ACQUISITION")
    private LocalDateTime dateAcquisition;

    @Column(name = "DAT_CREATION")
    private LocalDateTime dateCreation;

    @Column(name = "ACTIVE", nullable = false)
    private Boolean active;

    @Enumerated(EnumType.STRING)
    @Column(name = "PRODUCT_TYPE", nullable = false)
    private ProductType productType;

    @OneToMany(mappedBy="product", orphanRemoval=true, cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrderItemsEntity> items;

    @PrePersist
    public void prePersist() {
        this.dateCreation = LocalDateTime.now();
        this.active = true;
    }

    @PreUpdate
    public void preUpdate(){

    }




}

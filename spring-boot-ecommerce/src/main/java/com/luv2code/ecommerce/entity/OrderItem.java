package com.luv2code.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "order_item")
@Getter
@Setter
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "unit_Price")
    private BigDecimal unitPrice;

    @Column(name = "quantity")
    private  int quantity;

    @Column(name = "product_Id")
    private Long productId;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}

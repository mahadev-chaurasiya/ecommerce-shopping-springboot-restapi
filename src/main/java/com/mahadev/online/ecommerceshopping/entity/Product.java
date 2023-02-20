package com.mahadev.online.ecommerceshopping.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author MAHADEV CHAURASIYA
 * <a href="https://www.linkedin.com/in/mahadev-chaurasiya/">MAHADEV CHAURASIYA</a>
 */
@Entity
@Table(name = "product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pId")
    private Long productId;
    @Column(name = "pName")
    private String productName;
    @Column(name = "pDesc")
    private String productDesc;
    @Column(name = "pQty")
    private int productQty;
    @Column(name = "pPrice")
    private double productPrice;
    @Column(name = "pIsOffer")
    private boolean productIsOffer;
    @Column(name = "pDiscount")
    private int productDiscount;
    @Column(name = "pCoupon")
    private String productCoupon;
}

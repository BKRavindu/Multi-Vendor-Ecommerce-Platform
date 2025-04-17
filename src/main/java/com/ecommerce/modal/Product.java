package com.ecommerce.modal;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String description;

    private Double price;

    private double sellingPrice;

    private double discountPercent;

    private int quantity;

    private String color;

    @ElementCollection
    private List<String> images = new ArrayList<>();

    private int numRatings;

    @ManyToOne
    private Category category;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private LocalDateTime createdAt;

    @ManyToOne
    private Seller seller;

    private String size;

    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<Review> reviews = new ArrayList<>();

}

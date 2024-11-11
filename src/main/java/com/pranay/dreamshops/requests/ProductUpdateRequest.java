package com.pranay.dreamshops.requests;

import java.math.BigDecimal;

import com.pranay.dreamshops.model.Category;

import lombok.Data;

@Data
public class ProductUpdateRequest {
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private int inventory; // quantity of product.
    private String description;
    private Category category;
}

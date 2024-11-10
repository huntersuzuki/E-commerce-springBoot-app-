package com.pranay.dreamshops.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pranay.dreamshops.model.Product;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategoryName(String category);

    List<Product> findByBrandName(String brand);

    List<Product> findByCategoryNameAndBrandName(String category, String brand);

    List<Product> findByProductName(String name);
}

package com.pranay.dreamshops.services.product;

import java.util.List;

import com.pranay.dreamshops.model.Product;

public interface IProductService {
    Product addProduct(Product product);

    Product getProductById(Long id);

    void deleteProductById(Long id);

    void updateProduct(Product product, Long productId);

    List<Product> getAllProducts();

    List<Product> getProductsByCategory(String category);

    List<Product> getProductsByBrand(String brand);

    List<Product> getProductsByCategoryAndBrand(String category, String brand);

    List<Product> getProductByName(String name);

    List<Product> getProductsByNameAndBrand(String name, String brand);

    Long countProductsByBrandAndName(String brand, String name);
}

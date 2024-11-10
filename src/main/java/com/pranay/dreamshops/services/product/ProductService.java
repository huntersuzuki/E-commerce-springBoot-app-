package com.pranay.dreamshops.services.product;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pranay.dreamshops.exceptions.ProductNotFoundException;
import com.pranay.dreamshops.model.Product;
import com.pranay.dreamshops.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService implements IProductService {

    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Long countProductsByBrandAndName(String brand, String name) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteProductById(Long id) {
        productRepository.findById(id)
                .ifPresentOrElse(productRepository::delete,
                        () -> {
                            throw new ProductNotFoundException("Product not found");
                        });

    }

    @Override
    public List<Product> getAllProducts() {

        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {

        return productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException("Product not found"));
    }

    @Override
    public List<Product> getProductByName(String name) {
        
        return productRepository.findByProductName(name);
    }

    @Override
    public List<Product> getProductsByBrand(String brand) {
        return productRepository.findByBrandName(brand);
    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        return productRepository.findByCategoryName(category);
    }

    @Override
    public List<Product> getProductsByCategoryAndBrand(String category, String brand) {
        return productRepository.findByCategoryNameAndBrandName(category, brand);
    }

    @Override
    public List<Product> getProductsByNameAndBrand(String name, String brand) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void updateProduct(Product product, Long productId) {
        // TODO Auto-generated method stub

    }

}

package com.pranay.dreamshops.services.product;

import java.util.List;

import com.pranay.dreamshops.dto.ProductDto;
import com.pranay.dreamshops.model.Product;
import com.pranay.dreamshops.requests.AddProductRequest;
import com.pranay.dreamshops.requests.ProductUpdateRequest;
import org.springframework.stereotype.Service;

@Service
public interface IProductService {
	Product addProduct(AddProductRequest product);

	Product getProductById(Long id);

	void deleteProductById(Long id);

	Product updateProduct(ProductUpdateRequest product, Long productId);

	List<Product> getAllProducts();

	List<Product> getProductsByCategory(String category);

	List<Product> getProductsByBrand(String brand);

	List<Product> getProductsByCategoryAndBrand(String category, String brand);

	List<Product> getProductByName(String name);

	List<Product> getProductsByBrandAndName(String brand, String name);

	Long countProductsByBrandAndName(String brand, String name);

	List<ProductDto> getConvertedProducts(List<Product> products);

	ProductDto convertToDto(Product product);
}

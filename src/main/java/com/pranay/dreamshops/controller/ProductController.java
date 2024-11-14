package com.pranay.dreamshops.controller;

import com.pranay.dreamshops.exceptions.ResourceNotFoundException;
import com.pranay.dreamshops.model.Product;
import com.pranay.dreamshops.requests.AddProductRequest;
import com.pranay.dreamshops.requests.ProductUpdateRequest;
import com.pranay.dreamshops.response.ApiResponse;
import com.pranay.dreamshops.services.product.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@RequiredArgsConstructor
@RestController
@RequestMapping("${api.prefix}/products")
public class ProductController {
	private final IProductService productService;

	@GetMapping("/all-products")
	public ResponseEntity<ApiResponse> getAllProducts() {
		List<Product> products = productService.getAllProducts();
		return ResponseEntity.ok(new ApiResponse("Found all products", products));
	}

	@GetMapping("product/{productId}/product")
	public ResponseEntity<ApiResponse> getProductById(@PathVariable("productId") Long id) {
		try {
			Product product = productService.getProductById(id);
			return ResponseEntity.ok(new ApiResponse("Product found.", product));
		} catch (ResourceNotFoundException e) {
			return ResponseEntity.status(NOT_FOUND).body(new ApiResponse(e.getMessage(), null));
		}
	}

	@PostMapping("/add-products")
	public ResponseEntity<ApiResponse> addProduct(@RequestBody AddProductRequest product) {
		try {
			Product theProduct = productService.addProduct(product);
			return ResponseEntity.ok(new ApiResponse("Successfully add the product", theProduct));
		} catch (Exception e) {
			return ResponseEntity.status(INTERNAL_SERVER_ERROR).body(new ApiResponse(e.getMessage(), null));
		}
	}

	@PutMapping("/product/{productId}/update")
	public ResponseEntity<ApiResponse> updateProduct(@RequestBody ProductUpdateRequest request,
			@PathVariable Long productId) {
		try {
			Product updatedProduct = productService.updateProduct(request, productId);
			return ResponseEntity.ok(new ApiResponse("Product updated successfully", updatedProduct));
		} catch (ResourceNotFoundException e) {
			return ResponseEntity.status(NOT_FOUND).body(new ApiResponse(e.getMessage(), null));
		}
	}

	@DeleteMapping("/product/{productId}/delete")
	public ResponseEntity<ApiResponse> deleteProduct(@PathVariable Long productId) {
		try {
			productService.deleteProductById(productId);
			return ResponseEntity.ok(new ApiResponse("Product deleted successfully", productId));
		} catch (ResourceNotFoundException e) {
			return ResponseEntity.status(NOT_FOUND).body(new ApiResponse(e.getMessage(), null));
		}
	}
}

package com.ezshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ezshop.entity.Product;
import com.ezshop.entity.ProductsResponse;
import com.ezshop.repository.ProductRepository;

@RestController
@RequestMapping("/api")
public class ProductController {
	@Autowired
	ProductRepository productRepository;

	@GetMapping("/products")
	private List<Product> getAllProducts() {
		List<Product> productsList = productRepository.findAll();
		return productsList;
	}
	
	@GetMapping("/products/response")
	private ProductsResponse getAllProductsResponse() {
		List<Product> productsList = productRepository.findAll();
		ProductsResponse productsResponse = new ProductsResponse();
		productsResponse.setProducts(productsList);
		return productsResponse;
	}

	// SEARCH PRODUCTS BY PRODUCT NAME
	@GetMapping("/products/find/{productName}")
	public List<Product> searchProductByName(@PathVariable(value="productName") String productName){
		List<Product>  productsList = productRepository.findByProductName(productName);
		return productsList;
	}
	
}

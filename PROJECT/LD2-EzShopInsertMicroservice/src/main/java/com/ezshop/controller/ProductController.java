package com.ezshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ezshop.entity.Product;
import com.ezshop.repository.ProductRepository;

@RestController
@RequestMapping("/api")
public class ProductController {
	@Autowired
	ProductRepository productRepository;

	@PostMapping("/products")
	private Product createProduct(@RequestBody Product productFromBrowser) {
//	    {
//	        "productId": "P100",
//	        "productName": "IPhones",
//	        "price": 5005,
//	        "quantity": 55
//	    }
		// ACCEPT PRODUCT DETAILS FROM USER
		Product savedProduct = productRepository.save(productFromBrowser);
		return savedProduct;
	}
}

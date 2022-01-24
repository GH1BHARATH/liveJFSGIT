package com.ezshop;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.ezshop.model.Product;
import com.ezshop.repository.ProductRepository;

public class ProductRepositoryTest {

	public static ProductRepository productRepository = null;

	@BeforeClass
	public static void initProductRepository() {
		productRepository = new ProductRepository();
	}

	@Test
	public void saveProduct() {
//		ACCEPT PRODUCT DETAILS FROM USER
		Product product = new Product("P05", "7HOHSP", 50, 100);
		Product savedProduct = productRepository.save(product);
		assertEquals("P05", savedProduct.getProductId());
		assertEquals("7HOHSP", savedProduct.getProductName());
		assertEquals(50, savedProduct.getPrice());
		assertEquals(100, savedProduct.getQuantity());
	}
}

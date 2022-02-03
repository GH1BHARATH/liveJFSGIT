package com.ezshop.repository;

import java.util.List;

import com.ezshop.model.Product;

public interface ProductRepository {
	public List<Product> findAll();
	public Product save(Product product);
}

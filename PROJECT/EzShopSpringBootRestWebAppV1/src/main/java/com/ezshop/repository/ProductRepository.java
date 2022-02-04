package com.ezshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ezshop.entity.Product;

public interface ProductRepository extends JpaRepository<Product, String>{
	
}

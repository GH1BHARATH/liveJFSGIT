package com.ezshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ezshop.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, String>{
	
}

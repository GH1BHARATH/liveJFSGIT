package com.ezshop.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.ezshop.entity.Product;

public class ProductRepositoryHibernate {
	private EntityManager entityManager;

	public ProductRepositoryHibernate() {
//	super();
		entityManager = MySQLPersistenceUnit.getEnityManager();
	}

	public Product getProductById(String productId) {
		Product product = entityManager.find(Product.class, productId);
		return product;
	}
	public void saveProduct(Product product) {
		beginTransaction();
		entityManager.persist(product);
		commitTransaction();
	}
	public void updateProduct(Product product) {
		beginTransaction();
		entityManager.merge(product);
		commitTransaction();
	}
	public void removeProduct(Product product) {
		beginTransaction();
		entityManager.remove(product);
		commitTransaction();
	}
	public void beginTransaction() {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
	}
	public void commitTransaction() {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.commit();
	}
}

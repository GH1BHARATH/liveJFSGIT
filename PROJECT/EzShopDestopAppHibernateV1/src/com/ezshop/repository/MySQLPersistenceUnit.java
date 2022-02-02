package com.ezshop.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MySQLPersistenceUnit {
	public static EntityManager getEnityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA_PU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
	}
}

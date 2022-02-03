package com.ezshop.ui;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ezshop.model.Product;
import com.ezshop.repository.ProductRepository;

public class EzShopApp {
	Scanner scanner = null;
	ProductRepository productRepository = null;
	ProductRepository productRepositoryUpdated = null;

	public static void main(String[] args) {
		EzShopApp ezShopApp = new EzShopApp();
		ezShopApp.displayMenu();
	}

	public EzShopApp() {
		scanner = new Scanner(System.in);
		// IOC - Inversion of Control Container
		// TRADITIONAL WAY : productRepository = new ProductRepositoryImpl();

		// Load the IOC Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Object productRepositoryObject = context.getBean("productRepository");
//		productRepository = (ProductRepository)productRepositoryObject;
		productRepository = context.getBean("productRepository", ProductRepository.class);
		productRepositoryUpdated = context.getBean("productRepositoryUpdated", ProductRepository.class);
		
	}

	private void displayMenu() {
		System.out.println("WELCOME TO EZSHOP");
		System.out.println("===================");
		while_label: while (true) {
			System.out.println("\n1. DISPLAY PRODUCTS");
			System.out.println("2. ADD PRODUCT");
			System.out.println("0. EXIT");
			System.out.print("ENTER CHOICE : ");
			int choice = Integer.parseInt(scanner.nextLine());
			System.out.println();

			switch (choice) {
			case 1: {
				findAllProducts();
				break;
			}
			case 2: {
				saveProduct();
				break;
			}
			case 0: {
				break while_label;
			}

			default: {
				System.out.println("Enter a valid option");
			}
			}
		}
		System.out.println("THANK YOU !!!");
		System.out.println("===================");
	}

	private void findAllProducts() {
		System.out.println("PRODUCTS");
		List<Product> productsList = productRepository.findAll();
		if (productsList.size() > 0) {
			productsList.forEach(System.out::println);
		} else {
			System.out.println("NO PRODUCTS");
		}
		System.out.println("*************");
		System.out.println("PRODUCTS UPDATED");
		List<Product> productsListUpdated = productRepositoryUpdated.findAll();
		if (productsListUpdated.size() > 0) {
			productsListUpdated.forEach(System.out::println);
		} else {
			System.out.println("NO PRODUCTS");
		}
	}

	private void saveProduct() {
//		ACCEPT PRODUCT DETAILS FROM USER
		Product product = new Product("P04", "7H", 50, 100);
		Product savedProduct = productRepository.save(product);
	}
}

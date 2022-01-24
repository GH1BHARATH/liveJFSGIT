package com.ezshop;

import java.util.List;
import java.util.Scanner;

import com.ezshop.model.Product;
import com.ezshop.repository.ProductRepository;

public class EzShopApp {
	Scanner scanner = null;
	ProductRepository productRepository = null;


	public static void main(String[] args) {
		EzShopApp ezShopApp = new EzShopApp();
		ezShopApp.displayMenu();
	}

	public EzShopApp() {
		scanner = new Scanner(System.in);
		productRepository = new ProductRepository();
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
		List<Product> productsList = productRepository.findAll();
		if (productsList.size() > 0) {
			productsList.forEach(System.out::println);
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

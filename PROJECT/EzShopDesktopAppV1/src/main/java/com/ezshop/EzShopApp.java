package com.ezshop;

import java.util.List;
import java.util.Scanner;

import com.ezshop.model.Product;
import com.ezshop.repository.ProductRepository;

public class EzShopApp {
	public static void main(String[] args) {
		EzShopApp ezShopApp = new EzShopApp();
		ezShopApp.displayMenu();
	}

	private void displayMenu() {
		System.out.println("WELCOME TO EZSHOP\n");
		System.out.println("1. DISPLAY PRODUCTS");
		Scanner scanner = new Scanner(System.in);
		int choice = Integer.parseInt(scanner.nextLine());
		if (choice == 1) {
			ProductRepository productRepository = new ProductRepository();
			List<Product> productsList = productRepository.findAll();
			if (productsList.size() > 0) {
				productsList.forEach(System.out::println);
			} else {
				System.out.println("NO PRODUCTS");
			}
		}
	}
}

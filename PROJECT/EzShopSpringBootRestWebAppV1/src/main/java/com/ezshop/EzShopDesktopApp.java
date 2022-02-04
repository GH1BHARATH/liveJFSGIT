package com.ezshop;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ezshop.entity.Product;
import com.ezshop.repository.ProductRepository;

@SpringBootApplication

public class EzShopDesktopApp implements CommandLineRunner{
	Scanner scanner = null;
	// SPRING FREAMWORK CREATES THE INSTANCE OF PRODUCT REPOSITORY
	// AND INJECTS IT DEPENDENCY INJECTION (DI) 
	@Autowired
	ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(EzShopDesktopApp.class, args);
	}

	public EzShopDesktopApp() {
		scanner = new Scanner(System.in);
	}

	private void displayMenu() {
		System.out.println("WELCOME TO EZSHOP");
		System.out.println("===================");
		while_label: while (true) {
			System.out.println("\n1. FIND PRODUCT");
			System.out.println("2. ADD PRODUCT");
			System.out.println("3. UPDATE PRODUCT");
			System.out.println("4. DELETE PRODUCT");
			System.out.println("0. EXIT");
			System.out.print("ENTER CHOICE : ");
			int choice = Integer.parseInt(scanner.nextLine());
			System.out.println();

			switch (choice) {
			case 1: {
				findProduct();
				break;
			}
			case 2: {
				saveProduct();
				break;
			}
			case 3: {
				updateProduct();
				break;
			}
			case 4: {
				deleteProduct();
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

	private void findProduct() {
		Product product = productRepository.findById("P01").get();
		if(product != null) {
		System.out.println(product);
		}
		else {
			System.out.println("Product Not Found!!!");
		}
	}

	private void saveProduct() {
//		ACCEPT PRODUCT DETAILS FROM USER 
		Product product = new Product("PH01", "PN1", 50, 100);
		productRepository.save(product);
	}

	private void updateProduct() {
//		ACCEPT PRODUCT DETAILS FROM USER
		Product product = productRepository.findById("PH01").get();
		product.setProductName("PN2");
		product.setPrice(500);
		product.setQuantity(1000);
		productRepository.save(product);
	}

	private void deleteProduct() {
		String productID = scanner.nextLine();
		Product product = productRepository.findById(productID).get();
		productRepository.delete(product);
	}

	@Override
	public void run(String... args) throws Exception {
	this.displayMenu();	
	}
}

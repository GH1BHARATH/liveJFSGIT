package com.ezshop.ui;

import java.util.Scanner;

import com.ezshop.entity.Product;
import com.ezshop.repository.ProductRepositoryHibernate;

public class EzShopAppHibernate {
	Scanner scanner = null;
	ProductRepositoryHibernate productRepositoryHibernate = null;

	public static void main(String[] args) {
		EzShopAppHibernate ezShopApp = new EzShopAppHibernate();
		ezShopApp.displayMenu();
	}

	public EzShopAppHibernate() {
		scanner = new Scanner(System.in);
		productRepositoryHibernate = new ProductRepositoryHibernate();
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
		Product product = productRepositoryHibernate.getProductById("PH01");
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
		productRepositoryHibernate.saveProduct(product);
	}

	private void updateProduct() {
//		ACCEPT PRODUCT DETAILS FROM USER
		Product product = productRepositoryHibernate.getProductById("PH01");
		product.setProductName("PN2");
		product.setPrice(500);
		product.setQuantity(1000);
		productRepositoryHibernate.updateProduct(product);
	}

	private void deleteProduct() {
		String productID = scanner.nextLine();
		Product product = productRepositoryHibernate.getProductById(productID);
		productRepositoryHibernate.removeProduct(product);
	}
}

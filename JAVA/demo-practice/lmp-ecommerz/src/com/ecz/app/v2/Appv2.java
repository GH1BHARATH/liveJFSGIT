package com.ecz.app.v2;

import java.util.ArrayList;

public class Appv2 {
//LAB : ACCECPT 3 BOOKS FROM THE USER AND STORE THEM
// ACCEPT BOOK TO BE SEARCHED BY A USER AND DISPLAY IF IT IS FOUND OR NOT.
	public static void main(String[] args) {
		System.out.println("Welcome to the EzComWorld");
		System.out.println("\n************* ADDING BOOKS TO CART ************* ");
		// USE SCANNER AND ACCEPT BOOK
		// CREATE THE SHOPPING CART
		ArrayList<Product> shoppingCart = new ArrayList();
		Product product1 = new Product();
		product1.productId = 1;
		product1.productName = "Deep Work";
		product1.price = 50.50f;
		product1.available = true;
		shoppingCart.add(product1);
		
		Product product2 = new Product(2,"The Power Of Now", 30.5f, true);
		shoppingCart.add(product2);
	
		Product product3 = new Product(3,"Start With Why", 30.55f, true);
		shoppingCart.add(product3);
		

		// DISPLAYING ALL THE BOOKS
		System.out.println("\n **************** DISPLAYING ALL THE BOOKS ***************");
		for (Product product : shoppingCart) {
			product.displayDetails();
		}

		// SEARCHING A BOOK
//		System.out.println("\n**************** SEARCHING FOR A BOOK ***************");
//		String searchBook = "Deep Work";
//		boolean bookFound = false;
//		for (String book : shoppingCart) {
//			if (searchBook.equalsIgnoreCase(book)) {
//				bookFound = true;
//			}
//		}
//		if (bookFound) {
//			System.out.println("FOUND THE BOOK");
//		} else {
//			System.out.println("Book Not Found");
//		}
	}
}

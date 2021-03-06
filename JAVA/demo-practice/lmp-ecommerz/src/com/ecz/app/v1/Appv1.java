package com.ecz.app.v1;

import java.util.ArrayList;

public class Appv1 {
//LAB : ACCECPT 3 BOOKS FROM THE USER AND STORE THEM
// ACCEPT BOOK TO BE SEARCHED BY A USER AND DISPLAY IF IT IS FOUND OR NOT.
	public static void main(String[] args) {
		System.out.println("Welcome to the EzComWorld");
		System.out.println("\n************* ADDING BOOKS TO CART ************* ");
		// USE SCANNER AND ACCEPT BOOK
		// CREATE THE SHOPPING CART
		ArrayList<String> shoppingCart = new ArrayList();
		shoppingCart.add("Deep Work");
		shoppingCart.add("The Power Of Now");
		shoppingCart.add("Start With Why");

		// DISPLAYING ALL THE BOOKS
		System.out.println("\n **************** DISPLAYING ALL THE BOOKS ***************");
		for (String book : shoppingCart) {
			System.out.println(book);
		}

		// SEARCHING A BOOK
		System.out.println("\n**************** SEARCHING FOR A BOOK ***************");
		String searchBook = "Deep Work";
		boolean bookFound = false;
		for (String book : shoppingCart) {
			if (searchBook.equalsIgnoreCase(book)) {
				bookFound = true;
			}
		}
		if (bookFound) {
			System.out.println("FOUND THE BOOK");
		} else {
			System.out.println("Book Not Found");
		}
	}
}

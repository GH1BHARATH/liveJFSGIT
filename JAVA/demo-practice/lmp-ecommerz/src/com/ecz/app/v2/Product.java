package com.ecz.app.v2;

public class Product {

	public int productId;
	public String productName;
	public float price;
	public boolean available;

	public Product() {
		
	}
//	Parameterized constructor
	public Product(int pProductId,  String pProductName,  float pPrice, boolean pAvailable ) {
		productId = pProductId;
		productName = pProductName;
		price = pPrice;
		available = pAvailable;
		
	}
	public void displayDetails() {
		System.out.println(" Book Id : " + productId);
		System.out.println(" Book Name : " + productName);
		System.out.println(" Price : " + price);
		System.out.println(" Available : " + available);
	}
}

package com.ezshop.model;

public class Product extends Object{
	private String productId;
	private String productName;
	private int price;
	private int quantity;
	
	public Product(String productId,String productName,int price, int quantity) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getProductName() {
		return productName;
	}

	public int getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	
//	@Override
//	public String toString() {
//		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", quantity="
//				+ quantity + "]";
//	}
	
	@Override
	public String toString() {
		return ">> Product ID : " + productId + "\nProduct Name : " + productName + "\nPrice : " + price + "\nQuantity : "
				+ quantity + "\n";
	}
}

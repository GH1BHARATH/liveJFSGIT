package com.ezshop;

import org.springframework.web.client.RestTemplate;

import com.ezshop.entity.Product;
import com.ezshop.entity.ProductsResponse;

public final class EzShopDesktopSpringRESTApp {
	final static RestTemplate productsRestTemplate;
	final static String restAPIURLString = "http://localhost:9090/ezshop/api/products/";

	static {
		productsRestTemplate = new RestTemplate();
	}

	public static void main(String[] args) {
		System.out.println("EzShopDesktopSpringRESTApp");
		getAllProducts();
		saveProduct();
		getAllProducts();
		updateProduct();
		getAllProducts();
		deleteProduct();
		getAllProducts();
	}

	private static void getAllProducts() {
		System.out.println("\n\n***** PRODUCTS ******");
		ProductsResponse productsResponse = productsRestTemplate.getForObject(restAPIURLString + "response",
				ProductsResponse.class);
		productsResponse.getProducts().forEach(System.out::println);
	}

	private static void saveProduct() {
		Product product = new Product("SP01", "PN1", 50, 100);
		Product createdProduct = productsRestTemplate.postForObject(restAPIURLString, product,
				Product.class);
		System.out.println("\n\n***** SAVED PRODUCT ******" + createdProduct);
	}

	private static void updateProduct() {
		Product product = new Product("SP01", "PN2", 500, 1000);
		productsRestTemplate.put(restAPIURLString + product.getProductId(), product);
	}
	private static void deleteProduct() {
		String productIdString = "SP01";
		productsRestTemplate.delete(restAPIURLString + productIdString);
	}
}

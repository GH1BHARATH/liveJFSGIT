package com.ezshop;

import org.springframework.web.client.RestTemplate;

import com.ezshop.entity.ProductsResponse;

public final class EzShopDesktopSpringRESTApp {
	final static RestTemplate productsRestTemplate;
	final static String restAPIURLString = "http://localhost:9090/ezshop/api/";

	static {
		productsRestTemplate = new RestTemplate();
	}

	public static void main(String[] args) {
		System.out.println("EzShopDesktopSpringRESTApp");
		getAllProducts();
	}

	private static void getAllProducts() {
		ProductsResponse productsResponse = productsRestTemplate.getForObject(restAPIURLString + "/productsResponse",
				ProductsResponse.class);
		productsResponse.getProducts().forEach(System.out::println);
	}
}

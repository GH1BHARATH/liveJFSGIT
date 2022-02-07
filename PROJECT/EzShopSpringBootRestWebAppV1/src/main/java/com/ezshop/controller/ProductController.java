package com.ezshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ezshop.entity.Product;
import com.ezshop.repository.ProductRepository;

@RestController
@RequestMapping("/api")
public class ProductController {
	@Autowired
	ProductRepository productRepository;

	@GetMapping("/welcome")
	protected String welcome() {
		return "<html><head><title>Welcome SpringBoot Web app</title></head><body><h1>Welcome to the world of springboot............</h1></body></html>";
	}

	@GetMapping("/productsAsHTML")
	protected String getAllProductsAsHTML() {
		List<Product> productsList = productRepository.findAll();
		String productsHTML = "<html><head><title>Display Product Details !!!</title>"
				+ "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n"
				+ "    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n"
				+ "    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n"
				+ "    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script></head><body><h1>Products List</h1>";
		productsHTML += "<table class=\"table table-dark table-striped\" style = \"width:500px\"><tr><th>Product ID</th><th>Name</th><th>Product Price</th></tr>";
		for (Product product : productsList) {
			productsHTML += "<tr><td>" + product.getProductId() + "</td><td>" + product.getProductName() + "</td><td>"
					+ product.getPrice() + "</td><td>" + product.getQuantity() + "</td></tr>";
		}
		productsHTML += "</table></body></html>";
		System.out.println(productsHTML);
		return productsHTML;
	}

	@GetMapping("/products")
	protected List<Product> getAllProducts() {
		List<Product> productsList = productRepository.findAll();
		return productsList;
	}

	@PostMapping("/products")
	private Product createProduct(@RequestBody Product productFromBrowser) {
//	    {
//	        "productId": "P100",
//	        "productName": "IPhones",
//	        "price": 5005,
//	        "quantity": 55
//	    }
		// ACCEPT PRODUCT DETAILS FROM USER
		Product savedProduct = productRepository.save(productFromBrowser);
		return savedProduct;
	}

	@PutMapping("/products/{id}")
	private Product updateProduct(@PathVariable(value = "id") String productId,
			@RequestBody Product productFromBrowser) {
//ACCEPT PRODUCT DETAILS FROM USER
		Product existingProduct = productRepository.findById(productId).get();
		existingProduct.setProductName(productFromBrowser.getProductName());
		existingProduct.setPrice(productFromBrowser.getPrice());
		existingProduct.setQuantity(productFromBrowser.getQuantity());
		Product updatedProduct = productRepository.save(existingProduct);
		return updatedProduct;
	}
	@DeleteMapping("/products/{productIdFromBrowser}")
	private void deleteProduct(@PathVariable(value = "productIdFromBrowser") String productId) {
		productRepository.deleteById(productId);
	}
}

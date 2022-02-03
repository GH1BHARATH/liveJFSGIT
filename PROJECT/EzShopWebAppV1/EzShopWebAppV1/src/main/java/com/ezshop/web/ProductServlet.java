package com.ezshop.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezshop.model.Product;
import com.ezshop.repository.ProductRepositoryJDBC;

public class ProductServlet extends HttpServlet {
	ProductRepositoryJDBC productRepository = null;

	@Override
	public void init() throws ServletException {
		productRepository = new ProductRepositoryJDBC();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		List<Product> productsList = productRepository.findAll();
//		if (productsList.size() > 0) {
//			productsList.forEach(System.out::println);
//		} else {
//			System.out.println("NO PRODUCTS");
//		}
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body><h1>Servlets</h1>");
		List<Product> productsList = productRepository.findAll();
		if (productsList.size() > 0) {
			productsList.forEach(product -> out.println("<h4 style='color:green'>" + product + "<h4>"));
		}
		out.println("</body></html>");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String productId = request.getParameter("productId");
		String productName = request.getParameter("productName");
		int price = Integer.parseInt(request.getParameter("price"));
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		Product product = new Product(productId, productName, price, quantity);
		Product savedProduct = productRepository.save(product);
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><script> alert('Product Saved'); </script>");
		out.println("<body><h1>Product Saved</h1>");
		out.println(savedProduct);
		out.println("</body></html>");
	}

	private void saveProduct() {
//		ACCEPT PRODUCT DETAILS FROM USER
		Product product = new Product("P04", "7H", 50, 100);
		Product savedProduct = productRepository.save(product);
	}
}

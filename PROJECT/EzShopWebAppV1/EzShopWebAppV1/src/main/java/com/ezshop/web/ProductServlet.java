package com.ezshop.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezshop.model.Product;
import com.ezshop.repository.ProductRepository;

public class ProductServlet extends HttpServlet {
	ProductRepository productRepository = null;

	@Override
	public void init() throws ServletException {
		productRepository = new ProductRepository();
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		List<Product> productsList = productRepository.findAll();
//		if (productsList.size() > 0) {
//			productsList.forEach(System.out::println);
//		} else {
//			System.out.println("NO PRODUCTS");
//		}
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<html>");
		printWriter.println("<body><h1>Servlets</h1>");
		List<Product> productsList = productRepository.findAll();
		if (productsList.size() > 0) {
			productsList.forEach(product -> printWriter.println("<h4>" + product + "<h4>"));
		}
		printWriter.println("</body></html>");
	}
}

package com.ezshop.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ezshop.model.Product;

public class ProductRepositoryImplUpdated implements ProductRepository{
	public List<Product> findAll() {
		// LIST TO STORE PRODUCTS
		List<Product> productsList = new ArrayList<Product>();
		ResultSet resultSet = MySQLDBConnection.getResultSet("SELECT * FROM PRODUCTS_UPDATED");
		// ITERATE THROUGH THE RESULT SET AND CREATE THE PRODUCT MODEL
		try {
			while (resultSet.next()) {
//				 (PRODUCT_ID CHAR(5), PRODUCT_NAME VARCHAR(25), PRICE INT, QUANTITY INT);
				String productId = resultSet.getString("PRODUCT_ID");
				String productName = resultSet.getString("PRODUCT_NAME");
				int price = resultSet.getInt("PRICE");
				int quantity = resultSet.getInt("QUANTITY");
				// CREATE A PRODUCT OBJECT FOR THE PRODUCT
				Product product = new Product(productId, productName, price, quantity);
				productsList.add(product);
			}
			return productsList;
		} catch (SQLException sqlException) {
			System.out.println("Problem in Result Set " + sqlException);
		}
		return null;
	}

	public Product save(Product product) {
		// CREATE THE INSERT QUERY
		String insertQuery = "INSERT INTO PRODUCTS_UPDATED VALUES ('" + product.getProductId() + "','"
				+ product.getProductName() + "'," + product.getPrice() + "," + product.getQuantity() + ");";
		System.out.println(insertQuery);
		int recordSaved = MySQLDBConnection.saveRecord(insertQuery);
		if(recordSaved == 1) {
			return product;
		}
		return null;
	}
}

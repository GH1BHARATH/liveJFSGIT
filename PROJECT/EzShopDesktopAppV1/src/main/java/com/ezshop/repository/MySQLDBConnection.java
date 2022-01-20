package com.ezshop.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLDBConnection {
	public static Connection getConnection() {
		Connection connection = null;
		// Establish a connection
		try {
//					LOAD THE DRIVER
			Class.forName("com.mysql.cj.jdbc.Driver");
//					ESTABLISH THE CONNECTION
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/EZSHOP", "root", "mysql");
System.out.println("Connection established");
		} catch (ClassNotFoundException classNotFoundException) {
			System.out.println("Driver could not be loaded " + classNotFoundException);
		} catch (SQLException sqlException) {
			System.out.println("Database Connection Problems " + sqlException);
		}
		return connection;
	}
}

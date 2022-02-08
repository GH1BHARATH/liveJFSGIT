package com.ezshop.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public final class MySQLDBConnection {
	public static final Connection getConnection() {
		Connection connection = null;
		try {
//			LOAD THE DRIVER
			Class.forName("com.mysql.cj.jdbc.Driver");
//			ESTABLISH THE CONNECTION
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/EZSHOP", "root", "mysql");
//			System.out.println("Connection established");
		} catch (ClassNotFoundException classNotFoundException) {
			System.out.println("Driver could not be loaded " + classNotFoundException);
		} catch (SQLException sqlException) {
			System.out.println("Database Connection Problems : " + sqlException);
		}
		return connection;
	}

	public static ResultSet getResultSet(String selectQuery) {
		try {
//			GET CONNECTION
			Connection connection = getConnection();
			// CREATE THE STATEMENT
			Statement statement = connection.createStatement();
			// EXECUTE THE QUERY AND GET THE RESULT SET
			ResultSet resultSet = statement.executeQuery(selectQuery);
			return resultSet;
		} catch (SQLException sqlException) {
			System.out.println("Cannot execute query : " + sqlException);
		}
		return null;
	}
	public static int saveRecord(String insertQuery) {
		int rowsInserted = 0;
		try {
			// CREATE THE STATEMENT
			Statement statement = getConnection().createStatement();
			// EXECUTE THE QUERY AND GET THE RESULT SET
			rowsInserted  = statement.executeUpdate(insertQuery);
			
			// CHECK IF DATA IS INSERTED SUCCESSFULLY 
			if(rowsInserted > 0 ) {
				System.out.println("Inserted Record successfully!");
			}
			else
			{
				System.out.println("The record could not be saved....");
			}
		} catch (SQLException sqlException) {
			System.out.println("Cannot execute query : " + sqlException);
		}
		return rowsInserted;
	}
}

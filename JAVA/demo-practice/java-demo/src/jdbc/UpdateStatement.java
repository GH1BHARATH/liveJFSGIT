package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStatement {
	public static void main(String[] args) {
		// Establish a connection
		try {
			Connection connection 
			= DriverManager.getConnection("jdbc:mysql://localhost:3306/jfsbotdb", "root", "mysql");
			System.out.println("Connected Successfully");
//			int productId = 1;
//			String productName = "Deep Work";
//			float price = 50.50f;
//			String available = "yes";
			
			// CREATE THE SQL QUERY STRING
			String deleteString = "DELETE FROM PRODUCT WHERE PRODUCT_ID = 100;";
			// CREATE THE STATEMENT
			Statement statement = connection.createStatement();
			// EXECUTE THE QUERY AND GET THE ROWS AFFECTED
			int rowsAffected  = statement.executeUpdate(deleteString);
			
			// CHECK IF DATA IS INSERTED SUCCESSFULLY 
			if(rowsAffected > 0 ) {
				System.out.println("DELETED Record successfully!");
			}
			else
			{
				System.out.println("The record(s) could not be deleted....");
			}
		} catch (SQLException sqlException) {
			System.out.println("Database Connection Problems " + sqlException);
		}

	}
}

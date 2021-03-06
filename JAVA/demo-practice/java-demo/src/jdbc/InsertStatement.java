package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStatement {
	public static void main(String[] args) {
		// Establish a connection
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jfsbotdb", "root", "mysql");
			System.out.println("Connected Successfully");
//			int productId = 1;
//			String productName = "Deep Work";
//			float price = 50.50f;
//			String available = "yes";
			
			// CREATE THE SQL QUERY STRING
			String insertStatement = "INSERT INTO PRODUCT VALUES (2, 'SWW?', 50.5, 'YES');";
			// CREATE THE STATEMENT
			Statement statement = connection.createStatement();
			// EXECUTE THE QUERY AND GET THE RESULT SET
			int rowsAffected  = statement.executeUpdate(insertStatement);
			
			// CHECK IF DATA IS INSERTED SUCCESSFULLY 
			if(rowsAffected > 0 ) {
				System.out.println("Inserted Record successfully!");
			}
			else
			{
				System.out.println("The record could not be inserted....");
			}
		} catch (SQLException sqlException) {
			System.out.println("Database Connection Problmens " + sqlException);
		}

	}
}

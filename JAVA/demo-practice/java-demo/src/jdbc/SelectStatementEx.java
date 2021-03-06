package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectStatementEx {
	public static void main(String[] args) {
		// Establish a connection
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "mysql");
			System.out.println("Connected Successfully");
			// CREATE THE SQL QUERY STRING
			String sqlSelect = "SELECT ACTOR_ID, FIRST_NAME, LAST_NAME FROM ACTOR";
			// CREATE THE STATEMENT
			Statement statement = connection.createStatement();
			// EXECUTE THE QUERY AND GET THE RESULT SET
			ResultSet resultSet = statement.executeQuery(sqlSelect);
			
			// ITERATE THROUGH THE RESULT SET AND DISPLAY THE DATA
			while(resultSet.next()) {
				int actorId = resultSet.getInt("ACTOR_ID");
				String firstName = resultSet.getString("FIRST_NAME");
				String lastName = resultSet.getString("LAST_NAME");
				System.out.println(actorId + " " + firstName + " " + lastName);
			}
		} catch (SQLException sqlException) {
			System.out.println("Database Connection Problmens " + sqlException);
		}

	}
}

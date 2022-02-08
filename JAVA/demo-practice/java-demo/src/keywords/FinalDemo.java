package keywords;

public class FinalDemo {
public static void main(String[] args) {
//	UpdatedDBConnection newDBConnection = new UpdatedDBConnection();
//	newDBConnection.testConnection();
//	newDBConnection.getConnection();
	DBConnection dbConnection = new DBConnection();
	dbConnection.getConnection();
}
}

//final class DBConnection
//{
//	
//}
//
//class NewDBConnection extends DBConnection{
//	
//}

final class DBConnection {
	public final void getConnection() {
		System.out.println("getConnection()");
	}

	public void testConnection() {

	}
}

//class UpdatedDBConnection extends DBConnection {
////	public void getConnection() {
////		
////	}
//	public void testConnection() {
//
//	}
//}


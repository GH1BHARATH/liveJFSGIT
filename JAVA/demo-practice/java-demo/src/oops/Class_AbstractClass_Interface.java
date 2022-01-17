package oops;

public class Class_AbstractClass_Interface {
	public static void main(String[] args) {
		Account account;
//		Cannot instantiate the type Account
//		account = new Account();
	}
}

// abstract class cannot be instantiated
// inheritance is the purpose of abstract classes
abstract class Account {
//	Abstract methods do not specify a body
//	public abstract void displayAccountInfo() {
//		
//	}
	public abstract void displayAccountInfo();
	public void displayBankDetails(){
		System.out.println("CITI Bank");
	}
}
class SavingsAccount extends Account{

	@Override
	public void displayAccountInfo() {
		System.out.println("Savings Account");
	}	
}
// Create Current account and display "Current Account"
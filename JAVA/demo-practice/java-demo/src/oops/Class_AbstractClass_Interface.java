package oops;

public class Class_AbstractClass_Interface {
	public static void main(String[] args) {
//		Account account;
//		Cannot instantiate the type Account
//		account = new Account();
//		NetBanking netBanking;
//		Cannot instantiate the type NetBanking
//		netBanking = new NetBanking();
		System.out.println("USING SAVINGS ACCOUNT");
		Account account = null;
		account = new SavingsAccount();
		account.displayAccountInfo();
		account.displayBankDetails();

		System.out.println("USING CURRENT ACCOUNT");
		account = new CurrentAccount();
		account.displayAccountInfo();
		account.displayBankDetails();

//		USING NETBANKING
		System.out.println("USING NET BANKING");
		NetBanking netBanking = null;
		netBanking = new SavingsAccount();
		netBanking.transferAmount();
		

// USING DEBIT CARD
		DebitCard debitCard = null;
		debitCard = new SavingsAccount();
		debitCard.withdrawAmount();
		
		// USING SAVINGS ACCOUNT
		SavingsAccount savingsAccount = null;
		savingsAccount = new SavingsAccount();
		System.out.println("USING SAVINGS ACCOUNT");	
		savingsAccount.displayAccountInfo();
		savingsAccount.transferAmount();
		savingsAccount.displayBankDetails();
		savingsAccount.withdrawAmount();
	}

}

//interfaces have abstract methods
interface NetBanking {
	public abstract void transferAmount();
}

//interfaces have abstract methods
interface DebitCard {
	public abstract void withdrawAmount();
}

// abstract class cannot be instantiated
// inheritance is the purpose of abstract classes
abstract class Account {
//	Abstract methods do not specify a body
//	public abstract void displayAccountInfo() {
//		
//	}
	public abstract void displayAccountInfo();

	public void displayBankDetails() {
		System.out.println("CITI Bank");
	}
}

// A class can extend from only one class but can implement multiple interfaces.
class SavingsAccount extends Account implements NetBanking, DebitCard {
// override the abstract method
	@Override
	public void displayAccountInfo() {
		System.out.println("Savings Account Info");
	}

	@Override
	public void transferAmount() {
		System.out.println("Transfer amount from Savings Bank Account using NetBanking");
	}

	@Override
	public void withdrawAmount() {
		System.out.println("Withdraw amount from Savings Bank Account using DebitCard");

	}

	public void openFixedDeposit() {
		System.out.println("Open Fixed Deposit by Visiting the Bank");
	}
}

class CurrentAccount extends Account {
	// override the abstract method
	@Override
	public void displayAccountInfo() {
		System.out.println("Current Account Info");
	}
}
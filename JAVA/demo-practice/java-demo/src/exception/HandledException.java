package exception;

// LAB HANLDE THE EXCEPTIONS SEPARATELY FOR NUMBER1 AND NUMBER2
// PRINT ENTER VALID NUMBER 1 OR VALID NUMBER 2.
import java.util.Scanner;

public class HandledException {
	public static void main(String[] args) {
		String testString = "100";
		int number = Integer.parseInt(testString);
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Enter Number 1 :");
		String number1String = scannerObject.nextLine();
		System.out.println("Enter Number 2 :");
		String number2String = scannerObject.nextLine();
		try {
			int number1 = Integer.parseInt(number1String);
			int number2 = Integer.parseInt(number2String);
			int result = number1 + number2;
			System.out.println("Result is : " + result);
		} catch (NumberFormatException numberFormatExceptionObject) {
			System.out.println("Enter valid numbers");
		}
		

	}
}

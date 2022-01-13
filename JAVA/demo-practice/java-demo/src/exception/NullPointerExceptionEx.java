package exception;

import java.util.Scanner;

public class NullPointerExceptionEx {
	public static void main(String[] args) {
//		Calculator2 calculatorObject = new Calculator2();
		Calculator2 calculatorObject = null;
		calculatorObject = new Calculator2();
		System.out.println("ADD");
		try {
			calculatorObject.add();
		} catch (NullPointerException nullPointerException) {
			System.out.println("The object is not instantiated......");
		}
//		System.out.println("MULTIPLY");
//		calculatorObject.multiply();
	}
}

class Calculator2 {
	public void add() {
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Enter Number 1 :");
		String number1String = scannerObject.nextLine();
		System.out.println("Enter Number 2 :");
		String number2String = scannerObject.nextLine();
		int number1 = Integer.parseInt(number1String);
		int number2 = Integer.parseInt(number2String);
		int result = number1 + number2;
		System.out.println("Result is : " + result);
	}

	public void multiply() {
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Enter Number 1 :");
		String number1String = scannerObject.nextLine();
		System.out.println("Enter Number 2 :");
		String number2String = scannerObject.nextLine();
		int number1 = Integer.parseInt(number1String);
		int number2 = Integer.parseInt(number2String);
		int result = number1 * number2;
		System.out.println("Result is : " + result);
	}
}
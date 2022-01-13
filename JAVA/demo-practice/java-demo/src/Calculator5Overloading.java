import java.util.Scanner;

//LAB : CREATE THE MULTIPLY, SUBTRACT, DIVIDE METHODS
//LAB : TO ADD 2 DOUBLE.
public class Calculator5Overloading {
	public static void main(String[] args) {
		
		System.out.println("ADDING TWO INTS");
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Enter Number 1 :");
		String number1String = scannerObject.nextLine();
		System.out.println("Enter Number 2 :");
		String number2String = scannerObject.nextLine();
		int number1 = Integer.parseInt(number1String);
		int number2 = Integer.parseInt(number2String);
		
		Calculator5Overloading calculator4Object = new Calculator5Overloading();
		calculator4Object.add(number1,number2);
		
		System.out.println("ADDING TWO FLOATS");
		System.out.println("Enter Number 1 :");
		String number3String = scannerObject.nextLine();
		System.out.println("Enter Number 2 :");
		String number4String = scannerObject.nextLine();
		float number3 = Float.parseFloat(number3String);
		float number4 = Float.parseFloat(number4String);
		
		calculator4Object.add(number3,number4);
		String firstName = "Jordan ";
		String lastName = "Peterson";
		System.out.println("ADDING TWO STRINGS");
		calculator4Object.add(firstName, lastName);
		
		System.out.println("ADDING THREE INTS");
		calculator4Object.add(1,2,3);

	}


	public  void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}
	
	public  void add(String firstName, String lastName) {
		String fullName = firstName + lastName;
		System.out.println(fullName);
	}
	
	public  void add(int num1, int num2, int num3) {
		int result = num1 + num2 + num3;
		System.out.println(result);
	}
	
	public  void add(float num1, float num2) {
		float result = num1 + num2;
		System.out.println(result);
	}

	public  void add(double num1, double num2) {
		double result = num1 + num2;
		System.out.println(result);
	}
}

// STATIC VS INSTANCE

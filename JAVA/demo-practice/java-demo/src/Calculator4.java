import java.util.Scanner;

//LAB : CREATE THE MULTIPLY, SUBTRACT, DIVIDE METHODS
//LAB : TO ADD 2 DOUBLE.
public class Calculator4 {
	public static void main(String[] args) {
		System.out.println("ADDING TWO INTS");
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Enter Number 1 :");
		String number1String = scannerObject.nextLine();
		System.out.println("Enter Number 2 :");
		String number2String = scannerObject.nextLine();
		int number1 = Integer.parseInt(number1String);
		int number2 = Integer.parseInt(number2String);
		
		Calculator4 calculator4Object = new Calculator4();
		calculator4Object.addInt(number1,number2);
		
		System.out.println("ADDING TWO FLOATS");
		System.out.println("Enter Number 1 :");
		String number3String = scannerObject.nextLine();
		System.out.println("Enter Number 2 :");
		String number4String = scannerObject.nextLine();
		float number3 = Float.parseFloat(number3String);
		float number4 = Float.parseFloat(number4String);
		
		calculator4Object.addFloat(number3,number4);
	}


	public  void addInt(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}
	
	public  void addFloat(float num1, float num2) {
		float result = num1 + num2;
		System.out.println(result);
	}

}

// STATIC VS INSTANCE

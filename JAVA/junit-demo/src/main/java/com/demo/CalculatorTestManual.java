package com.demo;



public class CalculatorTestManual {

private static Calculator calculator = null;

CalculatorTestManual() {
	calculator = new Calculator();
}

public static void main(String[] args) {
	CalculatorTestManual calculatorTestManual = new CalculatorTestManual();
	int result = calculator.add(1, 2);
	if (result == 3) {
		System.out.println("Add succeeded");
	} else {
		System.out.println("Add failed");
	}
	
	int result1 = calculator.multiply(5,2);
	if (result1 == 8) {
		System.out.println("Multiply succeeded");
	}else {
		System.out.println("Multiply failed");
	}
	int result2 = 0;
	try {
		result2 = calculator.divide(5,0);
	} catch (Exception e) {
	
		System.out.println("Do not divide by zero " + e);
	}
	if(result2 == 0) {
		System.out.println("Divide succeeded");
	}else {
		System.out.println("divide failed");
	}
	}
	
}



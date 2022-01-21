package com.ezshop.test;

import com.ezshop.Calculator;

public class CalculatorTest {
	private static Calculator calculator = null;

	CalculatorTest() {
		calculator = new Calculator();
	}

	public static void main(String[] args) {
		CalculatorTest calculatorTest = new CalculatorTest();
		int result = calculator.add(1, 2);
		if (result == 3) {
			System.out.println("Sum succeeded");
		} else {
			System.out.println("Sum failed");
		}
	}
}

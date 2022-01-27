package com.ezshop.ui;

public class Calculator {

	public int add(int a, int b) {
		return a + b ;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) throws Exception {
		if (b == 0) {
			Exception exception = new Exception("Divider can't be zero");
			throw exception;
		}
		return a / b;
	}

	public boolean equalIntegers(int a, int b) {
		boolean result = false;
		if (a == b) {
			result = true;
		}
		return result;
	}
}
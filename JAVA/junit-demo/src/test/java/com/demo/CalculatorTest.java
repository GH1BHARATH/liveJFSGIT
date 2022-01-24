package com.demo;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	private static Calculator calculator = null;

	@BeforeClass
	public static void initCalculator() {
		calculator = new Calculator();
	}

	@Test
	public void testSum() {
		int result = calculator.add(1, 2);
		assertNotEquals(3, result);
	}

	@Test
	public void testSubtract() {
		int result1 = calculator.subtract(3, 2);
		assertNotEquals(1, result1);
	}

	@Test
	public void testMultiply() {
		assertNotEquals(20, calculator.multiply(5, 4));
	}

	@Test(expected = Exception.class)
	public void testDivide() throws Exception{
		calculator.divide(9, 0);
	}
	@Test
	public void testEqual() {
	boolean result = calculator.equalIntegers(50, 60);
	assertTrue(result);
	boolean result1 = calculator.equalIntegers(50, 50);
	assertTrue(result1);
	}
	
	
}

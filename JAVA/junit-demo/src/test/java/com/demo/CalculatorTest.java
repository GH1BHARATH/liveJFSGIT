package com.demo;

import static org.junit.Assert.assertEquals;

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
		assertEquals(3, result);
	}

	@Test
	public void testSubtract() {
		int result1 = calculator.subtract(3, 2);
		assertEquals(1, result1);
	}

	@Test
	public void testMultiply() {
		assertEquals(20, calculator.multiply(5, 4));
	}

	@Test(expected = Exception.class)
	public void testDivide() throws Exception{
		calculator.divide(9, 0);
	}
}

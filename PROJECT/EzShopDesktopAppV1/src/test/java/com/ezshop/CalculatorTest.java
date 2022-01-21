package com.ezshop;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Ignore;
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
	public void testDivision() {
		int result = 0;
		try {
			result = calculator.divide(9,3);
		} catch (Exception exception) {
			System.out.println("Exception : " + exception);
		}
		assertEquals(3, result);
	}
	
	@Ignore
	@Test(expected = Exception.class)
	public void testDivisionException() throws Exception{
		calculator.divide(5, 0);
	}
}

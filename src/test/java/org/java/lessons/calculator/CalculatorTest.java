package org.java.lessons.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import  org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	private static Calculator calc = null;
	
	@BeforeAll
	public static void setup() {
		calc = new Calculator();
	}
	
	@Test
	public void additionTestWithPositiveNum() {
		
		float num1 = 1f;
		float num2 = 1f;
		
		calc.add(num1, num2);
		
		assertEquals(2, num1+num2, "not ok for: " +num1+" "+num2 +".");
	}
	
	@Test
	public void additionTestWithNegativeNum() {
		
		float num1 = 1f;
		float num2 = -1f;
		
		calc.add(num1, num2);
		
		assertEquals(0, num1+num2, "not ok for: " +num1+" "+num2 +".");
	}
	
	@Test
	public void additionTestWithOnlyNegativeNum() {
		
		float num1 = -1f;
		float num2 = -1f;
		
		calc.add(num1, num2);
		
		assertEquals(-2, num1+num2, "not ok for: " +num1+" "+num2 +".");
	}
	
	@Test
	public void additionTestWith0() {
		
		float num1 = 1f;
		float num2 = 0;
		
		calc.add(num1, num2);
		
		assertEquals(1, num1+num2, "not ok for: " +num1+" "+num2 +".");
	}

	
	@Test
	public void subtractionTestWithPositiveNum() {
		
		float num1 = 1f;
		float num2 = 1f;
		
		calc.subtract(num1, num2);
		
		assertEquals(0, num1-num2, "not ok for: " +num1+" "+num2 +".");
	}
	
	@Test
	public void subtractionTestWithNegativeNum() {
		
		float num1 = 1f;
		float num2 = -1f;
		
		calc.subtract(num1, num2);
		
		assertEquals(2, num1-num2, "not ok for: " +num1+" "+num2 +".");
	}
	
	@Test
	public void subtractionTestWithOnlyNegativeNum() {
		
		float num1 = -1f;
		float num2 = -1f;
		
		calc.subtract(num1, num2);
		
		assertEquals(0, num1-num2, "not ok for: " +num1+" "+num2 +".");
	}
	
	@Test
	public void subtractionTestWIth0() {
		
		float num1 = -1f;
		float num2 = 0;
		
		calc.subtract(num1, num2);
		
		assertEquals(-1, num1-num2, "not ok for: " +num1+" "+num2 +".");
	}
	
	@Test
	public void multiplicationTestWithPositiveNum() {
		
		float num1 = 1f;
		float num2 = 4f;
		
		calc.multiply(num1, num2);
		
		assertEquals(4, num1*num2, "not ok for: " +num1+" "+num2 +".");
	}
	
	@Test
	public void multiplicationTestWithNegativeNum() {
		
		float num1 = 1f;
		float num2 = -4f;
		
		calc.multiply(num1, num2);
		
		assertEquals(-4, num1*num2, "not ok for: " +num1+" "+num2 +".");
	}
	
	@Test
	public void multiplicationTestWithOnlyNegativeNum() {
		
		float num1 = -1f;
		float num2 = -4f;
		
		calc.multiply(num1, num2);
		
		assertEquals(4, num1*num2, "not ok for: " +num1+" "+num2 +".");
	}
	
	@Test
	public void multiplicationTestWith0() {
		
		float num1 = 10f;
		float num2 = 0;
		
		calc.multiply(num1, num2);
		
		assertEquals(0, num1*num2, "not ok for: " +num1+" "+num2 +".");
	}
	
	@Test
	public void divisionTestWithPositiveNum() throws Exception {
		
		float num1 = 1f;
		float num2 = 4f;
		
		calc.divide(num1, num2);
		
		assertEquals(0.25, num1/num2, "not ok for: " +num1+" "+num2 +".");
	}
	
	@Test
	public void divisionTestWithNegativeNum() throws Exception {
		
		float num1 = 1f;
		float num2 = -4f;
		
		calc.divide(num1, num2);
		
		assertEquals(-0.25, num1/num2, "not ok for: " +num1+" "+num2 +".");
	}
	
	@Test
	public void divisionTestWithOnlyNegativeNum() throws Exception {
		
		float num1 = -1f;
		float num2 = -4f;
		
		calc.divide(num1, num2);
		
		assertEquals(0.25, num1/num2, "not ok for: " +num1+" "+num2 +".");
	}
	
	@Test
	public void divisionTestWith0AsNum1() throws Exception {
		
		float num1 = 0f;
		float num2 = 4f;
		
		calc.divide(num1, num2);
		
		assertEquals(0, num1/num2, "not ok for: " +num1+" "+num2 +".");
	}
	
	@Test
	public void divisionTestWith0AsNum2() {
		
		float num1 = 1f;
		float num2 = 0;
		
		assertThrows(Exception.class, () -> calc.divide(num1, num2),"Exception attesa per num2 = 0");
	}

}

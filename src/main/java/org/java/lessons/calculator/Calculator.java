package org.java.lessons.calculator;

public class Calculator {
	
	
	float add(float num1, float num2) {
		
		return num1 + num2;
		
	}
	
	float subtract(float num1, float num2) {
		
		return num1 - num2;
		
	}
	
	float divide(float num1, float num2) throws Exception {
		
		if(num2 == 0) {
			throw new Exception("operazione impossibile: non si può dividere per 0");
		}
		
		else {
			return num1 / num2 ;
		}
	}
	
	float multiply(float num1, float num2) {
		
		return num1 * num2 ; 
		
	}
}

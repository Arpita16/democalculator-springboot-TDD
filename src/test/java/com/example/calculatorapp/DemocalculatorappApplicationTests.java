package com.example.calculatorapp;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DemocalculatorappApplicationTests {
	DemocalculatorappApplication calculator = new DemocalculatorappApplication();
	
	@Test
	void contextLoads() {}

	@Test
	public void testAddition() {
		
		int result = calculator.add(2, 3);
		assertEquals(5, result,"verify the addition");
	}
	@Test
	public void testDivision() {
		
		int result = calculator.division(10, 2);
		assertNotEquals(0,result,"verify the division");
	}
	@Test
	public void testIsEven() {
		boolean result = calculator.isEven(4);
		assertTrue(result,"verify the number is even");
	}
	@Test
	public void testIsNotEven() {
		boolean result = calculator.isEven(5);
		assertFalse(result,"verify the number is not even");
	}
	@Test
	public void divisionByZero() {
		Integer result = null;
try {
	   result = calculator.division(10, 0);
	  
	} catch (ArithmeticException e) {	
	   // Handle the exception
	  
	}
	assertNull(result,"verify the result is null");
	}


@Test
public void divisionByZeroNotNull() {
	int result = calculator.division(10, 2);
	assertNotNull(result,"verify the result is not null");
	assertEquals(5, result);
}
}

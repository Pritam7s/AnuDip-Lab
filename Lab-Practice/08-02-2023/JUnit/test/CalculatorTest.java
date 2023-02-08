package com.junit;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class CalculatorTest {
	Calculator cal;
	@BeforeAll
	static void beforeAllInit() {
		System.out.println("Before All: will execute before all test cases.");
	}
	
	@AfterAll
	static void afterAllInit() {
		System.out.println("After All: will execute after all test cases.");
	}
	
	@BeforeEach	//it is used which is executed before every test cases
	void beforeEachInit() {
		cal = new Calculator();
		System.out.println("Creating Object");
	}
	
	@AfterEach	//it is used which is executed after every test cases
	void cleanup() {
		cal = null;
		System.out.println("Cleaning Up...\n");
	}
	
	@Test
	@DisplayName("Testing Addition Method")
	void testAddition() {
		//Calculator cal = new Calculator();	//creating the object in beforeEachInit() 
		assertEquals(10, cal.addition(7, 3), "This test is Addition Method");
	}
	
	@Test
	void testMulti() {
		//assertEquals(21, cal.multiply(3,7), "This test method is for Multiply");
		assertAll(
				() -> assertEquals(10, cal.multiply(5, 2)),
				() -> assertEquals(20, cal.multiply(5, 4)),
				() -> assertEquals(100, cal.multiply(5, 20))
				
				);
	}
	
	@Test
	void testSubs() {
		assertEquals(4, cal.substraction(15, 11), "Substraction Method");
	}
	
	
	@Test
	@DisabledOnOs(value= {OS.MAC})	//we're disabling this test case to run on perticular os
	@EnabledForJreRange(min=JRE.JAVA_11, max=JRE.JAVA_19)	// we're enabling this test case run only on system that runs  JRE between 11 & 19
	@DisabledOnJre(value={JRE.JAVA_9})	//we're disabling this test case who have system java 9
	void testDivision() {
		assertEquals(3, cal.division(9, 3), "Division Method");
	}
	
	@Test
	void testDivisionWithException() {
		assertThrows(ArithmeticException.class, ()-> cal.division(25, 0), "Division Exception");
	}
	
	@Test
	void testFactorial() {
		System.setProperty("Job", "Dev");
		assumeTrue("Dev".equals(System.getProperty("Job")));
		assumeFalse("Dev".equals(System.getProperty("Jobssss")),CalculatorTest::message);
		assertEquals(120, cal.factorial(5));
	}
	
	private static String message() {
		return "Test Execution has Failed!";
	}
	
	
	@Test
	@DisplayName("Disabled Method")
	@Disabled
	void testDisabled() {
		fail("This test should be disabled");
	}
}

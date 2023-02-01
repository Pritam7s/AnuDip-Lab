package jUnitTesting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class JUnitClass {
	@Test
	public void TestUnit() {
		//System.out.println(a);
		String str1="This is a JUnit777 testing";
		int a=10, b=15;
		String str = "";
		assertEquals("This is a JUnit testing",str1);
		assertNull("This should not be Null", str);
		assertTrue(a>b, "A must be greater than b");
	}

}

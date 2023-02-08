package com.junit;

public class Calculator {
	public int addition(int a, int b) {
		return (a+b);
	}
	
	public int multiply(int a, int b) {
		return (a*b);
	}
	
	public int substraction(int a, int b) {
		return (a-b);
	}
	
	public int division(int a, int b) {
//		try {
//			System.out.println("Division Result = " + (a/b));
//		}
//		catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
//		}
		
		return (a/b);
	}
	
	public int factorial(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;	//f*=i;
		}
		return f;
	}
}

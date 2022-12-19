package basic;

import java.util.Scanner;

public class Calculator {

	public static int addition(int a, int b)
	{
		int result = a+b;
		return result;
	}
	public static int substraction(int a, int b)
	{
		int c;
		if(a>b)
		{
			c=a-b;
		}
		else
		{
			c=b-a;
		}
		return c;
	}
	public static int multi(int a, int b)
	{
		int r=a*b;
		return r;
	}
	public static float div(float a, float b)
	{
		float x;
		if(a>b)
		{
			x=a/b;
		}
		else
		{
			x=b/a;
		}
		return x;
	}
	public static void main(String[] args) {
		int choice, num1, num2, res;
		float n1,n2, res2;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Which Operation do You want to Perform?");
		System.out.println("Enter 1 for Addition 2 for Substraction 3 for Multiplication 4 for Division and 5 to Exit.");
		choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter First Digit: ");
			num1 = sc.nextInt();
			System.out.println("Enter Second Digit: ");
			num2 = sc.nextInt();
			res = Calculator.addition(num1, num2);
			System.out.println("Addition result is: " + res);
			break;
		case 2:
        
			System.out.println("Enter First Digit: ");
			num1 = sc.nextInt();
			System.out.println("Enter Second Digit: ");
			num2 = sc.nextInt();
			res = Calculator.substraction(num1, num2);
			System.out.println("Substraction result is: " + res);
			break;
        
		case 3:
			System.out.println("Enter First Digit: ");
			num1 = sc.nextInt();
			System.out.println("Enter Second Digit: ");
			num2 = sc.nextInt();
			res = Calculator.multi(num1, num2);
			System.out.println("Multiplication result is: " + res);
			break;
        
		case 4:
			System.out.println("Enter First Digit: ");
			n1 = sc.nextFloat();
			System.out.println("Enter Second Digit: ");
			n2 = sc.nextFloat();
			res2 = Calculator.div(n1, n2);
			System.out.println("Division result is: " + res2);
			break;
        
		case 5:
			System.out.println("Now Your Program Will Terminate.");
			System.exit(0);
        
		default:
			System.out.println("Enter a Valid Digit for Operation!!!");
		}
		}while(choice!=5);

	}

}

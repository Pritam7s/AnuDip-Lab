package exception_handling;

import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str="Hi";
		int a,b;
		try {
			System.out.println("Enter First Digit: ");
			a = sc.nextInt();
			System.out.println("Enter Second Digit: ");
			b = sc.nextInt();
			int c = a/b;
			System.out.println("Result: ="+c);
			System.out.println("Length of String: "+str.length());
			int i=Integer.parseInt(str);
		}
		catch(ArithmeticException e) {
			System.out.println("Error: "+e.getMessage());
		}
		catch(NullPointerException n) {
			System.out.println("Exception: "+n.getMessage());
		}
		catch(NumberFormatException f) {
			System.out.println("Exception Occuered: "+f.getMessage());
		}
		catch(Exception p) {
			System.out.println("Any Error: "+p.getMessage());
		}
		
		//rest of the code---
		System.out.println("Rest of the Code: -----");
		int x=30, y=50;
		System.out.println("Addition of X & Y : "+(x+y));
	}

}

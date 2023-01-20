package exception_handling;

import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in))	//try with resource
		{
			try {
				int a,b;
				System.out.println("Enter a Value: ");
				a = sc.nextInt();
				System.out.println("Enter 2nd Value: ");
				b = sc.nextInt();
				System.out.println("Result: "+(a/b));
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Rest of Code: ");
			int arr[] = new int[5];
			arr[5] = 90;
			System.out.println("Added Value: "+arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception Occured : Index Out Of Bounds.");
		}
	}
}

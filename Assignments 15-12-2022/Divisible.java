//WAP to Check whether a number is divisible by both 5 and 11

package basic;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		if(n%5==0 && n%11==0)
		{
			System.out.println("Number is divisible by both.");
		}
		else
		{
			System.out.println("Number is not divisible by both.");
		}

	}

}

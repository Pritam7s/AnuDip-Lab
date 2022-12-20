package oops;

import java.util.Scanner;

public class First_Last_digit {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n,fd,ld;
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		
		ld=n%10;
		System.out.println("Last Digit is: "+ld);
		
		fd=n;
		while(fd>=10)
		{
			fd=fd/10;
		}
		System.out.println("First Digit (using while loop): "+fd);
		
		System.out.println("-----------------------------");
		int t=n;
		for(;t>=10;)
		{
			t=t/10;
		}
		System.out.println("First digit (using for Loop): "+t);

	}

}

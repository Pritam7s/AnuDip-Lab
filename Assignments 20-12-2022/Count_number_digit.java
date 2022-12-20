package oops;

import java.util.Scanner;

public class Count_number_digit {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n,x=0,i,y=0;
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		y=n;
		System.out.println("Using While Loop");
		while(n!=0)
		{
			n=n/10;
			x++;
		}
		System.out.println("Total digits are: "+x);
		
		System.out.println("----------------------------------------");
		System.out.println("Usimg for Loop");
		for(i=0;y!=0;i++)
		{
			y=y/10;
		}
		System.out.println("Total digits: "+i);
		
	}

}

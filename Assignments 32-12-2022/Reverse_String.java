package oops;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {

		String s, temp="";
		char c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String: ");
		s = sc.nextLine();
		int i, length=s.length();
		
		for(i=0;i<length;i++)
		{
			c = s.charAt(i);
			temp = c+temp;
		}
		
		System.out.println("Reverse String is: " + temp);
		
	}

}

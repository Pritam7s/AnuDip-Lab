package array_examples;

import java.util.Scanner;

public class CountOccuranceChar {

	public static void main(String[] args) {
		String str;
		int count=0;
		char c,x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		str = sc.nextLine();
		
		
		System.out.println("Enter the Character You want to Count: ");
		Scanner ch = new Scanner(System.in);
		x = ch.next().charAt(0);
		for(int i=0;i<str.length();i++) {
			c = str.charAt(i);
			if(c==x) {
				count++;
			}
		}
		System.out.println("Total Vowels are : " + count);
	}

}

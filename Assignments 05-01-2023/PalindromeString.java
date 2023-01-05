package array_examples;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		String s, temp="";
		char c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		s = sc.nextLine();
		for(int i=0;i<s.length();i++) {
			c = s.charAt(i);
			temp=c+temp;
		}
		System.out.println("After String Reverse: "+ temp);
		if(temp.equalsIgnoreCase(s)) {
			System.out.println("String is Palindrome.");
		}
		else {
			System.out.println("String is Not Palindrome");
		}
		
		
		System.out.println("\n\nUsing StringBuilder");
		String x;
		System.out.println("Enter another String: ");
		x = sc.nextLine();
		StringBuilder sb = new StringBuilder(x);
		StringBuilder rev = sb.reverse();
		if(x.equalsIgnoreCase(String.valueOf(rev))){
			System.out.println("String is Palindrome.");
		}
		else {
			System.out.println("String is Not Palindrome.");
		}
	}

}

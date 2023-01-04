package array_examples;

import java.util.Scanner;

public class CountVowel {

	public static int countVowel(String str) {
		int count=0;
		char c;
		for(int i=0;i<str.length();i++) {
			c = str.charAt(i);
			if((c=='a' || c=='e' || c=='i' || c=='o' || c=='u') || (c=='A' || c=='E' || c=='O' || c=='I' || c=='U')) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		String str;
		System.out.println("Enter a String: ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		System.out.println("Total Vowels are : " + countVowel(str));
	}

}

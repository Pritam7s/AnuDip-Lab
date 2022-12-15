package basic;

import java.util.Scanner;

public class Character_checking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c;
		System.out.println("Enter a character: ");
		c=sc.next().charAt(0);
		if(c>='a' && c<='z'|| c>='A' && c<='Z')
		{
			System.out.println("Its an Alphabet.");
		}
		else if(c>='0' && c<='9')
		{
			System.out.println("Its a Digit");
		}
		else {
			System.out.println("Its a Special Character");
		}

	}

}

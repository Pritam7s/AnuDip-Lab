//WAP to check a Character is alphabet or not?

package basic;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c;
		System.out.println("Enter a character: ");
		c=sc.next().charAt(0);
		if(c>='a' && c<='z'|| c>='A' && c<='Z')
		{
			System.out.println("Its an Alphabet.");
		}
		
		else {
			System.out.println("Its not an Alphabet");
		}
	}

}

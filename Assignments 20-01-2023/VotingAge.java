package exception_handling;

import java.util.Scanner;

public class VotingAge {
	static void ageValidation(int age) throws AgeException, NullPointerException{
		if(age>=18) {
			System.out.println("Elligible for Voting.");
		}
		else if(age<=0) {
			System.out.println("You have to Born First.");
		}
		else {
			System.out.println("Not Elligile to Vote.");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int g = sc.nextInt();
		try {
			ageValidation(g);
		}
		catch(AgeException e) {
			System.out.println(e.getMessage());
		}
		catch(NullPointerException n) {
			System.out.println(n.getMessage());
		}
	}

}

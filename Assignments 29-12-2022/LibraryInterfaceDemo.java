package array_examples;

import java.util.Scanner;

interface LibraryUser{
	public void registerAccount();
	
	public void requestBook();
}

class KidUser implements LibraryUser{
	int age;
	String bookType;
	@Override
	public void registerAccount() {
		Scanner kid =new Scanner(System.in);
		System.out.println("Enter Your Age: ");
		age= kid.nextInt();
		if(age<12) {
			System.out.println("You Have Successfully Registered under a Kids Account.");
			
		}
		else {
			System.out.println("Sorry Age must be under 12 to register as a Kid");
		}
		
	}
	@Override
	public void requestBook() {
		Scanner kid1 = new Scanner(System.in);
		System.out.println("Enter the Type of Book");
		bookType = kid1.nextLine();
		if(bookType.equalsIgnoreCase("Kids")) {
			System.out.println("Book Issued successfully, \r\n"
					+ "Please return the book within 10 days.");
		}
		else {
			System.out.println("Oops, you are allowed to take only kids books.");
		}
	}
	
}

class AdultUser implements LibraryUser{
	int age;
	String bookType;
	@Override
	public void registerAccount() {
		Scanner au  =new Scanner(System.in);
		System.out.println("Enter Your Age: ");
		age= au .nextInt();
		if(age>12) {
			System.out.println("You have successfully registered under an Adult Account.");
			
		}
		else {
			System.out.println("Sorry Age must be greater than 12 to register as a Adult");
		}
	}
	@Override
	public void requestBook() {
		Scanner au1 = new Scanner(System.in);
		System.out.println("Enter the Type of Book");
		bookType = au1.nextLine();
		if(bookType.equalsIgnoreCase("Fiction")) {
			System.out.println("Book Issued successfully, \r\n"
					+ "Please return the book within 7 days.");
		}
		else {
			System.out.println("Oops, you are allowed to take only Fiction books.");
		}
	}
}


public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		//kids section
		KidUser kids = new KidUser();
		System.out.println("---: Kids Section :--- \n");
		kids.registerAccount();
		kids.requestBook();
		kids.registerAccount();
		kids.requestBook();
		
		//adult section
		System.out.println();
		AdultUser adult = new AdultUser();
		System.out.println("---: Adult Section :--- \n");
		adult.registerAccount();
		adult.requestBook();
		adult.registerAccount();
		adult.requestBook();
	}

}

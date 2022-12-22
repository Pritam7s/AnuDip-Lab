/*
write a program to create Book management system.
create class name Book,and perform following actions:
Attributes:
bookId,bookName,bookPrice,authorName,library name(static),availability
method:
createBook() will store book details.(add at least 5 books).
displayBook()will display book details
displayBookByName(): display specific book details based on bookName
borrowBook(): borrow book if book is available based on bookName,then make availability status as "not available"
*/
package oops;

import java.util.Scanner;

class Books{
	int bookId;
	String bookName, authorName, availability;
	double bookPrice;
	final String libraryName = "HiveMind";
	
	public void createBooks(int bookId, String bookName, String authorName, String availability, double bookPrice)
	{
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.availability = availability;
		this.bookPrice = bookPrice;
	}

	public void displayBook()
	{
		System.out.println("-------------------------------------------------------|");
		System.out.println("Book_ID        :   "+bookId);
		System.out.println("Book_Name      :   "+bookName);
		System.out.println("Author_Name    :   "+authorName);
		System.out.println("Book_Price     :   "+bookPrice);
		System.out.println("Availibility   :   "+availability);
		System.out.println("Library_Name   :   "+libraryName);
		System.out.println("-------------------------------------------------------|");
	}
	
	public void displayBookByName()
	{
			
		System.out.println(bookId + " ---> " + bookName);
		
	}
	
	public void borrowBook()
	{
		if(availability=="available" || availability=="Available" || availability=="AVAILABLE")
		{
			System.out.println("-------------------------------------------------------|");
			System.out.println("Lucky You, Book is Available for Borrow.");
		}
		else {
			System.out.println("-------------------------------------------------------|");
			System.out.println("Sorry, Book is Not Available now for Borrow.");
		}
	}
	
}



public class Book_Management_System {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice, detail, borrow;
		
		Books book1 = new Books();
		Books book2 = new Books();
		Books book3 = new Books();
		Books book4 = new Books();
		Books book5 = new Books();
		book1.createBooks(1, "Rhythm Roger", "Himangshu Rai", "Unavailable", 250);
		book2.createBooks(2, "Chakra", "Stan Lee", "Available", 350.50);
		book3.createBooks(3, "Devi", "Graphics India", "AVAILABLE", 110.50);
		book4.createBooks(4, "You're Gone", "J.S. Morton", "Unavailable", 200.00);
		book5.createBooks(5, "Biswasghatak", "Narayan Syanal", "available", 500.25);
		
		
		do {
		System.out.println("~~~~~~~~~~~~~~~~ :Book Management System: ~~~~~~~~~~~~~|");
		System.out.println("\tEnter 1 For Displaying Available Books. \n"	+ "\tEnter 2 For Checking Perticular Book Details. \n" + "\tEnter 3 For Borrowing a Book.\n" + "\tEnter 4 For Leaving this Application!");
		choice = sc.nextInt();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
		
		switch(choice)
		{
		case 1:
			book1.displayBook();
			book2.displayBook();
			book3.displayBook();
			book4.displayBook();
			book5.displayBook();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
			System.out.println("\n \n \n");
			break;
			
		case 2:
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
			System.out.println("                      Book Names                        ");
			System.out.println("                    --------------                      ");
			book1.displayBookByName();
			book2.displayBookByName();
			book3.displayBookByName();
			book4.displayBookByName();
			book5.displayBookByName();
			System.out.println("-------------------------------------------------------|");
			
			System.out.println("Enter the Book ID for which You want all Details: ");
			
			detail = sc.nextInt();
			switch(detail) {
			case 1:
				book1.displayBook();
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
				break;
				
			case 2:
				book2.displayBook();
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
				break;
				
			case 3:
				book3.displayBook();
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
				break;
				
			case 4:
				book4.displayBook();
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
				break;
				
			case 5:
				book5.displayBook();
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
				break;
				
			default:
				System.out.println("!!!Wrong Input!!!   Please Enter Valid Book ID Next Time.");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
			}
			
			System.out.println("\n \n \n");
			break;
			
		case 3:
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
			System.out.println("Enter the Book ID, Which You want to Borrow: ");
			borrow = sc.nextInt();
			switch(borrow) {
			case 1:
				book1.borrowBook();
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
				break;
				
			case 2:
				book2.borrowBook();
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
				break;
				
			case 3:
				book3.borrowBook();
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
				break;
				
			case 4:
				book4.borrowBook();
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
				break;
				
			case 5:
				book5.borrowBook();
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
				break;
				
			default:
				System.out.println("!!!Wrong Input!!!  Please Enter Valid Book ID Next Time.");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
			}
			
			System.out.println("\n \n \n");
			break;
			
		case 4:
			System.out.println("Now The Program will Terminate.");
			
			System.exit(0);
			break;
			
		default:
			System.out.println("Please Enter a Valid Number. (Between 1 to 4)");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
			System.out.println("\n \n \n");
		}
		

		}while(choice!=4);
	}

}

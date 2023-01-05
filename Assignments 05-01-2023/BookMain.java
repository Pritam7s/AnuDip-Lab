package bookManage;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;
		BookService bService = new BookService();
		
		do {
			System.out.println("Welcome to Book Management System.");
			System.out.println("1-> Create Book Details \n"
					+ "2-> Get Book Details Using ID \n"
					+ "3-> Get All Book Details \n"
					+ "4-> Get Book Details Using Book Name \n"
					+ "5-> Get Book Details Using Author \n"
					+ "0-> Exit The Application \n");
			System.out.println("====================================");
			System.out.println("\nEnter Your Choice: ");
			ch = sc.nextInt();
			switch(ch){
				case 1:
					bService.createBook();
					System.out.println();
					break;
					
				case 2:
					System.out.println();
					bService.gtBookDetailsUsingId();
					break;
					
				case 3:
					System.out.println();
					bService.getAllBookDetails();
					break;
					
				case 4:
					System.out.println();
					bService.getBookDetailsUsingName();
					break;
					
				case 5:
					System.out.println();
					bService.getBookDetailsUsingAuthor();
					break;
					
				case 0:
					System.out.println();
					System.out.println("Thank You for Visiting.");
					System.exit(0);
					break;
					
				default:
					System.out.println("\nEnter a Valid Choice.\n");	
			}
		}while(ch!=0);
	}

}

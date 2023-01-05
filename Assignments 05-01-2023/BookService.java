package bookManage;

import java.util.Scanner;

public class BookService {
	static Book book[] = new Book[10];
	static Scanner sc = new Scanner(System.in);
	static int index=0;
	
	//create book method
	public static void createBook(){
		System.out.println("Enter Book ID: ");
		int id = sc.nextInt();
		
		sc.nextLine();	//for consuming next line
		System.out.println("Enter Book Name: ");
		String bname = sc.nextLine();
		
		//sc.nextLine();
		System.out.println("Enter Author Name: ");
		String author = sc.nextLine();
		
		System.out.println("Enter Book Price: ");
		double price = sc.nextDouble();
		
		book[index] = new Book(id, bname, author, price);
		index++;
		System.out.println("Book Details Added!!");
	}
	
	//get all book details
	public static void getAllBookDetails() {
		for(int i=0;i<index;i++) {
			System.out.println("Book ID: "+book[i].getBookId());
			System.out.println("Book Name "+book[i].getBookName());
			System.out.println("Author Name: "+book[i].getAuthor());
			System.out.println("Book Price: "+book[i].getBookPrice());
			System.out.println("=====================================");
		}
	}
	
	//get book deytails using id
	public static void gtBookDetailsUsingId() {
		boolean flag=false;
		System.out.println("Enter Book ID to Search: ");
		int id = sc.nextInt();
		for(int i=0;i<index;i++) {
			if(id==book[i].getBookId()) {
				System.out.println("Book ID: "+book[i].getBookId());
				System.out.println("Book Name "+book[i].getBookName());
				System.out.println("Author Name: "+book[i].getAuthor());
				System.out.println("Book Price: "+book[i].getBookPrice());
				System.out.println("=====================================");
				flag = true;
				break;
			}
		}
			if(flag==false) {
				System.out.println("Book Id is not Valid or Unavailable. \n");
				System.out.println("=====================================");

			}
	}
	
	// get book details using book name
	public static void getBookDetailsUsingName() {
		boolean flag2=false;
		sc.nextLine();
		System.out.println("Enter Book Name to Search: ");
		String nme = sc.nextLine();
		for(int i=0;i<index;i++) {
			if(nme.equalsIgnoreCase(book[i].getBookName())) {
				System.out.println("Book ID: "+book[i].getBookId());
				System.out.println("Book Name "+book[i].getBookName());
				System.out.println("Author Name: "+book[i].getAuthor());
				System.out.println("Book Price: "+book[i].getBookPrice());
				System.out.println("=====================================");
				flag2 = true;
				break;
			}
		}
			if(flag2==false) {
				System.out.println("Book Name is not Valid or Unavailable. \n");
				System.out.println("=====================================");

			}
	} 
	
	//get book details using author name
	public static void getBookDetailsUsingAuthor() {
		boolean flag3=false;
		sc.nextLine();
		System.out.println("Enter Author Name to Search: ");
		String auth = sc.nextLine();
		for(int i=0;i<index;i++) {
			if(auth.equalsIgnoreCase(book[i].getAuthor())) {
				System.out.println("Book ID: "+book[i].getBookId());
				System.out.println("Book Name "+book[i].getBookName());
				System.out.println("Author Name: "+book[i].getAuthor());
				System.out.println("Book Price: "+book[i].getBookPrice());
				System.out.println("=====================================");
				flag3 = true;
				
			}
		}
			if(flag3==false) {
				System.out.println("Author Name is not Valid or Unavailable. \n");
				System.out.println("=====================================");

			}
	}
	
	
}

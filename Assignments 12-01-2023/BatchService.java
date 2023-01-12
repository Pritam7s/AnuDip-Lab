package batch_application;
import java.util.*;
public class BatchService {
	//CRUD -> Create, Read, Update, Delete
	static Scanner sc = new Scanner(System.in);
	static Java java[] = new Java[20];
	static int id;
	static long phone;
	static String name,email;
	static int jindex=0;
	
	//student info taking for java course
	public static void javaStudentInfo() {
		System.out.println("Enter Student ID: ");
		id = sc.nextInt();
		
		System.out.println("Enter Student Name: ");
		name = sc.nextLine();
		
		System.out.println("Enter Student Email Id: ");
		email = sc.nextLine();
		
		System.out.println("Enter Student Phone No: ");
		phone = sc.nextLong();
		
		java[jindex] = new Java(id, phone, name, email);
		jindex++;
		System.out.println("Student Details Assed Successfully...");
	}
	
	
	//get java student details
	public static void getAllJavaStudentDetails() {
		for(int i=0;i<jindex;i++) {
			System.out.println("Student ID: \t"+java[i].getStdid());
			System.out.println("Student Name: \t"+java[i].getSname());
			System.out.println("Student Phone: \t"+java[i].getPhone());
			System.out.println("Student Email ID: \t"+java[i].getEmail());
			System.out.println("Course Name: JAVA");
			System.out.println("==================================================");
		}
	}
	
	//update sudent info
	public static void updateJavaStudentInfo() {
		System.out.println("Enter Student ID: ");
		id=sc.nextInt();
		for(int i=0;i<jindex;i++) {
			if(id==java[i].getStdid()) {
				System.out.println("Enter Student ID to Update: ");
				id=sc.nextInt();
				
				sc.nextLine();
				System.out.println("Enter Student Name to Update: ");
				name=sc.nextLine();
				
				System.out.println("Enter Student Phone no to Update: ");
				phone=sc.nextLong();
				
				sc.nextLine();
				System.out.println("Enter Student Email to Update: ");
				email=sc.nextLine();
				
				java[i]=new Java(id, phone, name, email);
				System.out.println("Successfully Updated...");
			}
			else {
				throw new StudentNotFountException("Student Details Not Found!!!");
			}
		}
	}
	
	
	
}

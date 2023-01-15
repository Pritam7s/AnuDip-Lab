package batch_application;
import java.util.*;

public class BatchMain {

	public static void main(String[] args) {
		
		System.out.println("\t--- Welcome to Anudip Foundation ---");
		System.out.println("\t====================================\n");
		int choice, ch;
		Scanner sc = new Scanner(System.in);
		BatchService batch = new BatchService();
		
		do {
			System.out.println("Enter Your Choice: 1-->Java  2-->AWS  3-->Others  4-->Exit");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					System.out.println("\t--- JAVA ---");
					System.out.println("\t~~~~~~~~~~~~");
					System.out.println("1--> Enter Student Info \n2--> Show Student Info \n3--> Update Student Info");
					ch = sc.nextInt();
					switch(ch) {
						case 1:
							batch.javaStudentInfo();
							System.out.println();
							break;
							
						case 2:
							batch.getAllJavaStudentDetails();
							System.out.println();
							break;
							
						case 3:
							batch.updateJavaStudentInfo();
							System.out.println();
							break;
							
						default:
							System.out.println("Wrong Input!!!");
					}
				
					break;
				
				case 2:
					System.out.println("\t--- AWS ---");
					System.out.println("\t~~~~~~~~~~~~");
					System.out.println("1--> Enter Student Info \n2--> Show Student Details \n3--> Update Student Info");
					ch = sc.nextInt();
					switch(ch) {
						case 1:
							batch.awsStudentInfo();
							System.out.println();
							break;
							
						case 2:
							batch.getAllAwsStudentDetails();
							System.out.println();
							break;
							
						case 3:
							batch.updateAwsStudentInfo();
							System.out.println();
							break;
							
						default:
							System.out.println("Wrong Input!!!");
					}
					
					break;
				
				case 3:
					
					break;
					
				case 4:
					System.out.println("Application will Terminate Now....");
					System.exit(0);
					break;
					
				default:
					System.out.println("Wrong Input!!!");
			}
		}while(true);
		
	}

}

package tax_Calculator;
import java.util.*;
public class TaxCalculator {
	static String empName, country;
	static boolean isIndian=false;
	static double empSal, taxAmount;
	static Scanner sc = new Scanner(System.in);
	
	static double calculateTax() {	
			System.out.println("Enter the Salary: ");
			empSal = sc.nextDouble();
			
			if(empSal>=100000 && isIndian==true) {
				taxAmount = ((empSal*8)/100);
				System.out.println("Tax Amount is: "+taxAmount);
			}
			else if(empSal>=50000 && empSal<=100000 && isIndian==true) {
				taxAmount = ((empSal*6)/100);
				System.out.println("Tax Amount is: "+taxAmount);
			}
			else if(empSal>=30000 && empSal<=50000 && isIndian==true) {
				taxAmount = ((empSal*5)/100);
				System.out.println("Tax Amount is: "+taxAmount);
			}
			else if(empSal>=10000 && empSal<=30000 && isIndian==true) {
				taxAmount = ((empSal*4)/100);
				System.out.println("Tax Amount is: "+taxAmount);
			}
			else {
				System.out.println("The Employee does not need to pay tax.");
			}
			
		return taxAmount;
	}
	
	
	
	static void country() throws CountryNotValidException{
		sc.nextLine();
		System.out.println("Is Employee Indian? (True / False)");
		country = sc.nextLine();
		if(country.equalsIgnoreCase("True")) {
			isIndian=true;
		}
		else if(country.equalsIgnoreCase("False")) {
			isIndian=false;
			System.out.println("The employee should be an Indian citizen for calculating tax.");
		}
		else {
			System.out.println("You have to give imput either True or False!!!");
		}
	}
	
	
	static void employee() throws EmployeeNameInvalidException{
		System.out.println("Enter Employee Name: ");
		empName = sc.nextLine();
		if(empName.equalsIgnoreCase("")) {
			System.out.println("The emloyee name can not be empty.");
		}
		
	
	}
	
}

package abstractions;

import java.util.Scanner;

abstract class Vaccine{
	Scanner sc = new Scanner(System.in);
	String citizen, name;
	int age, price;
	
	
	
	public void firstDose() {
		sc.nextLine();
		System.out.println("Enter Your Name: ");
		name = sc.nextLine();
		
		System.out.println("Enter Your Country Name: ");
		citizen = sc.nextLine();
		
		if(citizen.equalsIgnoreCase("India")) {
			System.out.println("Enter Your Age: ");
			age =sc.nextInt();
			
			if(age>=18) {
				System.out.println("Give the Price for the Vaccine: ");
				price = sc.nextInt();
				if(price==250) {
					System.out.println("Successfully Vaccinated with First Dose.");
				}
				else {
					System.out.println("Single Dose of Vaccine Cost is ₹250.");
				}
			}
			else {
				System.out.println("Age Must be More or Equals to 18 Years.");
			}
		}
		else {
			System.out.println("Sorry, Vaccines Only for citizens of India.");
		}
	}
	
	
	
	public void secondDose() {
		System.out.println("Are You Vaccinated With First Dose? (Y/N) ? ");
		char c = sc.next().charAt(0);
		if(c=='Y' || c=='y') {
			System.out.println("Has it been Two Months since Your First Dose of Vaccine? (Y/N) ? ");
			c = sc.next().charAt(0);
			if(c=='y' || c=='Y') {
				System.out.println("Give the Price for the Vaccine: ");
				price = sc.nextInt();
				if(price==250) {
					System.out.println("Successfully Vaccinated with Second Dose.");
				}
				else {
					System.out.println("Single Dose of Vaccine Cost is ₹250.");
				}
			}
			else {
				System.out.println("Come After Two Months of completion since Your First Dose of Vaccination.");
			}
		}
		else {
			System.out.println("For Second Dose, atleast You need to be Vaccinated with First Dose.");
		}
	}
	
	
	
	
	abstract public void booster();
}




class VaccinationSuccess extends Vaccine{

	@Override
	public void booster() {
		
		System.out.println("Are You Vaccinated With Both Doses? (Y/N) ? ");
		char x = sc.next().charAt(0);
		if(x=='Y' || x=='y') {
			System.out.println("Has it been Two Months since Your Second Dose of Vaccine? (Y/N) ? ");
			x = sc.next().charAt(0);
			if(x=='y' || x=='Y') {
				System.out.println("Give the Price for the Booster Dose: ");
				price = sc.nextInt();
				if(price==550) {
					System.out.println("Successfully Vaccinated with Booster Dose.");
				}
				else {
					System.out.println("Single Booster Dose Cost is ₹550.");
				}
			}
			else {
				System.out.println("Come After Two Months of completion since Your Second Dose of Vaccination.");
			}
		}
		else {
			System.out.println("For Booster Dose, You need to be Vaccinated with Both (First & Second) Doses.");
		}
	}
	
}

public class Vaccination {

	public static void main(String[] args) {
		VaccinationSuccess vac = new VaccinationSuccess();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("---:  Welcome To COVID-19 VACCINATION Center  :---");
			System.out.println("Enter Any of the Following Number: \n 1 For First Dose \n 2 For 2nd Dose \n 3 For Booster Dose \n 4 For Exit.");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					vac.firstDose();
					System.out.println();
					break;
					
				case 2:
					vac.secondDose();
					System.out.println();
					break;
					
				case 3:
					vac.booster();
					System.out.println();
					break;
					
				case 4:
					System.out.println("Apllication Will Terminate Now.....");
					System.exit(0);
					break;
					
				default: 
					System.out.println("Please Give a Valid Input!!!\n");
			}
		}while(true);
	}

}

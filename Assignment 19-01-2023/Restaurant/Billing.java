package restaurant;
import java.util.*;
public class Billing {
	static ArrayList<Bill> list = new ArrayList<Bill>();
	static Scanner sc = new Scanner(System.in);
	
	static void order(String fname, int amnt) {
		System.out.println("Enter the Quantity for "+fname+" :");
		int qty = sc.nextInt();
		list.add(new Bill(fname, qty,qty*amnt));
	}
	
	static void cont() {
		System.out.println("Do You Want to Order More: (Y/N)");
		char ch = sc.next().charAt(0);
		if(ch=='n'|| ch=='N') {
			System.out.println();
			totalBill(); 	//total payable amount
			System.exit(0);
		}
	}
	
	
	
	
	static void totalBill() {
		System.out.println("-------------------------------------");
		System.out.println("\t< Bill >");
		System.out.println("\t--------");
		System.out.println("Quantity  Amount \t Item");
		double total=0.0;
		for(Bill i: list) {
			System.out.println("    "+i.qty+" \t   "+i.amnt+" \t "+i.fname);
			total=total+i.amnt;
			
		}
		
		System.out.println();
		System.out.println("Amount   : ₹"+total);
		double gst = total*0.05;
		System.out.println("GST      : ₹"+gst);
		System.out.println("-------------------------------------");
		double famnt = gst+total;
		System.out.println("Total Amount to Pay: ₹"+famnt);
		//coupons();
		System.out.println("-------------------------------------");
		System.out.println("Do You have any Coupons to apply: (Y/N)");
		char c = sc.next().charAt(0);
		double pamnt;
		if(c=='y'|| c=='Y') {
			System.out.println("Enter Coupon Code in CAPS: ");
			sc.nextLine();
			String cpn = sc.nextLine();
			if(cpn.equals("YUMMY")) {
				System.out.println("-------------------------------------");
				System.out.println("10% Discount Applied....");
				System.out.println("You Saved : ₹"+(famnt*0.1));
				pamnt = (famnt-(famnt*0.1));
				System.out.println("You Have to Pay Only: ₹"+pamnt);
				System.out.println("=====================================");
			}
			else if(cpn.equals("TOOMUCHHUNGRY")) {
				System.out.println("-------------------------------------");
				System.out.println("50% Discount Applied...");
				System.out.println("You Saved : ₹"+(famnt*0.5));
				pamnt = (famnt-(famnt*0.5));
				System.out.println("You Have to Pay Only: ₹"+pamnt);
				System.out.println("=====================================");
			}
			else if(cpn.equals("SPECIAL")) {
				System.out.println("-------------------------------------");
				System.out.println("80% Discount Applied...");
				System.out.println("You Saved : ₹"+(famnt*0.8));
				pamnt = (famnt-(famnt*0.8));
				System.out.println("You Have to Pay Only: ₹"+pamnt);
				System.out.println("=====================================");
			}
			else {
				System.out.println("-------------------------------------");
				System.out.println("Coupon is Not Valid...");
				System.out.println("Total Amount to Pay: ₹"+famnt);
				System.out.println("=====================================");
			}
		}
		else {
			System.out.println("-------------------------------------");
			System.out.println("Total Amount to Pay: ₹"+famnt);
			System.out.println("=====================================");
		}
		
	}
	
	
//	static void coupons() {
//		System.out.println("Do You have any Coupons to apply: y / n");
//		char c = sc.next().charAt(0);
//		if(c=='y'|| c=='Y') {
//			System.out.println("Enter Coupon Code in CAPS: ");
//			String cpn = sc.nextLine();
//			if(cpn=="FIRSTTIME") {
//				double pamnt = famnt*0.5;
//				
//			}
//		}
//		
//	}
	
	
}

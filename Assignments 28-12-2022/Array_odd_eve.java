package array_examples;

import java.util.Scanner;

public class Array_odd_eve {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter Array Limit: ");
		int s = sc.nextInt();	
		int a[] = new int[s];	
		int i, osum=0, esum=0, ocount=0, ecount=0;
		//taking input
		System.out.println("Enter the Array Elements: ");
		for(i=0;i<s;i++) {
			a[i] = sc.nextInt();
		}
		
		for(i=0;i<s;i++) {
			if(((a[i]%2)==0)) {
				ecount = ecount+1;
				esum = esum + a[i];
			}
			else {
				ocount = ocount+1;
				osum = osum +a[i];
			}
		}
		System.out.println();
		System.out.println("Total Even number: "+ ecount);
		System.out.println("Sum of Even numbers: "+ esum);
		
		System.out.println();
		System.out.println("Total Odd number: "+ ocount);
		System.out.println("Sum of Odd numbers: "+ osum);
		
	}

}

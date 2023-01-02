package array_examples;

import java.util.Scanner;

public class AddElementsSpecificPosition {

	public static void main(String[] args) {
		int ar[] = new int[20];
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Elements do you want to enter: ");
		int ele = sc.nextInt();
		System.out.println("Enter "+ ele +" Elements");
		for(int i=0;i<ele;i++) {
			ar[i] = sc.nextInt();
		}
		
		System.out.println("Original Array: ");
		for(int i=0;i<ele;i++) {
			System.out.print(ar[i] + "  ");
		}
		
		System.out.println("\nEnter Element you want to insert: ");
		int num = sc.nextInt();
		
		System.out.println("Enter which position you want to insert: ");
		int pos = sc.nextInt();
		
		if(pos>ele+1 || pos<0) {		//valid position or not
			System.out.println("Invalid Position");
		}
		else {
			//making room for new element
			for(int i=ele;i>=pos;i--) {
				ar[i]=ar[i-1];
			}
			ar[pos-1]=num;	//-1 for indexing and positioning
			ele++;
			System.out.println("After Insertion: ");
			for(int i=0;i<ele;i++) {
				System.out.print(ar[i]+" ");
			}
		}
	}

}

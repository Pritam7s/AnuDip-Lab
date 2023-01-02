package array_examples;

import java.util.*;


public class DeleteElementFromArray {

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
		
		
		System.out.println("\nEnter the Index from which you want to Delete: ");
		int pos = sc.nextInt();
		
		
		
		if(pos>ele+1 || pos<0) {		//valid position or not
			System.out.println("Invalid Position");
			System.exit(0);
		}
		else {
			
			System.out.println("After Deletion (Without Taking Another Array): ");
			for(int i=pos;i<ele-1;i++) {
				ar[i]=ar[i+1];		//skipping the index value; but it stores the last value twice just to fill the array(so array length -1).	
			}
			for(int i=0;i<ele-1;i++) {
				System.out.print(ar[i]+"  ");
			}
		}
		
		
		int copy[] = new int[ele - 1];
		System.out.println("\nAfter Deletion (With Another Array): ");
		for (int i=0, j=0; i<ele; i++) {
		    if (i != pos) {
		        copy[j++] = ar[i];
		    }
		}
		for(int i=0;i<ele-2;i++) {
			System.out.print(copy[i] + "  ");
		}
	}
}


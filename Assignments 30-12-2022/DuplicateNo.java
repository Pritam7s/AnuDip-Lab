package array_examples;

import java.util.Scanner;

public class DuplicateNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array:");
		int s = sc.nextInt(), count=0;
		int a1[]=new int[s];
		System.out.println("Enter the Elements: ");
		for(int i=0;i<s;i++) {
			a1[i]=sc.nextInt();
		}
		System.out.println("Array: ");
		for(int i=0;i<s;i++) {
			System.out.print(a1[i]+"  ");
		}
		
		//finding the duplicate elements
		System.out.println("\nDuplicate Elements are: ");
		for(int i=0;i<s-1;i++) {	  //for(int i=0;i<s;i++)
			for(int j=i+1;j<s;j++) {
				if(a1[i]==a1[j])
				{
					System.out.print(a1[i]+ "  ");
					count++;
					 break;
				}
			}
		}
		System.out.println("\nTotal Duplicate Elements: "+count);
	}

}

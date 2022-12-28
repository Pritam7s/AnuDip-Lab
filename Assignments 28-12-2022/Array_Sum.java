package array_examples;

import java.util.Scanner;

public class Array_Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//creating object o Scanner
		System.out.println("Enter Array Limit: ");
		int s = sc.nextInt();	//taking the limit of array during runtime
		int a[] = new int[s];	//declaring an array
		int sum=0;
		//taking input
		System.out.println("Enter the Array Elements: ");
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++) {	//finding the sum
			sum = sum+a[i];
		}
		System.out.println("Sum value of Array Elements: " + sum);
		
	}

}

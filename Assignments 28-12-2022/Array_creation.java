package array_examples;

import java.util.Scanner;

public class Array_creation {

	public static void main(String[] args) {
		int arr[]= {2,5,7,9};
		String name[] = {"Pritam", "Annie", "Surya", "Rima"};
		char c[] = {'a','b','c'};
		System.out.println(arr.length);
		System.out.println(c.length);
		
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		int arr1[] = new int[5];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Prining using For Loop: ");
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println("Printing using For-each Loop: ");
		for(int var: arr1) {
			System.out.println(var);
		}
	}

}

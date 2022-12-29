package array_examples;

import java.util.Scanner;

public class AddElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("Enter the size of the Array: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter "+size+" elements for the array: ");
		for(i=0;i<size;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("First Array: ");
		for(i=0;i<size;i++) {
			System.out.print(a[i]+"  ");
		}
		
		
		System.out.println();
		int b[] = new int[size];
		System.out.println("Enter "+size+" elements for the 2nd array: ");
		for(i=0;i<size;i++) {
			b[i] = sc.nextInt();
		}
		System.out.println("Second Array: ");
		for(i=0;i<size;i++) {
			System.out.print(b[i]+"  ");
		}
		
		
		System.out.println();
		int c[] = new int[size];
		for(i=0;i<size;i++) {
			c[i] = a[i]+b[i];
		}
		System.out.println("Array after Added Values: ");
		for(i=0;i<size;i++) {
			System.out.print(c[i]+"  ");
		}
		
	}

}

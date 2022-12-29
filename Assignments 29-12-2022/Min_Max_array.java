package array_examples;

import java.util.Scanner;

public class Min_Max_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("Enter the size of the Array: ");
		int size = sc.nextInt();
		int ar[] = new int[size];
		System.out.println("Enter "+size+" elements for the array: ");
		for(i=0;i<size;i++) {
			ar[i] = sc.nextInt();
		}
		System.out.println("Array: ");
		for(i=0;i<size;i++) {
			System.out.print(ar[i]+"  ");
		}
		
		System.out.println();
		int max=ar[0];
		int min=ar[0];
		for(i=0;i<size;i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
			if(ar[i]<min) {
				min=ar[i];
			}
		}
		System.out.println();
		System.out.println("Max value: "+max);
		System.out.println("Min value: "+min);
	}

}

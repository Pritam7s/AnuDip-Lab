package array_examples;

import java.util.Scanner;

public class Array_copy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter Array Limit: ");
		int s = sc.nextInt();	
		int a[] = new int[s];
		System.out.println("Enter the Array Elements: ");
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		
		int b[] = new int[s];
		System.out.println("After copying: \n");
		for(int i=0;i<s;i++) {
			b[i]=a[i];
			System.out.println(b[i]);
		}
	}

}

package array_examples;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortDesc {

	public static void main(String[] args) {
		int a[] = {12,10,9,5,41};
		
		System.out.println("Original Array: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
		
		
		System.out.println("\nDescending Order with Position Swaping: ");
		for(int i=0; i<a.length; i++) {
			for(int j=i+1;j<a.length;j++) {
				int t=0;
				if(a[i]<a[j]) {
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}

		Integer arr[] = {12,10,2,45,54,25};
		System.out.println("\n\nOriginal Array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println("\nDescending Order with Collections: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}

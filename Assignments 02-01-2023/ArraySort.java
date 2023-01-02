package array_examples;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int a[] = {12,10,9,5,41};
		
		System.out.println("Original Array: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
		
		Arrays.sort(a);
		System.out.println("\nArray Elements after Sorting in Ascending order: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
  }
}

package array_examples;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = {11,22,1,5,12,33,44,45};
		Arrays.sort(arr);
		System.out.println("Sorted Array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ "  ");
		}
		int ele = 12;
		int result = Arrays.binarySearch(arr, ele);
		if(result<0) {
			System.out.println("\nNot Found");
		}
		else {
			System.out.println("\nFound in position: "+ (result+1));
		}
	}

}

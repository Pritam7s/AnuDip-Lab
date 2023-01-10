package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraytoArrayList {

	public static void main(String[] args) {
		//Convert from Array to ArrayList
		String arr[] = {"Pritam", "Annie", "Sam", "Ashif"};
		System.out.println("Original Array Elements: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" . ");
		}
		ArrayList<String> alist3 = new ArrayList<String>(Arrays.asList(arr));
		//we can also add new elements
		alist3.add("Priya");
		System.out.println("\nArray to Array List: "+ alist3);
				
		//Convert from Array List to Array
		String arr2[] = new String[alist3.size()];
		for(int i=0;i<alist3.size();i++) {
			arr2[i]=alist3.get(i);
		}
		System.out.println("\nNew Array: ");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" . ");
		}
	}

}

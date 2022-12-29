package array_examples;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		int arr[][] = new int[3][];
		Scanner sc = new Scanner(System.in);
		arr[0] = new int[3];	//1st row 3 columns
		arr[1] = new int[4];	//2nd row 4 columns
		arr[2] = new int[2];	//3rd row 2 columns
		
		//initializing jagged array
		int count=1;
		System.out.println("Enter the elements of jagged array: ");
		for(int i=0;i<arr.length;i++) {	//for rows
			for(int j=0; j<arr[i].length; j++) {	//for columns
				arr[i][j] = sc.nextInt();
				//arr[i][j] = count++;
			}
		}
		
		System.out.println("Jagged Array");
		
		for(int i=0;i<arr.length;i++) {	//for rows
			for(int j=0; j<arr[i].length; j++) {	//for columns
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println(); 	//for next row
		}
	}

}

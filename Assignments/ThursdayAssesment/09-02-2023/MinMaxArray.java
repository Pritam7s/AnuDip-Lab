package thursday_9_2;

import java.util.Scanner;

public class MinMaxArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len=0;
		System.out.println("Enter the array Length: ");
		len= sc.nextInt();
		int a[] = new int[len];
		
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<len;i++) {
			a[i]=sc.nextInt();
		}
		
		int max=a[0], min=a[0];
		
		for(int i=0;i<len;i++) {
			if(max<a[i]) {
				max=a[i];
			}
			else if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println("Maximum number is Array is: "+ max);
		System.out.println("Minimum number is Array is: "+ min);
	}

}

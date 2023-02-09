package thursday_9_2;

import java.util.Scanner;

public class SearchInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len=0, search;
		boolean flag=false;
		System.out.println("Enter the array Length: ");
		len= sc.nextInt();
		int a[] = new int[len];
		
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<len;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter a number to search: ");
		search = sc.nextInt();
		for(int i=0;i<len;i++) {
			if(a[i]==search) {
				flag=true;
				break;
			}
			
		}
		if(flag==true) {
			System.out.println("Element Found in the Array.");
		}
		else {
			System.out.println("Element Not Found in the Array.");
		}
	}

}

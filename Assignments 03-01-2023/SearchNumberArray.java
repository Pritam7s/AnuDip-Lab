package array_examples;

import java.util.Scanner;

public class SearchNumberArray {

	public static void main(String[] args) {
		int s,i, pos=-1;
		//boolean flag = false;   //using boolean variable flag and initializing it as false
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Array Limit: ");
		s = sc.nextInt();
		int ar[] = new int[s];
		System.out.println("Enter " + s + " elements: ");
		for(i=0;i<s;i++) {
			ar[i] = sc.nextInt();
		}
		
		System.out.println("Which Element You Wnat to Search? ");
		int search = sc.nextInt();
		for(i=0;i<s;i++) {
			if(ar[i]==search) {
				//flag = true;	//if element is found setting flag s true
				pos = i;
				break;
			}
		}
		System.out.println(search + " Element found in: " + (pos+1) + " position.");
		if(pos!=-1) {	//if(flag==true)
			System.out.println("Found");
		}
		else {
			System.out.println("Element Not Found in Array");
		}
	}

}

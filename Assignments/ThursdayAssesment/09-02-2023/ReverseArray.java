package thursday_9_2;

import java.util.Scanner;

public class ReverseArray {
	
	 static void reverse(int a[], int n)
	    {
	        int i, j, t;
	        for (i=0; i<n/2; i++) {
	            t = a[i];
	            a[i] = a[n-i-1];
	            a[n-i-1] = t;
	        }
	        System.out.println("Reversed Array: ");
	        for (j=0; j<n; j++) {
	            System.out.print(a[j]+"  ");
	        }
	    }

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
		reverse(a,len);
		
	}

}

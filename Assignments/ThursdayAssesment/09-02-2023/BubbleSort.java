package thursday_9_2;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len=0, temp=0;
		System.out.println("Enter the array Length: ");
		len= sc.nextInt();
		int a[] = new int[len];
		
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<len;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0; i < len; i++){  
            for(int j=1; j < (len-i); j++){  
                     if(a[j-1] > a[j]){  
                            temp = a[j-1];  
                            a[j-1] = a[j];  
                            a[j] = temp;  
                    }     
            }  
		}
		
		 System.out.println("Array After Bubble Sort");  
         for(int i=0; i <a.length; i++){  
                 System.out.print(a[i] + " "); 
	}

}
}

package thursday_9_2;

import java.util.Scanner;

public class FirstLastDigit {

	public static void main(String[] args) {
		int a,f,l;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		l=a;
		l=l%10;
		System.out.println("The Last Digit of the Number is: " + l);
		
		f=a;
		while(f>10) {
			f=f/10;
		}
		System.out.println("The First Digit of the Number is: " + f);
	}

}

package basic;

import java.util.Scanner;

public class Strong_num {

	public static void main(String[] args) {
		int n,i,f,x,sum=0,rem;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		x=n;
		
		
		while(n!=0)
		{
			rem=n%10;
			f=1;
			for(i=1; i<=rem; i++)
			{
				f=f*i;

			}
		
			sum=sum+f;
			System.out.println(sum);
			n=n/10;
		}
		
		
		if(sum==x)
		{
			System.out.println("This is a Strong Number.");
		}
		else 
		{
			System.out.println("This is not a Strong Number.");
		}
		
	}

}

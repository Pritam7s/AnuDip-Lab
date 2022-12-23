package basic;

import java.util.Scanner;

public class Bank_deposit_withdrawl {
	public static int depo(int p, int x)
	{
		int dp = p+x;
		return dp;
	}
	public static int wid(int p, int y)
	{
		int wd=0;
		if(y>p)
		{
			System.out.println("You don't have Enough Amount for Withdrawl.");
			wd=p;
		}
		else
		{
			wd=p-y;
		}
		return wd;
	}
	public static void main(String[] args) {
		int a,b,p,choice,bl;
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("Enter the Primary Amount: ");
		p=sc.nextInt();
		System.out.println("Which Operation do You want to Perform?");
		System.out.println("Enter 1 for Deposit 2 for Withdrawl and 3 to Exit.");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Enter the Amount You want to Deposit: ");
			a=sc.nextInt();
			bl=depo(p,a);
			System.out.println("Available Balance is: "+ bl);
			break;
			
		case 2:
			System.out.println("Enter the Amount You want to Withdrawl: ");
			b=sc.nextInt();
			bl=wid(p,b);
			System.out.println("Available Balance is: "+ bl);
			break;
			
		case 3:
			System.out.println("Now The Program will Terminate.");
			System.exit(0);
			
		default:
			System.out.println("Enter a Valid Choice!!!");	
		}
		}while(choice!=3);

	}

}

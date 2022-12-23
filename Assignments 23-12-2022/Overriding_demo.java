package oops;

class Rbi{
	public void loanInterest()
	{
		System.out.println("9% Loan Interest for RBI Bank.");
	}
}

class Sbi extends Rbi{
	public void loanInterest()
	{
		System.out.println("5% Loan Interest for SBI Bank.");
	}
}

class Hdfc extends Rbi{
	public void loanInterest()
	{
		System.out.println("8.5% Loan Interest for HDFC Bank.");
	}
}
public class Overriding_demo {

	public static void main(String[] args) {
		Rbi bank;
		bank =new Sbi();
		bank.loanInterest();
		
		bank = new Hdfc();
		bank.loanInterest();
	}

}

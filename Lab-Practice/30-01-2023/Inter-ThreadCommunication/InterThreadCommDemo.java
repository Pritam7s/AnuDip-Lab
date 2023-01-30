package multi_threading;

class Account{
	int accBalance =10000;	//initial account balance
	synchronized void withdraw(int amount) {
		System.out.println("Start withdrawing...");
		if(this.accBalance<amount) {
			System.out.println("Insufficient Balance...");
			try {
				wait();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		this.accBalance= accBalance-amount;
		System.out.println("Rs. "+amount+" has been withdrawn successfully...");
	}
	
	
	synchronized void deposit(int amount) {
		System.out.println("Start Depositing...");
		this.accBalance = accBalance+amount;
		System.out.println("Rs. "+amount+" has been diposited successfully...");
		notifyAll();
	}
	
	
	synchronized void display() {
		System.out.println("Displaying Account Balance...");
		try {
			wait(300);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Available Balance: Rs. "+this.accBalance);
	}
}


public class package multi_threading;

class Account{
	int accBalance =10000;	//initial account balance
	synchronized void withdraw(int amount) {
		System.out.println("Start withdrawing...");
		if(this.accBalance<amount) {
			System.out.println("Insufficient Balance...");
			try {
				wait();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		this.accBalance= accBalance-amount;
		System.out.println("Rs. "+amount+" has been withdrawn successfully...");
	}
	
	
	synchronized void deposit(int amount) {
		System.out.println("Start Depositing...");
		this.accBalance = accBalance+amount;
		System.out.println("Rs. "+amount+" has been diposited successfully...");
		notifyAll();
	}
	
	
	synchronized void display() {
		System.out.println("Displaying Account Balance...");
		try {
			wait(300);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Available Balance: Rs. "+this.accBalance);
	}
}


public class InterThreadCommDemo {

	public static void main(String[] args) {
		Account acc = new Account();	//declaring objects
		
		new Thread() {
			public void run() {
				acc.withdraw(15000);
			}
		}.start();	//starting the thread
		
		new Thread() {
			public void run() {
				acc.deposit(20000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				acc.display();
			}
		}.start();
	}

}
 {

	public static void main(String[] args) {
		Account acc = new Account();	//declaring objects
		
		new Thread() {
			public void run() {
				acc.withdraw(15000);
			}
		}.start();	//starting the thread
		
		new Thread() {
			public void run() {
				acc.deposit(20000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				acc.display();
			}
		}.start();
	}

}

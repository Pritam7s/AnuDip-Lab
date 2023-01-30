package multi_threading;

 class PrintingData {
	synchronized void multiplication(int n) {	//synchronized method
		for(int i=1;i<=5;i++) {
			System.out.println(n+" * "+i+" = "+(n*i));
			try {
				Thread.sleep(400);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}


public class AnonymousClass {

	public static void main(String[] args) {
		PrintingData pd = new PrintingData();
		Thread t1 = new Thread() {
			public void run() {
				pd.multiplication(3);
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				pd.multiplication(7);
			}
		};
		
		t1.start();
		t2.start();
	}

}

package multi_threading;

class ShowData{
	void multi(int n) {
		synchronized(ShowData.class) {		//static synchronized same as this...
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
		
		System.out.println("Rest of the code which is not synchronized...");
	}
}

class ShowData2{
	void add(int a, int b) {
		synchronized(ShowData.class) {
				System.out.println(" Addition = "+(a+b));
				try {
					Thread.sleep(400);
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
		}
	}
}
public class SynchronizedBlock {

	public static void main(String[] args) {
		ShowData sd = new ShowData();
		ShowData2 sd2 = new ShowData2();
		
		Thread t1 = new Thread() {
			public void run() {
				sd.multi(6);
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				sd.multi(9);
			}
		};
		Thread t3 = new Thread() {
			public void run() {
				sd2.add(3, 4);
			}
		};
		Thread t4 = new Thread() {
			public void run() {
				sd2.add(37, 43);
			}
		};
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}

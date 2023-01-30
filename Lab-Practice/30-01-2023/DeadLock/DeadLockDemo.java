package multi_threading;

public class DeadLockDemo {

	public static void main(String[] args) {
		final String resource1 = "paper";
		final String resource2 = "pen";
		
		Thread t1 = new Thread() {
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread1 locked Resource1: Paper.");
					try {
						Thread.sleep(100);
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
					
					synchronized(resource2) {
						System.out.println("Wnated to Lock Resource2: Pen");
					}
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				synchronized (resource2) {
					System.out.println("Thread2 locked Resource2: Pen.");
					try {
						Thread.sleep(100);
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
					
					synchronized(resource1) {
						System.out.println("Wnated to Lock Resource1: Paper");
					}
				}
			}
		};
		
		t1.start();
		t2.start();
		
	}

}

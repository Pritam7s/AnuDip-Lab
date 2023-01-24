package multi_threading;

public class PrioritySleep extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(500); 	//500miliseconds
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
			System.out.println(i+" Thread is Running... "+ Thread.currentThread().getName() + "..." + Thread.currentThread().getPriority());
			System.out.println("-----------------------------------------");
		}
	}
	public static void main(String[] args) {
		PrioritySleep t1 = new PrioritySleep();
		PrioritySleep t2 = new PrioritySleep();
		PrioritySleep t3 = new PrioritySleep();
		PrioritySleep t4 = new PrioritySleep();
		
		t1.setName("First_Thread");
		t2.setName("Second_Thread");
		t3.setName("Third_Thread");
		t4.setName("Forth_Thread");
		
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		t3.setPriority(NORM_PRIORITY);
		t4.setPriority(7);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}

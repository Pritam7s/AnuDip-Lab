package thursday_9_2;

public class ThreadPriority  extends Thread{
	public void run() {
		System.out.println(" Thread is Running... "+ Thread.currentThread().getName() + "  Priority--> " + Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		
		ThreadPriority t1 = new ThreadPriority();		
		ThreadPriority t2 = new ThreadPriority();
		ThreadPriority t3 = new ThreadPriority();
		ThreadPriority t4 = new ThreadPriority();
		
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

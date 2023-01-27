package multi_threading;

public class JoinDemo extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Priority-->" + Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		JoinDemo jd1 = new JoinDemo();
		JoinDemo jd2 = new JoinDemo();
		JoinDemo jd3 = new JoinDemo();
		try {
			jd1.join(400);	//even if other thread has highest Priority it has to wait until this thread executes then the max priority can join and execute.
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		jd1.setName("Thread 1");
		jd1.start();
		jd2.setName("Thread 2");
		jd2.start();
		
		
		try {
			jd2.join(400);	//400 milliseconds for time slicing
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		jd3.setName("Thread 3 (Maximum Priority, but it'll join after Thread 2)");
		jd3.setPriority(MAX_PRIORITY);
		jd3.start();
	}

}

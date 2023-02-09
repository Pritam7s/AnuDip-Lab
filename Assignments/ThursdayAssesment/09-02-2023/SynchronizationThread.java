package thursday_9_2;

class Display {
	synchronized void add(int n) {	
		for(int i=1;i<=5;i++) {
			System.out.println(n+" + "+i+" = "+(n+i));
			try {
				Thread.sleep(300);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

class Thread1 extends Thread{
	Display t;
	
	public Thread1(Display t) {
		this.t=t;
	}
	
	public void run() {
		t.add(10);
	}
}

class Thread2 extends Thread{
	Display t;
	
	public Thread2(Display t) {
		this.t=t;
	}
	
	public void run() {
		t.add(500);
	}
}


public class SynchronizationThread {

	public static void main(String[] args) {
		Display dis = new Display();
		Thread1 t1 = new Thread1(dis);
		Thread2 t2 = new Thread2(dis);
		
		t1.start();
		t2.start();
	}

}

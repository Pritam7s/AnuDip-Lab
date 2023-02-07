package java8_Features;

import java.util.ArrayList;

interface runnable {
	void run();
}

public class LambdaEx {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Arindam");
		list.add("BhisnuPriya");
		list.add("Chinmayee");
		list.add("Harshad");
		//for each method is available from Java 8
		list.forEach((p) -> System.out.println(p));
		
		
		
		//without lambda expression
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread1 is running!");
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		
		//using lambda expression
		Runnable r2 = () -> {
			System.out.println("Thread2 is Running!!!");
		};
		Thread t2 = new Thread(r2);
		t2.start();
		
	}

}

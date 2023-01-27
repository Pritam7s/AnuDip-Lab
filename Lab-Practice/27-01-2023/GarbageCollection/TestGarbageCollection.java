package multi_threading;

public class TestGarbageCollection {
	
	public void finalize() {
		System.out.println("All Objects are Collected..");
	}

	public static void main(String[] args) {
		TestGarbageCollection t1 = new TestGarbageCollection();
		TestGarbageCollection t2 = new TestGarbageCollection();
		t1 = null;	//setting to be null or null referencing
		t2 = null;
		System.gc();
		System.out.println("All are unreferenced...");
	}

}

package oops;

class Addition{
	public void add(int a) {
		System.out.println("Addition of one parameter: "+(a+10));  // If we don't use () in a+10 then the '+' sign will be seen as Concatination.
	}
	
	public void add(int a, int b, int c) {
		System.out.println("Addition of three parameters: "+(a+b+c));
	}
	
	public void add(double a, double b) {
		System.out.println("Addition of Double parameter: "+(a+b));
	}
	
	public void add(int a, double b) {
		System.out.println("Addition of different parameter: "+(a+b));
	}
}

public class Method_overloading_demo {

	public static void main(String[] args) {
		Addition a= new Addition();
		a.add(5);
		a.add(5, 3, 7);
		a.add(31.17, 57.35);
		a.add(1, 13.75);
	}

}

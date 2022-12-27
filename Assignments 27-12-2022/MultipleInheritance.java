package abstractions;
//another way to perform Multiple Inheritance
abstract class B{ 	// declaring an abstract class
	abstract void display();	// abstract method
	
	public void demo()		// concrete method
	{
		System.out.println("Abstract Class..");
	}
}

interface C{		//declaring an interface
	void add(int a, int b);
}

class D extends B implements C{

	@Override
	public void add(int a, int b) {
		System.out.println("Sum Value: "+(a+b));
	}

	@Override
	void display() {
		System.out.println("Multiple Inheritance Achieved...");		
	}
	
}
public class MultipleInheritance {

	public static void main(String[] args) {
		D obj = new D();
		obj.add(3, 7);
		obj.display();
	}

}

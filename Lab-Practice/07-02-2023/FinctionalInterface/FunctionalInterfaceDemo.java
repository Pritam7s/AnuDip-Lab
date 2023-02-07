package java8_Features;

@FunctionalInterface
interface message{
	void say();	//abstract method
	
	default void msg() {	//default method
		System.out.println("Default Method with Body");
	}
	
	default void talk() {
		System.out.println("Second Default Method.");
	}
	
	// can contain any number of Objects class
	int hashCode();
	String toString();	//static method
	boolean equals(Object obj);	//object class
}
public class FunctionalInterfaceDemo implements message{

	@Override
	public void say() {
		System.out.println("Overriddden Abstract Method");
	}
	
	public static void main(String[] args) {
		FunctionalInterfaceDemo demo = new FunctionalInterfaceDemo();
		demo.msg();
		demo.say();
		demo.talk();
	}
}

/* Functional Interface - an interface that contains exactly one abstract method
 * It can have any number of default, static method but can contain only one abstract method
 * It can also declare method of object class
 * 
 * It is also known as Single Abstract Method Interface or SAM Interface.
 */

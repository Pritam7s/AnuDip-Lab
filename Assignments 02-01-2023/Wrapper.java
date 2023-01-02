package array_examples;

public class Wrapper {
	
	public static void check(int a) {
		System.out.println(a + " is an Integer.");
	}
	public static void check(char c) {
		System.out.println(c + " is a Character.");
	} 

	public static void main(String[] args) {
		
		//Auto-Boxing -> Conversion of Primitive Data types into it's corresponding Wrapper Class
		int a = 3;
		Integer b = Integer.valueOf(a);	//manual
		Integer d = a;		//automatic
		
		char s = 'P';
		Character c = s;	//automatic
		
		System.out.println("AutoBoxing: " + a + "  " + b + "  " + c + "  " + d + "  " +s);

		
		//Un-Boxing -> Conversion of Objects into Primitive Data Type
		Integer x = 7;
		int y = x.intValue(); //manually
		int z = x;			  //automatic
		System.out.println("\nUnBoxing: "+ y + "  " + z);
		
		System.out.println();
		Wrapper.check(z);
		Wrapper.check(c);
		
	}

}

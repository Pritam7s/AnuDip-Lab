package java8_Features;
interface readable{
	void message();
	//String msg();
	//int addition(int a, int b);
}
public class LambdaDemo {

	public static void main(String[] args) {
		//without lambda expression
		/*readable rd = new readable() {

			@Override
			public void message() {
				System.out.println("Heelloooooo ");
			}};
			rd.message();
			*/
		
		//using lambda expression
		readable rd = () -> System.out.println("Hellllllew");
		rd.message();
		
		/*
		 readable rd = () -> {
		 return "Learning Java 8 features";
		 };
		 System.out.println(s.msg());
		 */
		
//		readable add = (a,b) -> (a+b);
//		System.out.println("Addition: "+add.addition(5,5));
//		readable add2 = (int a, int b) -> {
//			return (a+b);
//		};
//		System.out.println("Addition: "+add2.addition(5,7));

	}

}

package mn_Maam;
@FunctionalInterface
interface sayable1{
	void say(String msg);
	int hashCode();
	String toString();
	boolean equals(Object obj);
}
public class FuncInterEx implements sayable1 {
	
	public static void main(String[] args) {
		FuncInterEx f =new FuncInterEx();
		f.say("Hello Java 8");
	}
	
	@Override		//overriding the method
	public void say(String msg) {
		System.out.println(msg);
	}

}

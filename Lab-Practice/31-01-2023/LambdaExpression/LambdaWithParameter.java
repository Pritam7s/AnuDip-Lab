package mn_Maam;
@FunctionalInterface
interface sayable4{
	public String say(int a, int b);
}
public class LambdaWithParameter {

	public static void main(String[] args) {
		sayable4 s = (a,b) -> {
			return "Java Lambda Function";
		};
		System.out.println(s.say(10, 20));
		
		//sayable s1=(a,b)->(a,b);
		//System.out.println(s1.say(100,200));
	}

}

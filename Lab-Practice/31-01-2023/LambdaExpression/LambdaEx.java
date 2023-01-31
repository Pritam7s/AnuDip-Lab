package mn_Maam;

@FunctionalInterface
interface sayable2{
	public String say();
}

public class LambdaEx {

	public static void main(String[] args) {
		sayable2 s = () -> {
			return "Java Lambda Function";
		};
		
		System.out.println(s.say());
	}

}

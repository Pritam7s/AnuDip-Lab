package mn_Maam;

import java.util.*;

public class LambdaForEach {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Pritam");
		list.add("Java");
		list.add("Java 8");
		list.add("Java 1");
		
		list.forEach(
			(n) -> System.out.println(n)
		);
	}

}

package collections;
import java.util.ArrayList;
import java.util.List;
public class ArrayListEx {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		System.out.println(list.size());
		list.add(11);
		list.add(12);
		list.add(13);
		System.out.println("Array: "+list);
		System.out.println("Size: "+list.size());
		list.add(15);
		list.add(17);
		System.out.println(list);
		System.out.println(list.size());
		
		list.add(1,16);
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);

		list.set(1, 55);
		System.out.println(list);

		list.replaceAll(x -> x+5);	//x is unary operator (we can set anything in place of x)
		System.out.println(list);

		
	}

}

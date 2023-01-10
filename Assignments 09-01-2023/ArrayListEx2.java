package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("List Size: "+list.size());
		list.add(11);
		list.add(12);
		list.add(13);
		System.out.println("\nArray: "+list);
		System.out.println("List Size: "+list.size());
		list.add(15);
		list.add(17);
		System.out.println("\nNew Array: "+list);
		System.out.println("List Size: "+list.size());
		
		Iterator itr = list.iterator();
		System.out.println("\nUsing Iterator: ");
		while(itr.hasNext()) {
			System.out.print(itr.next()+ " . ");
		}
		
		//List Sorting
		Collections.sort(list);
		System.out.println("\nSorting in Ascending Order: ");
		System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("\nSorting in Descending Order: ");
		System.out.println(list);
		
		//sublist
		System.out.println("\nSublist Of Array List: ");
		List<Integer> sublist = new ArrayList<Integer>(list.subList(1, 4));
		System.out.println(sublist);
		System.out.println("Another Way: ");
		List<Integer> sub1 = list.subList(2,4);
		System.out.println(sub1);
		
		
		//Search Elements
		System.out.println(list.contains(13));
		
	}

}

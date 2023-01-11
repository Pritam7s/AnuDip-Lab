package collections;
import java.util.*;
public class LinkedListEx {

	public static void main(String[] args) {
			LinkedList<String> names = new LinkedList<String>();
			Scanner sc = new Scanner(System.in);
			names.add("Amrita");
			names.add("Priya");
			names.add("Rahul");
			names.add("Madhurima");
			System.out.println(names);
			
			System.out.println("\nPrinting using For Each Loop: ");
			for(String e: names) {
				System.out.print(e+ " . ");
			}
			
			int count=0;
			System.out.println("\n\nUsing while loop: ");
			while(count<names.size()) {
				System.out.print(names.get(count)+ " . ");
				count++;
			}
			
			System.out.println("\n\nPrint using Iterator: ");
			Iterator itr = names.iterator();
			while(itr.hasNext()) {
				System.out.print(itr.next()+ " . ");
			}
			
			System.out.println("\n\nPerforming Adding Operations: ");
			names.addFirst("Sunita");	//adding at first position
			names.addLast("Suborno");	//adding at last position
			names.add(2,"Lokesh");		//adding at index position
			System.out.println(names);
			
			System.out.println("\n\nPerforming Removing Operations: ");
			names.removeFirst();	//removing from first position
			names.removeLast();		//removing from last position
			names.remove(2);		//removing from index position
			System.out.println(names.remove("Lokesh"));		//removing using object
			System.out.println(names);
			
			names.set(1, "Lokesh");		//replaces the value
			System.out.println("\n"+names);
			String name = names.get(0);	//to get the data
			System.out.println(name);
			System.out.println(names);
//			names.clear();	//removes all elements from the linkedlist & makes it empty
//			System.out.println(names);			
			
			ListIterator listit = names.listIterator();
			System.out.println("\nForward Direction: ");
			while(listit.hasNext()) {
				System.out.println(listit.next());
			}
			System.out.println("\nBackward Direction: ");
			while(listit.hasPrevious()) {
				System.out.println(listit.previous());
			}
			
			System.out.println("Printing in reverse using Descending Iterator: ");
			Iterator itr1 = names.descendingIterator();
			while(itr1.hasNext()) {
				System.out.println(itr1.next());
			}
			
			//checking the contents using if loop using contains keyword
			Scanner sa = new Scanner(System.in);
			System.out.println("Enter a Name to Check: ");
			String str = sa.next();
			
			if(names.contains(str)){
				System.out.println("Data is Present.");
			}
			else {
				System.out.println("Data is ot Present.");
			}
			
			System.out.println(names);
			System.out.println(names.lastIndexOf("Madhurima"));	//if present then it will give us the index value, if not present then it will give -1
			
			names.push("Priya");
			System.out.println(names);
			
		System.out.println("Popped Element: "+names.pop());
		System.out.println(names);
		System.out.println("Polled Element: "+names.poll());
		System.out.println(names);
		System.out.println("Polled Element: "+names.pollFirst());
		System.out.println(names);
		System.out.println("Polled Element: "+names.pollLast());
		System.out.println(names);
		
		
		names.push("Sandeep");
		names.push("Arnab");
    
		//convert linked list into array list
		List<String> arlist = new ArrayList<>(names);
		System.out.println("Converting Linked List to Array List: ");
		System.out.println(names);
    
		//convert Link list to array
		String array[] = names.toArray(new String[names.size()]);
		System.out.println("Convrerting Linked List to Array: ");
		for(int i=0; i<array.length;i++) {
			System.out.print(array[i]+" ");
		}

	}

}

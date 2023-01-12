package collections;
import java.util.*;
public class StackEx {

	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(23);
		stk.push(11);
		stk.push(32);
		stk.push(45);
		System.out.println(stk);
		
		System.out.println("Popping the top Element of the Stack: "+ stk.pop());
		System.out.println(stk);
		
		//search returns -1 value when the element in the stack is not found
		System.out.println("Position: "+stk.search(90));
		
		//peeking or retrieving the top element 
		System.out.println("Top Element: "+stk.peek());
		System.out.println(stk);
	}

}

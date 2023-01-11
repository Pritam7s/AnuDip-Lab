package collections;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>(5);	// if initial capacity is given then it will be taken as the default capacity
		//by default vector capacity is 10, and every time we increase the size it will double itself 
		vec.add("Riya");
		vec.add("Arnab");
		vec.add("Sandipta");
		vec.add("Pritam");
		//vec.add("Sunita");
		
		System.out.println(vec);
		System.out.println("Size of Vector: "+ vec.size());
		System.out.println("Default Capacity: "+vec.capacity());
		
		vec.addElement("Sunita");
		vec.addElement("Madhurima");
		
		System.out.println(vec);
		System.out.println("Size of Vector: "+ vec.size());
		System.out.println("Default Capacity: "+vec.capacity());
	}

}

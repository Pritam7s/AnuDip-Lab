package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(101, "Amrita");
		hmap.put(107, "Rahul");
		hmap.put(113, "Shawin");
		hmap.put(109, "Lokesh");
		hmap.put(111, "Sandeep");
		hmap.put(114, "Sabsick");
		System.out.println(hmap);
		
//		Set set = hmap.entrySet();
//		Iterator itr = set.iterator();
		
		Iterator itr = hmap.entrySet().iterator();
		
		while(itr.hasNext()) {
			Map.Entry mentry = (Entry) itr.next();
			System.out.println("Key: "+mentry.getKey());
			System.out.println("Value: "+mentry.getValue());
			
		}
		
		//get the values using key
		System.out.println("\nValue mapped with Key: "+hmap.get(111));
		
		//remove the value using key
		System.out.println("Removing the value using key: "+hmap.remove(113));
		
		System.out.println("\nAfter removing: ");
		for(Map.Entry me: hmap.entrySet()) {
			System.out.println("Key: "+me.getKey());
			System.out.println("Vlaue: "+me.getValue());
		}
		
		Map<Integer, String> tmap = new TreeMap<Integer, String>(hmap);
		System.out.println("\nAfter Sorting in TreeMap: ");
		for(Map.Entry me: tmap.entrySet()) {
			System.out.println("Key: "+me.getKey());
			System.out.println("Vlaue: "+me.getValue());
		}	
		
		//checking the size of hashmap and treemap
		System.out.println("\nHashMap Size: "+hmap.size());
		System.out.println("TreeMap Size: "+tmap.size());
		
		//checking key existence
		System.out.println("\nKey Present: "+hmap.containsKey(114));
		System.out.println("Key Present: "+hmap.containsKey(113));
		
		//checking value existence
		System.out.println("\nValue Present: "+hmap.containsValue("Rahul"));
		System.out.println("Value Present: "+hmap.containsValue("Pritam"));

		//to check whether the map is empty or not
		System.out.println("\nMap is Empty: "+hmap.isEmpty());
		hmap.clear();
		System.out.println("Map is Empty: "+hmap.isEmpty());
	}

}

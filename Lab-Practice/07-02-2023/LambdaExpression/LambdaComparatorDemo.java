package java8_Features;

import java.util.*;

class Person{
	int id;
	String name;
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
}
public class LambdaComparatorDemo {

	public static void main(String[] args) {
		ArrayList<Person> per = new ArrayList<Person>();
		per.add(new Person(101,"Sunita"));
		per.add(new Person(102,"Riya"));
		per.add(new Person(103,"Amrita"));

		System.out.println("Sorting Using Names: ");
		Collections.sort(per, (p1,p2) -> {
			return p1.name.compareTo(p2.name);
		});
		//print
		per.forEach((p) -> System.out.println(p));
		
		
		System.out.println("\nSorting using Id: ");
		Collections.sort(per,(p1,p2) -> {
			if(p1.id==p2.id)
				return 0;
			else if(p1.id>p2.id)
				return 1;
			else
				return -1;
		});
		//print
		per.forEach((p) -> System.out.println(p));
	}

}

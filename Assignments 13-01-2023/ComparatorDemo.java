package collections;
import java.util.*;
public class ComparatorDemo {
	
	public static void main(String[] args) {
		ArrayList<Student> alist = new ArrayList<Student>();
		alist.add(new Student(101,"Pritam",3));
		alist.add(new Student(102,"Annie",2));
		alist.add(new Student(103,"Sam",1));
		
		System.out.println("Sorting by Names: ");
		Collections.sort(alist, new NameComparator());
		Iterator itr = alist.iterator();
		while(itr.hasNext()) {
			Student s = (Student) itr.next();
			System.out.println(s.id +"-->"+s.name+"\t"+s.roll );
		}
		System.out.println();
		
		
		System.out.println("Sorting By ID: ");
		Collections.sort(alist, new IDComparator());
		Iterator itr1 = alist.iterator();
		while(itr1.hasNext())
		{
			Student s = (Student) itr1.next();
			System.out.println(s.id+"-->"+s.name+"\t"+s.roll);
		}
		System.out.println();

		
		System.out.println("Sorting by Roll:");
		Collections.sort(alist, new RollComparator());
		Iterator itr3 = alist.iterator();
		while(itr3.hasNext())
		{
			Student s = (Student) itr3.next();
			System.out.println(s.id+"-->"+s.name+"\t"+s.roll);
		}
		System.out.println();
	}
}

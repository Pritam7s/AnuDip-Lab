package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EmployeeHashMap {

	public static void main(String[] args) {
		Map<Integer, Employee> empMap = new HashMap<Integer, Employee>();
		
		//create employee objects
//		Employee emp1 = new Employee(101, "Shawin");
//		Employee emp2 = new Employee(102, "Sandeeep");
//		Employee emp3 = new Employee(103, "Riya");
//		Employee emp4 = new Employee(104, "Pratiksha");
		
		//storing the information in hash map
//		empMap.put(emp1.geteId(), emp1);
//		empMap.put(emp2.geteId(), emp2);
//		empMap.put(emp3.geteId(), emp3);
//		empMap.put(emp4.geteId(), emp4);
		
		//way to reduce the boiler plate codes by declaring anonymously
		empMap.put(1, new Employee(101,"Shawin"));
		empMap.put(2, new Employee(102,"Sandeeep"));
		empMap.put(3, new Employee(103,"Riya"));
		empMap.put(4, new Employee(104,"Pratiksha"));
		
		Set<Map.Entry<Integer, Employee>> employees = empMap.entrySet();
		for(Map.Entry em: employees) {
			System.out.println("Key: "+em.getKey());
			Employee employ = (Employee) em.getValue();
			employ.display();
			System.out.println();
		}
		
		//using iterator
		System.out.println("Printing using Iterator: ");
		Iterator itr = empMap.keySet().iterator();
		
		while(itr.hasNext()) {
			Employee emp = empMap.get(itr.next());
			emp.display();
			System.out.println();
		}
	}

}

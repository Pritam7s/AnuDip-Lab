package oops;

public class Test_student_bean {

	public static void main(String[] args) {

		Student_Bean stu = new Student_Bean();
		stu.setFirstName("Pritam");
		stu.setLastName("Mondal");
		stu.setId(307);
		stu.setAddress("Srirampur");
		
		System.out.println(stu.getFirstName());
		System.out.println(stu.getLastName());
		System.out.println(stu.getId());
		System.out.println(stu.getAddress());
		
		System.out.println();
		
		Student_Bean stud = new Student_Bean();
		stud.setFirstName("Annie");
		stud.setLastName("Roy");
		stud.setAddress("Kolkata");
		stud.setId(357);
		
		System.out.println(stud.getFirstName());
		System.out.println(stud.getLastName());
		System.out.println(stud.getId());
		System.out.println(stud.getAddress());
		
	}

}

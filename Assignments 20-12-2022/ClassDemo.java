package oops;

class Student{
	int id;
	String name, address;
	long phone;
	
	public void setData(int id, String name, String address, long phone) {
		this.id=id;
		this.name=name;
		this.address=address;
		this.phone=phone;
	}

	public void getData() {
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Mobile no: "+phone);
	}
}

public class ClassDemo {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.setData(101, "Pritam", "Trimohini", 9870123654l);
		stu.getData();
	}

}

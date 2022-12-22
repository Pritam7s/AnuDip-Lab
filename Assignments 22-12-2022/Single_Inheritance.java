package oops;

class User{		//parent /super /base class
	int id;
	String name,address;
	public void setData(int id, String name, String address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	public void display()
	{
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
	}
}

class Gamer extends User{
	double salary;
	String subject;
	
	public void setData(int id, String name, String address, double salary, String subject)
	{
		super.setData(id, name, address);		//parent class set data using super
		this.salary=salary;
		this.subject=subject;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Salary: "+salary);
		System.out.println("Subject: "+subject);
	}

}


public class Single_Inheritance {

	public static void main(String[] args) {
		Gamer gm =new Gamer();
		gm.setData(1, "Pritam", "Srirampur", 10000, "Tournament");
		gm.display();
	}

}

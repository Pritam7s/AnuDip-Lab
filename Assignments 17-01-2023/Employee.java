package collections;

public class Employee {
	private int eId;
	private String eName;
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public Employee(int eId, String eName) {
		super();
		this.eId = eId;
		this.eName = eName;
	}
	
	public Employee() {
		super();
	}
	
	public void display() {
		System.out.println("Employee ID: "+geteId());
		System.out.println("Employee Name: "+geteName());
	}
}

package oops;

class Company{
	int compId;
	String compName;
	
	Address address;
	
	public Company(int compId, String compName, Address address) {
		super();
		this.compId=compId;
		this.compName=compName;
		this.address=address;
	}

	public int getCompId() {
		return compId;
	}

	public String getCompName() {
		return compName;
	}

	public Address getAddress() {
		return address;
	}
	
	
}
public class Aggregation_demo {

	public static void main(String[] args) {

		Address address1 = new Address(700005,"Kolkata","WB","India");
		Address address2 = new Address(100003,"New York City","NY","USA");
		
		Company company1 = new Company(131,"Anudip", address1);
		Company company2 = new Company(757,"DipTech", address2);
		
		System.out.println("First Company: "+company1.getCompName());
		System.out.println("Address: "+company1.getAddress().getCity());
		
		System.out.println();

		System.out.println("Second Company: "+company2.getCompName());
		System.out.println("Address: "+company2.getAddress().getCity());
		
	}

}

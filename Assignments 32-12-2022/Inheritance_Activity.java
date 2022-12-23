package oops;

class Employees{
	long employeeId,employeePhone;
	String employeeName,employeeAddress;
	double basicSalary;
	final double specialAllowance=250.80, hra=1000.50;
	

	public Employees(long employeeId, String employeeName, String employeeAddress, long employeePhone) 
	{
		super();
		this.employeeId = employeeId;
		this.employeePhone = employeePhone;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
	}
	
	public double calculateSalary()
	{
		double salary = (basicSalary + ((basicSalary * specialAllowance)/100) + ((basicSalary * hra)/100));
		return salary;
	}
	public double calculateTransportAllowance()
	{
		double transportAllowance = ((basicSalary *10)/100);
		return transportAllowance;
	}

	@Override
	public String toString() {
		return "Employees [\n EmployeeId = " + employeeId + "\n EmployeePhone = " + employeePhone + "\n EmployeeName = "
				+ employeeName + "\n EmployeeAddress = " + employeeAddress + "\n BasicSalary = " + basicSalary
				+ "\n SpecialAllowance = " + specialAllowance + "\n HRA = " + hra + "\n]";
	}
	
	

}



class Manager extends Employees{
	public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone, double salary)
	{
		super(employeeId, employeeName, employeeAddress, employeePhone);
		this.basicSalary = salary;
	}
	
	public double calculateTransportAllowance()
	{
		double transportAllowance = ((basicSalary * 15)/100);
		return transportAllowance;
	}
	
}

class Trainee extends Employees{
	public Trainee(long employeeId, String employeeName, String employeeAddress, long employeePhone, double salary)
	{
		super(employeeId, employeeName, employeeAddress, employeePhone);
		this.basicSalary = salary;
	}
}



public class Inheritance_Activity {
	public static void main(String[] args) {
		
		Employees emps;
		emps = new Manager(126534,"Peter","Chennai India",237844,65000);
		System.out.println(emps);
		System.out.println("Total Salary ="+ emps.calculateSalary());
		System.out.println("Travel Allowance ="+ emps.calculateTransportAllowance());
		
		System.out.println();
		
		emps = new Trainee(29846,"Jack","Mumbai India",442085,45000);
		System.out.println(emps);
		System.out.println("Total Salary ="+ emps.calculateSalary());
		System.out.println("Travel Allowance ="+ emps.calculateTransportAllowance());
		
	}
}




package oops;

class Anudip{
	private int dipId;
	private String anuName;
	
	public Anudip() {
		super();
	}
	
	public Anudip(int dipId, String anuName)
	{
		super();
		this.dipId=dipId;
		this.anuName=anuName;
	}
	
	public void setAdnudipId(int dipId)	//setter
	{
		this.dipId=dipId;
	}
	
	public int getAnudipId()	//getter
	{
		return dipId;
	}
	
	public void setAnudipName(String anuName)
	{
		this.anuName=anuName;
	}
	
	public String getAnudipName()
	{
		return anuName;
	}

	@Override
	public String toString() {
		return "Anudip [dipId=" + dipId + ", anuName=" + anuName + "]";
	}
	
	
}
public class JavaBeanDemo {

	public static void main(String[] args) {
		Anudip stu = new Anudip();
		stu.setAdnudipId(101);
		stu.setAnudipName("MAKAUT");
		System.out.println(stu);
		System.out.println("\nCollege Name: "+stu.getAnudipName());
	}

}

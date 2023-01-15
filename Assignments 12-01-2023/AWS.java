package batch_application;

public class AWS {
	private int stuid;
	private String stuname;
	private long phone;
	private String email;
	
	
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public AWS() {
		super();
	}
	
	
	public AWS(int stuid, String stuname, long phone, String email) {
		super();
		this.stuid = stuid;
		this.stuname = stuname;
		this.phone = phone;
		this.email = email;
	}
}

package batch_application;

public class Java {
	private int stdid;
	private long phone;
	private String sname,email;
	
	
	public int getStdid() {
		return stdid;
	}
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public Java() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Java(int stdid, long phone, String sname, String email) {
		super();
		this.stdid = stdid;
		this.phone = phone;
		this.sname = sname;
		this.email = email;
	}

	
}

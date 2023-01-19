package restaurant;

public class Bill {
	String fname;
	int qty;
	double amnt;
	
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getAmnt() {
		return amnt;
	}
	public void setAmnt(double amnt) {
		this.amnt = amnt;
	}
	
	
	public Bill(String fname, int qty, double amnt) {
		super();
		this.fname = fname;
		this.qty = qty;
		this.amnt = amnt;
	}
		
}

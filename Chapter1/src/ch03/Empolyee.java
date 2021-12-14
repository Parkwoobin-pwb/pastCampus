package ch03;

public class Empolyee {
	
	private static int serialNum = 1000;
	
	private int empolyeeId;
	private String empolyeeName;
	private String deparment;
	
	public Empolyee() {
		serialNum++;
		empolyeeId = serialNum;
	}
	
	
	
	public static int getSerialNum() {
		
		return serialNum;
	}
	


	public int getEmpolyeeId() {
		return empolyeeId;
	}
	public void setEmpolyeeId(int empolyeeId) {
		this.empolyeeId = empolyeeId;
	}
	public String getEmpolyeeName() {
		return empolyeeName;
	}
	public void setEmpolyeeName(String empolyeeName) {
		this.empolyeeName = empolyeeName;
	}
	public String getDeparment() {
		return deparment;
	}
	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}
	
	
}

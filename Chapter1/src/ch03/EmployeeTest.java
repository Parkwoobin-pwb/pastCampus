package ch03;

public class EmployeeTest {

	public static void main(String[] args) {
		Empolyee empolyee = new Empolyee();
		empolyee.setEmpolyeeName("이순신");
		
		System.out.println(empolyee.getSerialNum());//인스턴스 생성여부없이 사용가능
		
		Empolyee empolyIkm = new Empolyee();
		empolyIkm.setEmpolyeeName("김유신");
		
		
		System.out.println(empolyee.getEmpolyeeName()+"님의 사번은"+empolyee.getEmpolyeeId());
		System.out.println(empolyIkm.getEmpolyeeName()+"님의 사번은"+empolyIkm.getEmpolyeeId());

	}

}

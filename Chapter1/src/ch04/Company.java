package ch04;

public class Company {
	
	//회사는 유일해야한다 싱글톤패턴 예시
	private static Company instance = new Company(); 
	//유일한객체를 외부에서 쓸수있도록한다.
	
	public  static Company getInstance() {
		
		if(instance == null) {
			instance = new Company(); //인스턴스가 널이면 뉴인스턴스 생성
		}
		return instance;
	}
	
	//생성자제공
	private Company() {
		
	}
	
	
	
}

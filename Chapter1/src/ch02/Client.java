package ch02;

public class Client {
	String clientName;
	int money;
	
	public Client(String clientName, int money) {
		this.clientName = clientName;
		this.money = money;
	}
	
	public void take(Taxi taxi) {
		taxi.take(4000);
		this.money -=4000;
	}
	
	public void showInfo() {
		System.out.println(clientName+"이름의 가진소년의 잔돈은"+money+" 입니다.");
	}
}

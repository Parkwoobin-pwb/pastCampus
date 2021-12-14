package ch02;

public class Taxi {
	int taxiNumber;
	int money;
	int passengerCount;
	
	public Taxi(int taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(money+" : 오늘번돈, "+passengerCount+":오늘태운 승객 카운드");
	}
}

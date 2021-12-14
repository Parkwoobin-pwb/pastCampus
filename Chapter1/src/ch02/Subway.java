package ch02;

public class Subway {
	int subwayNumber;
	int passengerCount;
	int money;
	
	public Subway(int busNumber) {
		this.subwayNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showBusInfo() {
		System.out.println(subwayNumber+"번의 승객수눈"+passengerCount+"그리고 수입은"+money+"원입니다.");
	}
}

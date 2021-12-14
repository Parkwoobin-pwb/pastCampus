package ch02;

public class TakeTransTest {

	public static void main(String[] args) {
		
		Student studentJ = new Student("james", 5000);
		Student sutndetT = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(1000);
		Bus bus400 = new Bus(4000);
		
		studentJ.takeBus(bus100);
		
		Subway greenSubway = new Subway(2);
		
		sutndetT.takeSubway(greenSubway);
		
		sutndetT.showInfo();
		studentJ.showInfo();
		
		bus100.showBusInfo();
		greenSubway.showBusInfo();
		

	}

}

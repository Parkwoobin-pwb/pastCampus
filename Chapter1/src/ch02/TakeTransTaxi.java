package ch02;

public class TakeTransTaxi {

	public static void main(String[] args) {
		Client client = new Client("우빈", 100000);
		
		Taxi taxi = new Taxi(234);
		
		client.take(taxi); 
		
		client.showInfo();
		
		taxi.showInfo();
		

	}

}

package ch04;

public class CarFactory {
	
	private static CarFactory instance = new CarFactory();
		
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	private CarFactory() {//private 생성자
		
	}
	
	private static int carNum = 1000;
	
	public Car  creatCar() {
		carNum++;
		Car car = new Car();
		car.setCarNum(carNum);
		return car;
		
		
	}
}

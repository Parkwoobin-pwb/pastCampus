package ch04;



public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory carFactotyTest = CarFactory.getInstance();
		
		Car woobinCar = carFactotyTest.creatCar();
		Car mingiCar = carFactotyTest.creatCar();
		
		System.out.println(woobinCar.getCarNum());
		System.out.println(mingiCar.getCarNum());

	}

}

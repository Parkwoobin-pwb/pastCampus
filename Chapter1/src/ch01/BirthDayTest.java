package ch01;

public class BirthDayTest {

	public static void main(String[] args) {
		
		BirthDay date = new BirthDay();
		System.out.println("실행하기전 불리언 값"+date.getIsValid());
		date.setYear(2019);
		date.setMonth(12);
		date.setDay(30);
		
		date.showDate();
		System.out.println(date.getIsValid());
	}
}

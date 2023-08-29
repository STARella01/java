package day09.encapsulations.goodcase;

public class TestMyDate {

	public static void main(String[] args) {
		MyDate myBirth = new MyDate();
		// myBirth.day = 31; 
		myBirth.setDay(32);
		System.out.println("My birth Day is"+myBirth.getDay());
	}

}

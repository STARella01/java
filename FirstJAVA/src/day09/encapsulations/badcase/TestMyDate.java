package day09.encapsulations.badcase;

public class TestMyDate {

	public static void main(String[] args) {
		// 잘못된 데이터 값 입력의 예시
		MyDate myBirth = new  MyDate();
		myBirth.day = 32;
		System.out.println("My birth day is "+myBirth.day);
		
		
		

	}

}

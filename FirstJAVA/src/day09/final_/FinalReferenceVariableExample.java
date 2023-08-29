package day09.final_;

public class FinalReferenceVariableExample {

	static final MyDate date= new MyDate(); // date 값을 가진 주소값을 가지고 있다.
	// MyDate date -> 어디로 가면 new date가 있는 주소 값을 가지고 있음
	
	public static void main(String[] args) {
		 // date = new MyDate(); -> 이미 위에서 상수 객체를 생성해서 새로운 객체로 변경 불가
		
		// 하지만 그 값을 불러서 사용하는 것은 가능함.
		date.year = 2024;
		System.out.println(date.toString());
	}

}

class MyDate{
	int year = 2023;
	int month = 1;
	int day = 1;
	
	public String toString() {
		return "["+year+"-"+month+"-"+day+"]";
	}
	
	public void doIt(final int a) {
		// a++; // Error 
	}
}

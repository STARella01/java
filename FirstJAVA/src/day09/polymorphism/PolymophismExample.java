package day09.polymorphism;

public class PolymophismExample {
	
	public static void main(String[] args) {
	// 다형성테스트
	Person p = new Student("홍학생", 17, "20230829","도술");
	p.walk(); // 부모 클래스인 Person에 있는 메서드
	p.study();  // p는 다형적 객체이므로 부모 클래스에 있는 메서드만 사용할 수 있음
	Student casting = (Student)p; 
	// study ()는 Student만 가진 메서드로 캐스팅을 통해서 변환 후 사용 가능
	casting.study();
	}
}

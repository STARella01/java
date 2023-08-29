package day09.polymorphism;

public class InstanceofExample {

	public static void main(String[] args) {
		Student s = new Student("홍학",17,"20230829","자바");
		System.out.println(s);
		Teacher t= new Teacher("홍샘",200,"자바 프로그램");
		System.out.println(t);
		Employee e = new Employee("홍직",30,"교무처");
		System.out.println(e);
	}
	
	// 함수 호출
	
	// 다형적 인자 별로 출력하는 메서드
	public static void printPersonInfo(Person p) {
		if(p instanceof Student) { // 들어오는 객체가 student와 같나요? 좌항객체가 우측객체와 같은지 확인
			System.out.println("*********** Student Info ************");
		}else if(p instanceof Teacher) {
			System.out.println("*********** Teacher Info ************");
		}else if(p instanceof Employee) {
			System.out.println("*********** Employee Info ************");
		}else {
			System.out.println("*********** Person Info ************");
		}
		System.out.println(p);
		System.out.println(p.getDetails());
		System.out.println("**********************************************");
	}

}

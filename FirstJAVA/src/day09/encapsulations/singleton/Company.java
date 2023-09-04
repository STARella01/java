package day09.encapsulations.singleton;

// DB데이터 베이스와 연관
// MVC 방식을 위해.
// 객체 생성 시 여러 개 만들어진 객체를 새로운 객체 생성하지 못하도록 클래스 내에서 처리 시키기 위한

public class Company {
	
	private String str;
	private static Company c = new Company(); 		// 1. 자기 자신 Company 객체 멤버 생성
	// static 정적변수는 프로그램 시작할 때 만들어짐. - 프로그램 종료 시 사라짐. - 한 번만 생성되면 그걸 가져다가 씀.
	
	// static 사용 이유 : 외부에서 값 받아와야 해서 
	// private - getter setter 설정해 줘라
	private Company() {										// 2. 생성자를 private으로 설정
		str = "company";
		System.out.println(str);
	}
	
	// 내가 반환값으로 줄 것이 static이기 때문에
	public static Company getCompany() { 				// 3. public static을 통해서 객체 전달
		return c;  // 객체가 하나만 생성되기 때문에 싱글톤이라고 한다.
	}

}

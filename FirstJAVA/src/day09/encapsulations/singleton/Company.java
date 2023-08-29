package day09.encapsulations.singleton;

public class Company {
	
	private String str;
	private static Company c = new Company(); 		// 1. 자기 자신 Company 개체 멤버 생성
	
	// static 사용 이유 : 외부에서 값 받아와야 해서 
	private Company() {										// 2. 생성자를 private으로 설정
		str = "company";
		System.out.println(str);
	}
		
	public static Company getCompany() { 				// 3. public static을 통해서 객체 전달
		return c;
	}
	
	

}

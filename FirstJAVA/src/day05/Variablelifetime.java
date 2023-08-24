package day05;

// 지역변수를 우선 시 한다.
public class Variablelifetime {
	
//	static int c ;
	int b = 8; // 멤버 변수 - 인스턴스 instance 변수
	
	public static void main(String[] args) { // 여기 이내에 선언된 변수들은 지역변수라고 한다.
		// 변수의 수명
		
		// {} 블럭 내부에서 선언된 변수 지역변수로 {}을 벗어나면 사라짐.
		// 변수가 살아있는 범위를 변수의 영역이라고 한다.(scope)이라고 부른다.
		// 변수의 영역만 겹치지 않는다면 같은 이름의 변수를 사용할 수 있다!
		int b = 5;
		System.out.println("main method의 b :"+b);
		// int c= 10;
//		 c = 10;
		
		Variablelifetime obj = new  Variablelifetime();
		System.out.println("class의 b :"+obj.b); // obj b는 별도의 영역 공간에서의 b
		
		if(true) {
			int a = 10; //지역 변수
			System.out.println(a);
			a = 7; // 지역변수 - 블럭 내에서만 선언됨
		}
//			a = 7; // 지역변수 - 블럭 내에서만 선언됨
		
		for(int i =0; i<10; i++) { // 내부의 i는 for문을 벗어나지 못한다.
			
		}
		int i = 10;
		
	} // 여기 이내에 선언된 변수들은 지역변수라고 한다. 
	

}

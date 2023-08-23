
public class MemberVariableExample {
	
	// 멤버 변수란? 클래스 내에서 사용하는 변수 의미(instance/인스턴스 변수- 객체화 변수)
	int a;  			// 멤버 변수 (인스턴스 변수, 속성, 필드라고 불린다.)
	static int b; 		// 멤버 변수 (static 붙으면서 클래스 변수라고 불린다.)

	public static void main(String[] args) {
		// 멤버 변수는 사용 전에 초기화 하지않아도 기본값으로 초기화 됨. static변수는 static변수만 부를 수 있다.
		//System.out.println(a); ->라고 작성할 경우 오류뜸 
		//System.out.println(b);
		System.out.println("b의 초기값 : "+b);
		new MemberVariableExample().test();
	}

	public void test() {
		//System.out.println(a);
		System.out.println("a의 초기값 : "+a);
	}
	
}

package day09.final_;

public class FinalLocalVariableExample {

	public int data = 100;
	
	public static void main(String[] args) {
		new FinalLocalVariableExample().doIt("홍길동");
		// 객체생성().메서도호출(); -> static은 그냥 사용하면 안되니까 자기 자신이라는 객체생성하고 메소드 호출해서 사용
		
		//new FinalLocalVariableExample().doIt("몰루");
	}
	
	public void doIt(final String name) {
		final int age = 38;
		class InnerLocal {
			public void innerDoIt() {
				System.out.println("외부 클래스의 멤버변수 data :"+data);
				System.out.println("외부 클래스의 파라미터 변수 name :"+name);
				System.out.println("외부 클래스의 지역변수 age :"+age);
			}
		}
		// 생성자객체.innerDoIt() -> 위에 지정한 애들을 실행
		new InnerLocal().innerDoIt();
	}

	

}

package day09.static_;

public class StaticInit {
	
	static { // static 변수 초기화 , 객체를 여러번 생성해도 '1번만' 실행됨!!!
		System.out.println("static initializer가 수행됨.");
	}// 생성자가 실행되기 전에 실행된다.
	
	public StaticInit() {
		System.out.println("Constructor 호출됨.");
	}
}

// static은 다른 값에도 영향을 미치기 때문에 초기화 해준다.
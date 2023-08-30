package day10.interface_;

/*
 * 		인터페이스 정리!	
 * 		- 단일 상속 문제점을 해결할 수 있다.
 * 		- 인터페이스 메서드는 추상 메서드이어야 함.
 * 		- 인터페이스의 변수는 자동으로 상수가 된다.
 * 		- 인터페이스 구현할 때는 implements
 * 		- 인터페이스를 여러 개 implements 할 수 있다. (구현)
 * 		- 인터페이스는 다른 인터페이스 여러 개를 extends 할 수 있다. (상속)
 * 		- ** 인터페이스는 기능의 명세를 위해서 사용한다. **
 */

public class InterfaceImpExample {

	public static void main(String[] args) {
		
		ToDo todo = new ToDo();
		IToDo3 itodo3 = todo; // 다형성이 적용됨.
		
		itodo3.m1();
		itodo3.m2();
		itodo3.m3();
	 // itodo3.m4(); // 이거 없음-  Error : itodo3 안에는 m4 정보가 없음 - 따라서 불러올 수 없음.
		
	// ITodo4를 Todo에 불러와서 선언해주면 생김. - 인터페이스에 갖다 집어 넣음.
		IToDo4 itodo4 = todo;
		itodo4.m4();

	}

}

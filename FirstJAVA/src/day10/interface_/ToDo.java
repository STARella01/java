package day10.interface_;

	// 인터페이스끼리 다중 상속이 가능
	// 가장 하위 인터페이스를 구현할 경우 상속관계에 있는 인터페이스들의 모든 메서드를 구현해야 함.

public class ToDo implements IToDo3, IToDo4 {

	// 상속 받은 내용까지 만들어서 구현해야 함.
	// 굳이 사용 안할 시에는 만들어놓고 정의 추가하지 않아도 문제 없음.
	// 인터페이스는 추상 클래스 보완하기 위해서 만들어 준다.
	@Override
	public void m1() { // 단독
		// TODO Auto-generated method stub
		System.out.println("m1( ) 구현");
	}

	@Override
	public void m2() { // 단독
		// TODO Auto-generated method stub
		System.out.println("m2( ) 구현");
	}

	@Override
	public void m4() { // 단독
		// TODO Auto-generated method stub
		System.out.println("m4( ) 구현");
	}

	@Override
	public void m3() { // 부모 모시는 애라서 제일 하위 개체
		// TODO Auto-generated method stub
		System.out.println("m3( ) 구현");
	}

}

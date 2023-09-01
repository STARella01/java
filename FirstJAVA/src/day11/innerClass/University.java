package day11.innerClass;

public class University {
	
	int num; // 멤버 변수 -> static은 여기 접근 불가함.
	static String name; // 
	
	// static 내부 클래스 사용 (정적 내부 클래스) static이 붙은 멤버와 동일하게 사용 가능.
	// 내부 클래스는 외부 클래스의 모든 멤버에 접근이 가능하나 static이 붙으면 static 멤버만 접근 가능
	// 접근 방식에 의해서 객체 생성 방법에서 차이가 생기게 됨.
	// static이 없는 멤버 내부 클래스는 외부 객체를 생성한 후에 내부 클래스에 접근이 가능함
	// static이 있는 경우에는 외부 클래스 객체 생성 없이 바로 호출이 가능.
	
	static class Student{ // 여기서 static 없으면 멤버 클래스 됨.
		
	}

}

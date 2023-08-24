package day06;

public class PenInstanceExample {

	public static void main(String[] args) {
		// 생성된 Pen 클래스의 객체 생성
		
		// 객체 생성 명령
		// ClassName instanceName = new Constructor(); //  Constructor - 생성자
		// 생성자는 클래스 이름으로 되어있다.
		Pen redPen = new Pen();
		redPen.color = "red";  // red pen에 대한 정의
		System.out.println(redPen);
		System.out.println(redPen.color);
		// 쓰기 function
		redPen.write();
		
		
		// attribute (속성-멤버변수), constructors(생성자), method(메서드)
		
		
		
		
		

	}

}

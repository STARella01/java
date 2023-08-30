package day10.interface_;

public class InterfaceMemberExample implements ISomething {

	@Override
	public void run() { // 반드시 재정의 해야함.
//		My_INT = 33; // 인터페이스에서 정의한 멤버 변수 - ISomething interface final 변수임 - 따라서 사용 불가
		System.out.println("run() :" +ISomething.A); // 이렇게 불러올 수는 있음
	}

	public static void main(String[] args) {
		System.out.println(ISomething.My_INT);   				// 22
		System.out.println(InterfaceMemberExample.My_INT);  // 22 
		
		ISomething is = new InterfaceMemberExample(); 		// ISomething에 정의되어 있기 때문에 가져와서 쓸 수 있는 것이다.
		is.run(); // run() :11
		
		InterfaceMemberExample im = new InterfaceMemberExample();
		im.run(); // run() :11
	}
	
}

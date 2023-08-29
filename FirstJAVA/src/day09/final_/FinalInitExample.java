package day09.final_;

public class FinalInitExample {

	// final 멤버 변수는 선언 시 (a), 초기화 시(b), 또는 기본 생성자 (c) 중에 하나에서 반드시 초기화 해야함.
	// 기본 생성자가 아닌 생성자에서는 파라미터를 통한 초기화 안됨.
	
	public static void main(String[] args) {
		FinalInit f = new FinalInit(30);
		System.out.println(f.a);
	}

}

class FinalInit{
	final int a;			 // a    
	//final int a = 10;    // a     1. 멤버변수 선언과 동시에 초기화 - 보통 사용하는 방법
	//{
	//	a =10; 			 // b     2. instance intializer 초기화
	//}
//	FinalInit( ) {			 // c	   3. 생성자에 의한 초기화
//		a = 10;			// 이 친구를 설정 안하면 오류뜨는거임..
//	}
	FinalInit(int a){
		this.a = a;  // 이것은 final 필드의 초기화가 아님.
	}
}


/*
 * 		[ final ]
 *  
 * 		- 클래스, 변수, 메서드에서 사용
 *  	- 클래스
 *  	> 상속 불가능, 인스턴스 생성 사용 
 *  	> String (대표적인 final 클래스임 대문자로 시작하잖아!!)
 *  	
 *  	- 변수
 *  	> 상수 정의
 *  	> 상수 정의 시에 static이 따라다님. 
 *  	> 로컬 클래스의 메서드에서 지역변수를 참조해야 하는 경우, 지역변수에 final을 붙여야 함.
 *  	
 *  	- 메서드 
 *  	> 메서드 붙은 경우 재정의 불가능하게 함 (Overriding X)
 *  
 *  
 * */


/*
 * 		[ final ]
 *  
 * 		- 클래스, 변수, 메서드에서 사용
 *  	- 클래스
 *  	> 상속 불가능, 인스턴스 생성 사용 
 *  	> String (대표적인 final 클래스임 대문자로 시작하잖아!!)
 *  	
 *  	- 변수
 *  	> 상수 정의
 *  	> 상수 정의 시에 static이 따라다님. 
 *  	> 로컬 클래스의 메서드에서 지역변수를 참조해야 하는 경우, 지역변수에 final을 붙여야 함.
 *  	
 *  	- 메서드 
 *  	> 메서드 붙은 경우 재정의 불가능하게 함 (Overriding X)
 *  
 *  
 * */

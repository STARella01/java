package day06;

import java.util.Scanner;

public class MethodExample {

	public static void main(String[] args) { //메소드
		// return 
		// - return문은 메소드 실행을 끝내고 결과값을 호출된 부분에 반환하는 문장 //caller //cally?
		// - return문만 단독으로 사용했을 때는 호출된 곳으로 제어만 넘어감.
		// 하지만 return 뒤에 연산식과 함께 사용되면 식의 결과 값과 제어가 함께 넘어감.
		// return문 다음에는 value를 넘긴다. 22
		
		// Method
		// - 메서드는 반복되는 코드 블록에 이름을 붙여 놓은 것.
		// - 메서드는 반복되는 코드를 줄여주고, 좀더 구조화된 코드를 만들어서 우리가 코드를 알아보기 쉽게 함.
		// - 객체지향 프로그래밍에서 메서드는 '객체가 가져야할 기능을 구현하기 위해서 만든다'라고 표현함
		// - 메서드 이름 뒤에는 반드시 ""()"" (소괄호)가 따른다.
		
		/*
		 * 메서드 형식(선언 방법)
		 * void main(String[] args) {}
		 * <반환유형>void <이름 메서드 식별자>main (매개 변수)(String[] args){
		 * 		기능 상세;
		 * }
		 * <반환유형> <이름 메서드 식별자> (매개 변수)
		 *  매개 변수는 거의 반드시 받아서 사용해야 한다. - 전달 인자
		 *  함수의 초기값은 인자값이다.
		 *  크기 비교 :  함수 > 메서드
		 * 
		 * 	메서드 구분, 매개 변수
		 * - 유형1: 매개 변수가 있고, 반환 값이 있는 경우 | 전달 인자(O) , 반환값 (O)
		 * - 유형2: 매개 변수가 있고, 반환 값이 없는 경우 | 전달 인자(O) , 반환값 (X)
		 * - 유형3: 매개 변수가 없고, 반환 값이 있는 경우 | 전달 인자(X) , 반환값 (O)
		 * - 유형4: 매개 변수가 없고, 반환 값이 없는 경우 | 전달 인자(X) , 반환값 (X)
		 * 
		 * 	매개 변수(Parameter)
		 * - 매개 변수는 매서드가 실행될 때에 필요한 데이터를 외부로부터 받기 위해서 사용함.
		 * - 매개 변수도 변수의 일종으로 데이터 타입과 함께 선언해서 사용해야 하고, 초기화 하지 않는다.
		 * - 매개 변수를 여러 개 선언할 수 있고, 메서드가 외부로부터 받을 데이터가 없다면 선언하지 않아도 됨.
		 *  그리고, 매개 변수가 없다면 반환 유형처럼 void를 사용하지 않고, 소괄호 ()안을 비워둔다. - 생략 가능하단 얘기
		 *  
		 *  반환 유형 (Return Type)
		 *  - 메서드가 실행한 후에 메서드를 호출한 곳에 반환하는 값을 전달하는 데이터 타입.
		 *  - 메서드는 반환 값이 있을 수도 있고, 없을 수도 있는데 없는 경우에는 반환 유형에 void 사용한다. - 생략 불가함.
		 *  -  반환 값이 있는 메서드를 호출할 때에는 해당 반환 유형에 맞는 변수에 반환값을 지정해야 함.
		 *  - 메서드 실행의 결과값을 반환할 때 "Return"키워드를 사용한다.
		 * */
		
		//
		
		print();
		int num1 = input();
		int num2 = input();
		
		int result = add(num1, num2);
		showResult(result);
		
	}
	
		static void print() { //	반환값이 없는 경우, 매개 변수도 없는 경우
			System.out.println("정수 두개 입력하세요!");
		} 
	
		static int input() { //	반환값이 있는 경우, 매개 변수는 없는 경우
			Scanner scan = new Scanner(System.in);
			System.out.println("정수 입력 > ");
			int num = scan.nextInt();
			return num;
		} 	
		
		static int add(int num1, int num2) { //	반환값이 있는 경우, 매개 변수도 있는 경우
			int result = num1 + num2;
			System.out.println("답 :  "+num1 + num2);
			return result;
		}
		
		static void showResult(int result) {  // 반환값이 있는 경우, 매개 변수는 없는 경우
			System.out.println();
		}

}

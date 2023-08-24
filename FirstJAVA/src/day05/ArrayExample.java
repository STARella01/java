package day05;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		// 배열
		// 같은 타입의 변수를 한 번에 여러 개 선언하는 방법
		
		// 배열의 선언 방법
		// 1. 타입[] 변수명 = new 타입명[배열의 길이];
		// 2. 타입[] 변수명 = {데이터};
		// 3. 타입[] 변수명 = new 타입명[] {데이터};
		
		int[ ] number = new int[10];
		boolean [] win = { true, false, false, false, true };
		String[ ] welcome = new String[ ] {
				"오늘 날씨는 흐르고 비입니다.",
				"배고파요.. 저도..",
				"배고파요.. 저도2222.."
		};
		System.out.println(welcome[0]);
		System.out.println(welcome[1]);
		System.out.println(welcome[2]); 
		System.out.println("welcome 배열의 길이 :" +welcome.length);  // 배열의 길이
		
		for(int i = 0; i < welcome.length; i++) {
			System.out.println(welcome[i]);
		}
		
		// (Enchanced) 강화된 For문 (***) 좀 더 간결하게 할 수 있음
		System.out.println("===강화된 for문을 이용한 반복===");
		for(String str : welcome) {//  for (동종에 대한 변수 int면 int float이면 float )
			System.out.println(str);
		}
			
		// 
		for(int i= 0; i<win.length; i++) {
			if(win[i]) {
				System.out.println(i+1 + "번째 전적 : 승리");
			}else{
				System.out.println(i+1 + "번째 전적 : 패배");
			}
		}
		
		// 배열의 내용 출력 (Arrays.toString() 메서드를 사용한다.)
		System.out.println(Arrays.toString(win));
		System.out.println(Arrays.toString(number));
		System.out.println(Arrays.toString(welcome));
		
		// 배열은 선언 시 자동적으로 기본값으로 초기화
		// 정수 : 0, 실수는: 0.0, boolean: false, 참조형: null, 
		String[] byeMessage = new String[10];
		System.out.println(Arrays.toString(byeMessage));
		
		//  배열의 복사
		//  배열의 얕은 복사 (Swallow copy)- 주소값 복사 와 깊은 복사 (Deep Copy) - 실제값 복사
		
		String [] byeMessage2 = new String[] {"good-bye", "bye bye", "see you" };
		
		// Swallow copy 얕은 복사 - byeMessage 변수에 byeMessage2의 주소값을 대입
//		byeMessage = byeMessage2;
//		byeMessage2[1] = "hello bye bye"; // byeMessage2 어레이의 2번째 메세지를 변경하겠다. - 기존의 메세지와 완전히 끊어지지 않고 서로 연결되어 있음.
//		System.out.println(Arrays.toString(byeMessage));
		
		//깊은 복사 (deep copy)
		// System.arraycopy();
		// src : 원본 배열의 이름
		// srcPos : 복사를 시작할 원본의 위치
		// dest : 붙여넣기 할 배열의 이름
		// destPos : 붙여넣기를 시작할 위치를 설정
		// length : 복사를 몇개나 할 것인지 결정.
//		System.arraycopy(byeMessage2, 1, byeMessage, 5, 1);
//		
//		System.out.println("bye1 : " + Arrays.toString(byeMessage));
//		System.out.println("bye2 : " + Arrays.toString(byeMessage2));
//		
//		byeMessage[0] = "GGGGOod bye";
//		System.out.println("bye1 : " + Arrays.toString(byeMessage));
//		System.out.println("bye2 : " + Arrays.toString(byeMessage2));
		
		// 깊은 복사를 통해서
		// byeMessage에 byeMessage2에 있는 배열의 값을 복사하세요. 모두다 (3개 다 복사 )
		// System.arraycopy(byeMessage2, 0, byeMessage, 0, 3); // length를 모르면  byeMessage2.length 붙이면 됨
		System.arraycopy(byeMessage2, 0, byeMessage, 0, byeMessage2.length); // length를 모르면  byeMessage2.length 붙이면 됨
		System.out.println("bye1 : " + Arrays.toString(byeMessage));
		
		// Q. 주소값이랑 실제값이랑 뭐가 다른건지? 결국 똑같이 값 가져와서 쓰는거 아닌가?
		
		
	}

}

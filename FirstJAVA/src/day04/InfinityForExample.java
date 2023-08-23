package day04;

import java.util.Scanner;

public class InfinityForExample {

	public static void main(String[] args) {
		// for의 무한 루프
		// 조건이 참이면 무한루프!!
		// for(int i = 0 ; true; i++) {
		//	System.out.println(i);
		// } 

		
		//루프 (반복문)에서 빠져나올 코드를 만들어 놓아햐 한다.
		// 조건식을 넣지 않으면 무한루프에 걸린다.
		//for(;;) { 
		//	System.out.println('a');
		//}
		
		// 루프 탈출문
		// break 문
		// 반복문 내부에서 사용할 수 있음.
		// 반복문에서 break를 만나면 반복문을 종료 - 탈출
		
		// 다중 반복문 내부에 속해 있더라도 break를 만나면 해당 break가 속한 반복문 하나만 탈출
//		for(int i = 0; true; i++){
//			System.out.println(i);
//			for(int j = 0; true; j++) {
//				System.out.println("j반복");
//				if(j == 58) {
//				break; 
//				}
//			}
//		}
		
		

		System.out.println("루프 탈출");
		// 무한 반복 활용 예
		String answer = "자동차"; //내가 원하는 답은 자동차다 라고 설정
		Scanner scan = new Scanner(System.in);
		
//		for(;;) {
//			System.out.print(">");
//			String attempt = scan.nextLine(); // 값을 받아서 String으로 저장. 
//			if(answer.equals(attempt)) {
//				System.out.println("정답");  //문자열 비교는 "=="쓰지 않음. equals()메서드 사용!! // attempt 정답이 나올 경우 출력
//				break; // 반복 구문을 정지 시켜라!
//			}
//		}
		
		
		String attempt = "";
		for(;!attempt.contentEquals(answer);){  //니가 무자열에서 말한 내용은 attempt와 같다면
			System.out.print("> ");
			attempt = scan.nextLine();
		}
		System.out.println("정답");
		
		
		
		
	}//

}

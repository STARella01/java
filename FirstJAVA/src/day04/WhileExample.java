package day04;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		// while 문
		// for문 보다 자유도가 높은 반복문
		// why? for문은 (시작값; 조건; 증가값) 다 넣어야 함.
		// 하지만 while은 조건만으로 반복 처리!
		
		/*  While 문법 형식
		 *	while(condition){
		 *		조건이 참일 대 실행할 문자
		 * }
		 * */
		
		
		
		
		
		
		// 증가값 위치에 따라서 결과에 차이가 생김!
//		int i = 0 ; //시작값  ~~
//		
//		while( i < 10) { //조건
//		// 	i++; // 여기서 시작되면 1부터 10까지 노출됨 // 증가값
//			System.out.println(i);
//			i++; // 여기서 시작되면 0부터 9까지 노출됨 // 증가값
//		}
//		
		
		
		// while의 무한 루프 
//		while (true) {
//			System.out.println(i += 10000);
//			if(i % 20000 == 0)
//			continue;
//			if( i < 0)
//			break;
//		}
		// -2147477286 숫자 나오면서 멈춤. -> 수가 음수로 변해서 멈춤
		
		
		
		
		
		
		// do ~ while 구문 : 거의 안 씀..
		// 반복할 때 무조건 한 번 이상 실행해야 하는 경우
		int i = 0;
		
		Scanner scan = new Scanner(System.in); 

//		while((i= scan.nextInt()) != 0) {
//			System.out.println("i가 0이 아닙니다.");
//		}
	
		do { // 조건이 안 맏아도 실행하고 조건이 안맞으면 다음꺼는 멈춤
			System.out.print("> ");
			i = scan.nextInt();
			System.out.println("i가 0이어도 일단 한 번 실행합니다.");
		}while(i!=0);
		
	}

}

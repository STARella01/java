package day06.quiz;

import java.util.Scanner;

public class day06Quiz {

	public static void main(String[] args) {
		// 1. Scanner생성하세요. (크기가 100인 배열 선언)
		// 2. While문(무한 루프) 에서 먹고 싶은 음식을 입력 받아 배열에 저장하세요.
		// 3. “그만” 을 입력 받으면 탈출 합니다.
		// 4. For문을 통해 배열에 저장되어 있는 음식을 모두 출력 하세요.
		
		Scanner scan = new Scanner (System.in); // scanner 생성
		String foodmenu = scan.next();
		
		int[] array = new int[100]; //크기가 100인 배열
		
		String stop1 = "그만"; // 탈출 조건
		
		

		int gop  = 0;
		while(gop <= 9) { //곱은 9일 때까지만 사용한다.
			
			int dan = 2; // while문 밖으로 빠지면 안됨.
			
			while (dan <= 9) { // 다음 반복 시에 원래 2로 돌아와야 한다. 그래야 2단부터 9단까지 감.
				if(gop == 0) {
					System.out.print(dan + "단\t"); // 0일 때 단을 표시하는 것
				}else {
					System.out.printf("%dx%d=%d\t", dan, gop, dan*gop); //단과 곱을 곱한 것
				}
				dan ++; //단의 증가
			}
			System.out.println();
			gop++; // 곱의 증가
		}
		
		
		
		
		
		
		
		

		}

}

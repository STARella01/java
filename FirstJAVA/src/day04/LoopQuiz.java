package day04;

public class LoopQuiz {

	public static void main(String[] args) {
		// 1. 소수(Prime Number) 구하기 
		// 소수는 1과 자기 자기 자신만으로 나누어지는 수를 말함. 내가 유일하다.
		// 조건문과 반복문을 사용하여 100이하의 소수를 출력해 보세요.
		// for문 안에 for문 사용 - 무식한 방법?
		// ex ) 3은 소수 1과 자신'만'으로 나눠짐  2도 그렇고 4는 아님 4와 2로 나눠지니깐
		
		// 2. 단어 거꾸로 출력하기 (reverse 출력) - 값 저장하지 말고 화면에 출력만
		// 자바의 Scanner 객체를 이용하여 콘솔에 데이터를 입력.
		// 입력된 데이터를 for문을 사용하여 거꾸로(reverse) 출력하세요.
		// (String.charAt(Index)를 사용)
		
		// 3. 로또 번호 추출하기
		// 앞서 배운 난수를 활용하여, 중복되는 번호 없이 1~45까지의 숫자 중 
		// 6개의 숫자를 랜덤 추출하고, 콘솔에 출력하라.
		// 힌트 : (while문에 for)
		
		
		
		// 1번 풀이
		System.out.println("===== Prime Numeber =====");
		int cnt;
		for (int i = 2; i <=100; i++ ){
			cnt = 0; // 배수 여부를 확인
			for(int j=1; j<=i; j++) { 
				if(i%j == 0) {
					cnt++;
				}
			}
			if(cnt == 2) {
				System.out.println(i+ "");
			}
		}
			

		
		// 3번
//		int lotto = (int)(Math.random() * 45);
//		
//		while(lotto <= 6) {
//			for (int i = 0; i < 6; ) {
//				System.out.println("랜덤번호 : "+ lotto);
//			}
//		}
		/*
		 *  print() : 전달된 값을 출력
		 *  printf() : 문자열의 포맷문자를 이용하여 결과를 출력
		 *  println() : 문자열 값에 마지막에 \n 추가됨. 즉, 줄바꿈 처리함.
		 */
		
		// 2번 
		
		
		// 3번  웹서칭
		int lotto[] = new int [6];
		
     	  	// 번호 생성
		for(int i=0; i<6; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1; // 난수 
            
       		  	 // 중복 번호 제거
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.print("로또 번호: ");
		
	  	 // 번호 출력
		for(int i=0; i<6; i++) {
			System.out.print(lotto[i] + " ");
		}	
	
		
		
		
		
		System.out.println();

		float f = 1.1F;
		double d = 1.1;
		System.out.printf("%f, %f", f, d); //%f = 실수형 표현

		System.out.println();
		
		//
		boolean one = false; //true or false
		//boolean two = False; //대소문자를 구분하기 때문에 F는 X
		//boolean three = "false";//문자도 X
		//boolean four = 1; // 1 = true
		System.out.println(one);
		
		
		System.out.println();
		
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < i; j++){
				System.out.print(i + " " + j + ", ");
			}
		}
		
		
		 

		
		
	}

}

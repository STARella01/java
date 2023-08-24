package day04;

import java.util.Scanner;

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
		System.out.println("===== Prime Number =====");
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
			
		
		// 2번 풀이
		System.out.println("===== 거꾸로 출력하기 =====");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine(); // HELLO
		
		//String reverse = ""; 
		
		for(int i = str.length(); i>0; i--) {
			//reverse +=str.charAt(i-1);
			System.out.println(str.charAt(i-1));
		} 
		//System.out.println("거꾸로 문자열 :" +reverse);
		scan.close();
		// 이렇게 하면 역순으로 출력됨
		
		
//		for(int i =0; i < str.length(); i++) {
//			System.out.println(str.charAt(i));
//			
//		}
		
		
		//3번 풀이
		System.out.println("===== 로또 번호 추출 =====");
		int[] lotto2 = {0,0,0,0,0,0};
		
		int index = 0;
		while(true){ // 무한한 반복을 위해 true값 설정
			//랜덤값 생성
			int rand = (int)(Math.random()*45) + 1;  // 1부터 45까지 수 발생 시키기
			int i = 0; // 시작값 밖으로 뺀다 - 인덱스와 비교하기 위해서 밖으로 뺐음.
			for( i = 0; i<index; i++) {
				if(rand == lotto2[i]) { // 추첨된 번호가 중복됨
					break; // for에서 걸리는 break 
				}
			}
			if(index == i) { //만약 인덱스와 i가 같아진다면  - 추첨된 번호에 있지 않음
				lotto2[index++] = rand; // 인덱스는 들어가있는 숫자 순번 먹이기 위해 사용
			}
			if(index > 5) // 생성된 값의 개수가 0-5보다 작은가?에 대한 체크 - 6개 추첨 끝
				break;
		}
		// 결과 출력
		for(int i = 0; i<lotto2.length; i++) {
			System.out.println(lotto2[i]+ "\t");
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
	
		
		
	
		
	}

}

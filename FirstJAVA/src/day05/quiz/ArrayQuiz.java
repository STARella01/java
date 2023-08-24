package day05.quiz;

import java.util.Arrays;

public class ArrayQuiz {

	public static void main(String[] args) {
		//  1. 1,000개 짜리 int형 배열을 생성한 뒤 모든 값을 1 - 100 사이의 랜덤 숫자로 채워보세요.
//		int[ ] number = new int[1000];
//		int rand = (int)(Math.random()*100) + 1;
//		
//		for(int i = 100; i < number.length; i++) {
//			System.out.println(number[i]);
//		}
		
		// 1번 풀이
		int[ ] num = new int[1000];
		for(int i = 0; i < 1000; i++) {			
			num[i] = (int)(Math.random()*100) + 1;
		}
		System.out.println(Arrays.toString(num));
		System.out.println(num.length);
		
		// 2. 1,000개의 랜덤 숫자들 중 각 숫자가 몇 번씩 나왔는지 세어 출력헤 보세요.
		
		// 2번 풀이
		int[ ] cnt = new int[100];
		for(int j = 1;  j <= 100; j++) {	// 1- 100의 나온 횟수를 세기 위해		
			for(int i = 0; i < num.length; i++) {	 // 전체 데이터(1- 1000)에서 1 - 100 사이의 값을 찾기 위해
				if(j ==  num[i]) { 
					cnt[j-1]++;  // 카운트를 세기 위한 1000숫자를 세기 위해 늘려간다.  1000개의 데이터 중에 처음부터 찾아보겠다는 내용
				}
			}
		}
		// cnt의 개수를 점검하겠다.
		int check = 0; // 검증 - '전체'의 저장값의 개수 (전체 데이터)
		for (int i = 0; i< cnt.length; i++) {
			System.out.println(i+1+"이 나온 횟수 :" + cnt[i]); 
			check += cnt[i];
		}
		System.out.println(check); // 결과값 1000
		
		
		
//		for(int i = 0; i < 10; i++){
//			if(i % 2 == 0)
//				continue;
//			System.out.println(i);
//		} // Code will print all odd numbers between 0 to 10 = 1,3,5,7,9
		
		


	}

}

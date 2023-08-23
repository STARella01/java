package day03;

public class ForExample {

	public static void main(String[] args) {
		// 반복문(loop) : for, while, do ~ while
		// for문 : 횟차가 정해진 경우에 사용
		/*
		 *  for(초기값; condition; 증가값){
		 *  	조건(condition)이 참인 경우 반복할 문장
		 *  }
		 * */
		
		// for문의 기본
		// 초기값은 for문에 사용할 변수의 초기 값을 의미함
		for (int i = 1; i <= 100; i++) // 조건에 부합할 경우 i값을 ++ 즉,1씩 늘려간다.
			System.out.println("i의 값 :"+i);
		
		// 초기값과 증가값의 위치는 변경이 가능하다.(단 보기 좋지는 않음)
		int i = 1;
		for(;i <= 100;) {
			// 반복구문 내에서 증감
			System.out.println(i++);
			
			// System.out.println("i의 값 :" i);
			// i++; 
		}
		
		
		// 예제1 for문을 사용하여 1부터 100까지 숫자들의 합
		int sum = 0;
		for(i=1;i <=10; i++) {
			System.out.println(i);
			sum += i; // sum + i;
		}
		System.out.println("합은 :" + sum);
		//총합을 구할 때 사용하는 패턴
		
		// 예제2 for문 사용하여 1부터 100사이의 홀수만 더한 값을 출력
		int sum2 = 0;
		for(i=1;i <=100; i++ ) {
			if(i%2 == 1){sum += i;}
		}
		System.out.println("합은 :" + sum2);
	

	}//

}

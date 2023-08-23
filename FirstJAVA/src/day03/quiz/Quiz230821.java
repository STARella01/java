package day03.quiz;

public class Quiz230821 {

	public static void main(String[] args) {
		
		// for문을 이용해서 
		// 1. 100부터 1까지 순서대로 출력해 보세요.
		// 2. 1 ~ 200 사이의 수 중에서 (2 또는 3의 배수)가 아닌 수들의 총 합을 구해보세요.
		// 3. 1 + (1+2) + (1+2+3) + (1+2+3+4) + ..... + (1+2+3+...10)의 결과를 구해보세요.   for문 돌리고 합 구하기
		// 3-1. 위의 수식을 콘솔에 그대로 출력해 보세요.
		
		
		// 1. 100부터 1까지 순서대로 출력해 보세요.
		for(int i = 100; i  > 0; i--) {
		System.out.println(i+" ");
		}
		
		
		// 2. 1 ~ 200 사이의 수 중에서 (2 또는 3의 배수)가 아닌 수들의 총 합을 구해보세요.
		int sum = 0; // 지역변수
		for(int i = 1; i <= 200; i++) {
			if(i%2==0 || i%3==0){
				sum += i;
			}
			
			// 다른 방식
			// if(i%2 != 0 && i%3 !=0) sum += i
		}
		System.out.println("\n"+sum);
		
		
		// 3. 1 + (1+2) + (1+2+3) + (1+2+3+4) + ..... + (1+2+3+...10)의 결과를 구해보세요.   for문 돌리고 합 구하기
		sum = 0; // 초기화
		int sum2 = 0;
		for (int i = 1; i <= 10; i++) { //10이 될 때까지 반복할 것이다.
			sum = i; 
			sum2 += sum; // sum2에 sum을 집어넣는다.
		}
		System.out.println("반복문 하나로 푼 결과 :" +sum2);
		
		sum = 0; // 초기화
		for(int i = 1; i <=10; i++){
			if(i!=1)  System.out.println(" +( ");
			// 소괄호 안에 있는 더하기 부분	
			for(int j = 1; j <=i; j++) {
				sum +=j;
				System.out.print(j);
				if(j !=1)  System.out.println(" + "); //끝
			}
			if(i!=1)System.out.println(" ) ");
		}
		System.out.println("반복문 두 개를 사용하여 푼 결과 :" + sum);

	}
	
	

	
	
	
	
	
	
}

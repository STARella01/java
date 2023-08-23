package day04;

public class continueExample {

	public static void main(String[] args) {
		// continue
		// 반복문 내에서 사용할 수 있음.
		// 반복문에서 continue를 만나면 continue 아래의 내용을 실행X
		// 바로 다음 번 회차로 넘어감..
		
		// continue로 짝수만 출력하기..
		for(int i = 0; i<100; i++) {
			if(i%2 ==1 || i == 0) //0은 짝수도 홀수도 아닌 0이다.
				continue; // 다음회차로 넘김..
			System.out.println(i);
		}
		
		
		// Q. continue 사용하여 5의 배수만 출력하기
		System.out.println("- 5의 배수만 출력 -");
		for(int i = 0; i<100; i++) {
			if(i%5 !=0 || i == 0) //0은 짝수도 홀수도 아닌 0이다.  //100을 5씩 나누니까 %5 
				continue; // 다음회차로 넘김..
			System.out.println(i);
		}
		
		

	}

}

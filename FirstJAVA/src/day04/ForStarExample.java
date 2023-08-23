package day04;

public class ForStarExample {

	public static void main(String[] args) {
		// for문을 이용
		
		// 1.  * ** *** **** ***** (왼쪽 정렬, 순차적) // 제일 먼저 찍히는 것이 상위 for문
		int dan = 5; //단의 개수
		for(int i= 0; i < dan; i++ ){
			for(int j = 0; j< i+1;  j++){ //j < i+1;
				System.out.print("*"); 	
			}
			System.out.println(); //줄바꿈
		}
		
		System.out.println(); //문제와 상관없는 줄바꿈 
		
		
		// 2.  ***** **** *** ** * (왼쪽 정렬, 역순)
		for(int i= 0; i < dan; i++ ){ // i가 dan2인 5보다 커질 때까지 i에 1씩 더해준다. 0 1 2 3 4 
			for(int j = 0; j < dan-i;  j++){ // 위에서 0인 i가 dan5까지 가기 위해서 5가 될때까지 +1씩 해준 값을 가져와서 0인 j가 5가된 i와 커질 때까지 j에 1씩 더해준다. 
				System.out.print("*"); // 그리고 이 for문의 계산식을 적용한 *표시를 프린트 한다.
			}
			System.out.println(""); //줄바꿈을 위해서 선언한다.
		}
		
		System.out.println(); //문제와 상관없는 줄바꿈 
		
		
		// 3. * ** *** **** *****  (오룬쪽 정렬, 순차적)
		for(int i= 0; i < dan; i++ ){ // i를 단 만큼 더해준다.  //01234
			// 공백찍기
			for(int j = 0; j < dan-i-1; j++){ // 4,3,2,1,0 // dan - i -1 =>
				System.out.print(" "); // 공백 	
			}
			//별찍기
			for(int j = 0; j < i+1; j++){ // 0,1,2,3,4
				System.out.print("*");// 별 	
			}
			System.out.println(); //줄바꿈
		}
		
		System.out.println(); //문제와 상관없는 줄바꿈 
		
		
		// 4. ***** **** *** ** * (오른쪽 정렬, 역순)
		for(int i= 0; i < dan; i++ ){  // i가 dan보다  작은 단위가 될 때까지 i에 1씩 
			// 공백찍기
			for(int j = 0; j < i; j++){ // i = 0
				System.out.print(" "); // 공백 	
			}
			//별찍기
			for(int j = 0; j < dan-i;  j++){ // 
				System.out.print("*");// 별 	
			}
			System.out.println(); //줄바꿈
		}
 		

	}//

}

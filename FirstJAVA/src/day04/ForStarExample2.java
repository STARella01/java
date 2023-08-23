package day04;

public class ForStarExample2 {

	public static void main(String[] args) {
		// 피라미드 찍기		
		System.out.println("별 피라미드 테스트");
		
		
		// 정방향 피라미드 풀이
		int dan = 5;
		
		for(int i=0; i<dan; i++) {
			for(int j=0; j<dan-i-1; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		// 역방향 피라미드 풀이  -
		for(int i = 0; i<dan-1; i++){  // 0,1,2,3
			//공백
			for(int j=0; j <i+1; j++){ // i+1 => 1,2,3,4 
				System.out.print(" ");
			}
			//별
			for(int j=0; j<2*(dan-i-1)-1; j++){ // 2*(dan-i-1) => 7,5,3,1
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
				
}
	


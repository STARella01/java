package day04;

public class WhileQuiz {

	public static void main(String[] args) {
		// while 문을 이용하여
		// 구구단을 다음과 같이 세로로 출력합니다. (2단 부터 9단 까지)
		
		//2단
		// 2x1 = 2
		// 2x2 = 4
		// 2x3 = 6
		// ...
		
		
		// 2단
//		int i = 2;
//		int y = 1;
//		
//		while (i < 10; x++) {
//			System.out.println(x +"단 출력");
//			while( y < 10; y++) {
//				System.out.println(x+"x"+y+"="+(x*y));
//			}
//			System.out.println(); //줄바꿈
//		}
		
		
		// 
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
		
		
//		while( i < 10) { //조건
//		// 	i++; // 여기서 시작되면 1부터 10까지 노출됨 // 증가값
//			System.out.println(i);
//			i++; // 여기서 시작되면 0부터 9까지 노출됨 // 증가값
//		}
		
		// 예제1) 구구단 출력하기 
		// 2단 - 9단까지, 각 단마다 x1 - x9까지 
//		for (int x=2; x < 10;x++) {
//			System.out.println(x +"단 출력");
//			for(int y=1; y < 10;y++) {
//				System.out.println(x+"x"+y+"="+(x*y));
//			}
//			System.out.println(); //줄바꿈
//		}
		
		
		

	
		
	}

}

package day03;

public class InnerForExample {

	public static void main(String[] args) {
			// 이중(다중) for문 
			for (int i = 0 ; i < 10; i++) {
				 System.out.println("============바깥족 반복문" + i);	
				 
				 for(int j = 0; j < 10; j++) {
					 System.out.println("-----------안쪽 반복문" + i + "-" + j);
					 
					 //3중으로 하려면 여기에 또 추가
					 for (int k = 0; k < 2; k++) {
						 System.out.println("+++ 제일 안쪽 반복문" + i + "-" + j + "-" + "k");
					 }
				 }
			}
			
		// 예쩨1 for문을 이용하여 구구단 출력하기
		// 2단 - 9단까지 , 각 단마다 x1 - x9까지

			
			//
			for (int a = 0 ; a < 9; a++) {
				 System.out.println("1단" +  a);	
				 
				 for(int b = 0; b < 10; b++) {
					 System.out.println("2단" + b);
					 
					 for (int c = 0; c < 2; c++) {
						 System.out.println("3단" + b);
					 }
				 }
			}
			
			
			//풀이
			for (int x=2; x < 10;x++) {
				System.out.println(x + "단 출력");
				for(int y=1; y < 10;y++) {
					System.out.println(x+"x"+y+"="+(x*y));
				}
				System.out.println(); // 줄바꿈
			}
			

			
			
			// 1. 
			for (int l = 0; l <= 100; l++) {
				System.out.println(l); 
			}
			
			// 2.
			for (int f = 0; f <= 200; f++) {
				System.out.println(f); 
			}
		}
	
	
		

	
	
	

}

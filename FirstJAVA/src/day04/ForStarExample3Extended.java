package day04;


import java.util.Scanner;

public class ForStarExample3Extended {

	public static void main(String[] args) {
	
		// *로 라인만들고 안에 $로 채우기
		Scanner scan = new Scanner(System.in); // scan 추가
		
		System.out.print("줄 수를 입력하세요!"); // scan 추가
		int dan = scan.nextInt();  //단
		// int dan = 9;  //단
		int sp = dan/2; // 여백
		int star = 1; // 별
		boolean flag = true; // 참 거짓 확인위해 선언
		
		for(int i=0; i<dan; i++) {
			for(int j=0; j<sp; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<star; j++) {
				System.out.print("*");
			}
			System.out.println("");
			
			if(i==(dan/2)) flag = false; //
			// boolean 알고리즘 algorythm 토글식으로 조건에 맞게 켰다 껐다 조건식 변경
			if(flag) {
				sp -= 1; star += 2;
			}else {
				sp += 1; star -= 2;
			}
			scan.close();
		}
		
		//줄수 입력해야 함. -> 9
		
		
		//        *
		//      * $ *
		//	   * $$$ *
		//    * $$$$$ *
		// 	 * $$$$$$$ *
		//  * $$$$$$$$$ *
		//   * $$$$$$$ *
		//    * $$$$$ *
		//	   * $$$ *
		//      * $ *
		//        *
		
	}
	

}

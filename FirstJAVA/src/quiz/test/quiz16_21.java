package quiz.test;

import java.util.Scanner;

public class quiz16_21 {
	
	
	public static void main(String[] args) {
//		1. Scanner생성하세요. (크기가 100인 배열 선언)
//		2. While문(무한 루프) 에서 먹고 싶은 음식을 입력 받아 배열에 저장하세요.
//		3. “그만” 을 입력 받으면 탈출 합니다.
//		4. For문을 통해 배열에 저장되어 있는 음식을 모두 출력 하세요.
		Scanner scan = new Scanner(System.in);
		
		// 
		while(true) { 
			System.out.println("----- 먹고싶은 음식을 입력하세요!! -----");
			System.out.println("메뉴 입력 :");
			String foodmenu = scan.next();
			String stop1 = "그만";
			
			for(int i = 0; i < foodmenu.length(); i++){
		        if(foodmenu.equals(stop1)) {
		        	System.out.println(" 입력 종료 ");
		        	System.out.print(foodmenu);
		        	break;
		        }else {
		        	System.out.println("");
		        	
		        }
			}
		}
		
		
		
		
		
		
		
		
	}

}

package day05.quiz;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// 대문자가 입력된다면 소문자로 출력하고,
		// 소문자가 입력된다면 대문자로 출력하는 프로그램을 작성해 보세요.
		
		//uppercase
		//lowcase
		//reverse
		
		Scanner scan = new Scanner(System.in);
		System.out.println("> ");
		char ch = scan.nextLine().charAt(0); //문자 입력 .charAt( )
		
		//charAt() 사용하는 이유 
		if(ch >= 'A' && ch <= 'Z') {
			ch = (char)(ch - 'A' + 'a'); // A=66,  B=65 a-b=1 아스키코드
			
		}else if(ch >= 'a' && ch<='z') {
			ch = (char)(ch - 'a' + 'A');
		}
		
		System.out.println(ch);
		
		// String,toUpperCase() : 문자열을 대문자 문자열로 변경
		// String.toLowerCase() : 문자열을 소문자 문자열로 변경
		
		System.out.println("Hello, World!!".toUpperCase()); //  HELLO, WORLD!! 로 출력된다.
		System.out.println("Hello, World!!".toLowerCase()); //  hello, world!! 로 출력된다.
		
		
		
		// 커피의 가격은 2,000원, 10개 이상 구매하면 초과분에 대해서
		// 커피는 1,500원을 받는다.
		// 커피의 개수를 입력받고, 총 가격이 얼마인지 계산하여 출력하는
		// 프로그램을 만들어보세요.
		
		// 2번 풀이
		System.out.println("커피값 계산 프로그램");
		System.out.println(" > ");
		//Scanner scan = new Scanner(System.in); // 상단에 스캐너 있으니까 주석처리
		
		int qty = scan.nextInt(); // 커피는 몇 잔?
		int price = 0; // 커피가격
		int normal_price = 2000;
		int discount_price = 1500;
		
		
		// if case를 사용함
//		if(qty > 10) {
//			price += (10 * normal_price ) + (qty -10) *  discount_price;
//		}else {
//			price += qty * normal_price;
//		}
		System.out.println("커피 가격 : "+price+"입니다.");
		
		//switch case를 사용함
		swtich (qty  / 10) {
			case 0: 	//10잔 미만
				price += qty * normal_price;
				break;
			default: // 10잔 이상
				price += (10 * normal_price ) + (qty -10) *  discount_price;
				break;
		};
		
		
		
		
		
		
		
		// 내가 구현한 로직
		// =>
		// 로직 
		// 커피 개수 입력하는 것 추가
		// 커피 가격 설정
		// sum 더하기 추가
		// 커피 총 개수 구하기
		// 커피 10잔 이상일 경우 500원씩 할인
		
//		int coffee = 2000;
//		int coffeecnt = 0;
//		int sum = 0;
//		int num = scan.nextInt(); // 스캔하는 부분
//		
//		for(int i = 0; i <= coffee; i++) {
//			//커피 총 개수 구하기
//			for(int i = 0; i <numArr.length; i++) {
//				items += numArr[i].length;
//				for(int j = 0; j <numArr[i].length; j++) {
//					sum += numArr[i][j];
//				}
//			}
//			// 커피 10잔 이상일 경우 500원씩 할인
//			if (coffeecnt >= 10) {
//				System.out.println(coffee-500+sum);
//				i += num;
//			}
//			else {
//				break;
//			}
//			// 커피 개수와  총금액 = ?
//			System.out.println("커피 개수 : "+coffeecnt);
//			System.out.println("커피값 총합 : "+coffee*coffeecnt);
//		}
//        scan.close();
		

		
		
		
		
		
		// 랜덤으로 알파벳 대문자 50개 생성하여 출력하는 프로그램을 만들어 보세요.
		// 출력은 10줄 마다 줄바꿈해서 출력되게 해 주세요.
		// 예 > DEFDEGSDFE
		//     > sdfdsSDFsdf
		    
        
		// 3번 풀이
		int symbol_size = 'Z' - 'A' + 1; // 알파벳 길이 26자 - 대문자 랜덤으로 만들어야 하니까 - +1이 들어가는 이유 0부터 시작하니까
		// +1 해주거나 굉장히 자주 있는 일! : 1의 오류
		for (int i = 0; i < 50;  i++) { // 랜덤값 50개 만들기
			char ch3 = (char)(Math.random()*symbol_size + 'A');
			System.out.print(ch3);
			if(i%10 ==9) {
				System.out.println();
			}
				
		} 
		

	}
	

}

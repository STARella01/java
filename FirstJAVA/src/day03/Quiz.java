package day03;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		
		// quiz 01

		int num = (int)(Math.random()*100) + 1; //  1 ~ 101 미만의 int +1 (1 ~ 100) // 출력 범위 0.0 ~ 1.0 미만의 더블값
		System.out.println("랜덤수는 :" + num);
		// if
		System.out.println("3항 연산의 결과 :" + (num%2==0? "짝수":"홀수"));
		
		
		// quiz 02
		// 1. Math.random() 을 이용하여 -5 ~ 5 의 랜덤 수를 발생시키세요.
		// 2. 3항 연산 식을 사용 해서, 절대값을 구하는 식을 세우세요.
		int num2 = 5 - (int)(Math.random()*11); //  랜덤 수에서 5를 빼준다.
		System.out.println("랜덤 수는 :" +num2);
		//3항
		int abs = (num2 >= 0)? num2 : -num2;
		System.out.println(num2 + "절대값은 :"+abs);
		
		
		// quiz 03
		// 1. 수를 입력 받아(Scanner) 짝수, 홀수를 구분하여 출력 하세요.
		// 2. 3항 연산자를 이용하세요.
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요 > ");
		int num3 = scan.nextInt();
		String result = num3%2 == 0? "짝수":"홀수";
		System.out.println("입력받은 수는" + (num3%2 == 0? "짝수" : "홀수"));
			
			
		// quiz 04
		// 1. 키(double) 와 나이(int) 를 입력 받으세요.
		// 2. 키가 140 이상이고, 나이가 8세 이상이라면 “놀이기구 탑승가능“ 아니라면, “놀이기구 탑승불가“ 를 출력

		
		// 나의 1차 답
		int age1 = (int)(Math.random()*100); //
		double height1 = (int)(Math.random()*200); //
		
		System.out.println("사용자 키 : " + height1 + "cm");
		System.out.println("사용자 나이 : " + age1 + "세");
		
		
		if(age1 >= 8) {
			if(height1 >= 140) {
				System.out.println("놀이기구 탑승 가능");
			}else{
				System.out.println("놀이기구 탑승 불가");
			}
		}
		
		
		// 풀이
		// Scanner scan = new Scanner(System.in); // 이미 선언되어 있어서 생략 다른 파일일 경우에는 다 생성해야 함.
		System.out.println("키와 나이를 입력하세요.");
		System.out.println("키");
			double height = scan.nextDouble();
		System.out.println("나이");
			int age = scan.nextInt();
		System.out.println("======================");
		if(height >= 140) {
			if(age >= 8) {
				System.out.println("놀이기구 탑승이 가능합니다.");
			}else {
				System.out.println("놀이기구 탑승 불가");
			}
		}
		else {
			System.out.println("놀이기구 탑승 불가");
		}
		
		
		
		// quiz 05
		// 1. 정수 2개를 입력 받으세요.
		// 2. 두 수를 비교해서 “x 가 큰 수 입니다“ 를 출력 , 같은 수라면 “같은 수 입니다“ 를 출력하세요. 
		System.out.println("정수 두개를 입력하세요.");
		System.out.println(">");
		int num10 = scan.nextInt();
		System.out.println(">");
		int num20 = scan.nextInt();
		
		if(num10 == num20) {
			System.out.println("같은 수 입니다.");
		}else if (num10 > num20) {
			System.out.println(num10 + "이 큰 수 입니다.");
		}else {
			System.out.println(num20 + "이 큰 수 입니다.");
		}
		

		
		// quiz 06			
		// 1. 양의 정수를 입력 받아 짝수 라면 “x 는 짝수 입니다” , 홀수 라면 “x는 홀수 입니다” 를 출력하세요.
		// 2. 0이라면 “0입니다“
		// 3. 음수 라면 “음수 입니다“ 를 출력하세요.
		
		System.out.println("정수를 입력하세요.");
		System.out.println("> ");
		int num30 = scan.nextInt();
		if(num30 > 0 ) {
			if(num30%2 == 0) {
				System.out.println(num30 + "은(는) 짝수");
			}else {
				System.out.println(num30 + "은(는) 홀수");
			}
		}else if(num30 == 0) {
			System.out.println("입력한 정수는 0입니다.");
		}else {
			System.out.println(num30+" 은(는) 짝수입니다.");
		}
		
		
		// quiz 07			
		// 1. 메뉴를 보여준 후, Scanner로 해당 메뉴를 입력 받으세요.
		// 2. 없는 메뉴 라면 “~은 메뉴에 없습니다“ 를 출력하세요.
		// 3. switch 구문을 이용하세요
		
		System.out.println("구매할 메뉴는?");
		System.out.println("[수박,사과,멜론,포도,귤]");
		System.out.println("> ");
		
		String fruit = scan.next();
		switch(fruit) {
		case "수박" :
			System.out.println(fruit + "의 가격은 5만원 입니다.");
		break;
		case  "사과" :
			System.out.println(fruit + "의 가격은 4만원 입니다.");
		break;
		case "멜론" :
			System.out.println(fruit + "의 가격은 3만원 입니다.");
		break;
		case "포도" :
			System.out.println(fruit + "의 가격은 2만원 입니다.");
		break;
		case "귤" :
			System.out.println(fruit + "의 가격은 1만원 입니다.");
		break;
		// 그 외에 선택 받지 못한 것
		default: 
			System.out.println("판매제품이 아닙니다.");
		break;
		
		}
		
		
		//
	}
	

	
	
	
	
}

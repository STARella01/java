package day03;

import java.util.Random;

public class IFExample2 {

	public static void main(String[] args) {
		// 난수 생성 : 임의 값 (random) - 암호문 발생 시 사용
		// 1. Math.random() : 0 ~1 미만의 임의의 값 출력
		// 2. Random모드를 import : import 명령어는 라이브러리 클래스를 로드
		//  각 타입별로 난수를 발생시키는 메서드가 Random에 존재한다. 
		// 난수를 생성하기 위한 seed를 지정할 수 있다. -> 난수를 생성하기 위해 투입한 seed값이 늘 동일하지 않다면 그 결과는 달라질 수 밖에 없다.
		// seed가 동일하면 동일한 난수가 발생함.
		
		// random method
		// - nextFloat() = 0.0이상 1.0 미만의 float형 난수 발생
		// - nextBoolean() = true or false 중 임의 값을 발생
		// - nextInt() = int형 타입 이내의 모든 값에서 난수 발생
		// - nextInt(int) = 0부터 생성자에 들어간 숫자 -1까지 int형 난수 발생
		
		// Random rand = new Random();
		// float a = rand.nextFloat(); or nextDouble로 써도 됨
		// boolean b = rand.nextBoolean();
		// int c = rand.nextInt();
		// int d = rand.nextInt(10);
		// System.out.printf("%f, %b, %d, %d", a,b,c,d);
		
		
		// if ~ else 구문 : if 조건식이 true면 if의 실행문 , 그렇지 않으면 else 실행문을 동작한다.
		// 정수 난수 발생 ( 0 ~ 99) 사이에 있는 숫자 발생 시킬 예정
		int jumsu = (int)(Math.random()*100);
		
		System.out.println("점수 : "+ jumsu);
		// print() : 전달된 값을 츨력
		// printf() : 문자열의 포맷문자를 이용하여 결과를 출력
		// println() : 문자열 값의 마지막에 \n이 추가되는 것 즉, 줄바꿈 처리 한다는 것.

		if (jumsu >= 60) {
			System.out.println("60점 이상인 점수입니다.");
			System.out.println("합격");
		}
		else {
			System.out.println("60점 이하인 점수입니다.");
			System.out.println("불합격");	
		}
	}

}

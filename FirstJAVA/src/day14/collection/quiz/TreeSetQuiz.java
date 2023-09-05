package day14.collection.quiz;

import java.util.Random;
import java.util.TreeSet;

public class TreeSetQuiz {
	// TreeSet을 이용하여 로또번호 6개를 생성하는 프로그램을 작성하시오
	// 1. TreeSet을 생성하세요.
	// 2. 무한루프를 사용하여 1 ~ 45까지의 난수를 발생시키세요.
	// 3. 발생한 난수를 추가합니다.
	// 4. 크기가 6이되면 무한루프를 빠져나옵니다.
	public static void main(String[] args) {

		// 위치 계속 변경되기 때문에 인덱스 값 순서로 찾을 수 없다. 
		TreeSet<Integer>lotto = new TreeSet<>(); // int는 기본자료형이라 안되서 Integer 넣는다.
			
//			lotto.add((int) (Math.random()*45));
//			System.out.print("출력 테스트");
//		
//			for(int i = 1; i == 6; i++)	{
//				System.out.print(lotto+"gg");
//				System.out.print("출력 테스트");
//			}
		
		// 무한 루프 난수 생성
		while(true) {
			Random a = new Random(); 
			lotto.add((int) (Math.random()*45)+1);
			
			
			System.out.println(lotto);
		}
			
	}

	}



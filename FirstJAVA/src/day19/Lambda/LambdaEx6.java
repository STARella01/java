package day19.Lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class LambdaEx6 {

	public static void main(String[] args) {
		// Consumer<T> 인터페이스 - 매개 변수 O , 반환 타입 X
		
		// 객체 타입 하나를 매개변수
		Consumer<String> c1 = name -> System.out.println("제 이름은"+name+"입니다."); // 반환 타입 없고 매개변수 받아서 실행하고 끝
		c1.accept("차은우");
		
		// 객체 타입 두 개를 매개 변수
		BiConsumer<String, String> c2 = (lastname, firstname) -> {
			System.out.println("제 이름은"+lastname + firstname + "입니다.");	
		};
		c2.accept("차", "은우");
		
		// 매개 변수 값이 Double인 경우
		DoubleConsumer c3 = (score) ->  System.out.println("제 점수는"+score+"점 입니다.");
		c3.accept(99.9);
		
		// 매개변수 값이 객체와 int인 경우
		ObjIntConsumer<String> c4 = (lecture, i) -> {
			System.out.println("제"+lecture+"의 점수는"+i+"점 입니다.");
		};
		c4.accept("국어", 100);
		
		

		
		
	}

}

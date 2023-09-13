package day20.stream;

import java.util.Arrays;
import java.util.List;

public class StreamMap {

	public static void main(String[] args) {
		//  mapXX() 메서드
		List<String> list = Arrays.asList("동해물과","백두산이","마르고 닳도록");
		
		System.out.println("함수적 인터페이스 방식");
		list.stream().mapToInt(s -> s.length()).forEach(len -> System.out.println(len));
		System.out.println(); // 4 4 7
		
		System.out.println("메서드 참조 방식");
		list.stream().mapToInt(String::length).forEach(len -> System.out.println(len)); // 여기에서 String는 클래스 :: length는 메소드  ::는 해당 메서드를 호출한다는 의미
		System.out.println(); // 4 4 7
		//s -> s.length()와 String::length는 같다
		
		System.out.println(); // System 파이널 out은 상수값 / printStream이라는 객체를 반환해주는 상수값
		
		
		
		
		
		

	}

}

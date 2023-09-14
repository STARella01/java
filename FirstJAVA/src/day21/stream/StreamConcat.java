package day21.stream;

import java.util.stream.Stream;

public class StreamConcat {

	public static void main(String[] args) {
		// 두 개의 스트림을 연결해서 새로운 스트림 객체로 사용하는 concat() 메서드
		
		// 문자열 스트림 객체
		Stream<String> stream1 = Stream.of("차은우1","차은우2","차은우3","차은우4");
		
		// 정수 스트림 객체
		Stream<Integer> stream2 = Stream.of(1,2,3,4,5,6,7,8,9,10);
		
		// concat() 를 사용 두 스트림 객체를 합치기
		Stream<Object> concat = Stream.concat(stream1, stream2); // String과 Integer를 포함할 수 있는 객체 Object / <Object>는 < >생략가능
		concat.forEach(a -> System.out.print(a + " "));

	}

}

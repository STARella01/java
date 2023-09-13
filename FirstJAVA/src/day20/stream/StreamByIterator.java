package day20.stream;

import java.util.stream.Stream;

public class StreamByIterator {

	public static void main(String[] args) {
		// iterator() 메서드를 이용한 Stream 객체 생성 :
		Stream<Integer> stream = Stream.iterate( 1, n -> n + 1 ).limit(10); 
		// 1부터 시작해서 1씩 늘려간다.
		// Stream.iterate( 1, n -> n + 1 ) 1은 초기값 , n -> n + 1 함수
		// n이 지금 초기값이 1인데 10번 반복해 n+1이라는 함수 작업에 대해서
		// limit(10) -> iterate작업에 대한 개수 제한		

		// 내부 반복자를 이용 출력
		stream.forEach(s -> System.out.print(s + " "));
		// stream.forEach 이걸 사용하는 이유는 stream의 반복 뿐만 아니라,
		// for문 보다 가독성이 좋고, 
		// Stream을 사용하므로 인해, 병렬처리까지 가능하기 때문이다.
	}
}
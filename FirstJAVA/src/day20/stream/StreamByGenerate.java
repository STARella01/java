package day20.stream;

import java.util.stream.Stream;

public class StreamByGenerate {

	public static void main(String[] args) {
		// generate( ) 메서드를 이용한 Stream 객체 생성 
		
		// 리미트 설정 10개-- 리미트 설정하지 않으면 무한 반복 ( 왜? Stream 크기 제한이 없음 )
		Stream<String> stream = Stream.generate(( ) -> "애국가 ").limit(10);
		// 만약 limit를 설정하지 않으면,
		// limit는 최대 선택 요소의 개수
		// 따라서 limit에 0을 입력하면 어떤 동작도 수행하지 않고, 출력하지 않는다.
		// limit() 개수 설정 영역이 비어있는 경우에는 error가 뜬다.
		// 스레드 "메인" java.lang.오류: 해결되지 않은 컴파일 문제: 
		// Stream<String> 형식의 메서드 제한(길이)이 인수()에 적용되지 않습니다.
		// 따라서 반드시 값 설정해 주어야 한다.
		// 아예 limit자체를 선언하지 않으면 무한 반복됨.

		// 내부 반복자로 출력
		stream.forEach(s -> System.out.print(s + ""));
	}
}
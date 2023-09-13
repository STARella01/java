package day20.stream;

import java.util.Arrays;
import java.util.List;

public class FilterStream {

	public static void main(String[] args) {
		// FilterStream 연습
		
		// List 객체 생성
		List<String> list  = Arrays.asList("홍은우","차은우2","홍은우","차은우4","홍은우","차은우6");
		
		// distinct () 메서드를 사용하여 중복 제거 후 내부 반복자를 이용한 출력
		System.out.println("distinct()");
		list.stream().distinct().forEach(n -> System.out.println(n));
		System.out.println();
		
		// "홍"으로 시작하는 문자열로 필터링 후 내부 반복자로 출력
		System.out.println("filter() - '홍'으로 시작하는 것 필터링");
		list.stream().filter(n -> n.startsWith("홍")).forEach(n -> System.out.println(n));
		System.out.println();
		
		// 중복 제거 후 "홍"으로 시작하는 문자열 내부 반복자를 이용한 출력
		System.out.println("filter()");
		list.stream().distinct().filter(n -> n.startsWith("홍")).forEach(n -> System.out.println(n));
		System.out.println();

	}

}

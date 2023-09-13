package day20.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamOrder {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("홍길동","김두한이","시라소니","쌍칼");
		
		System.out.println("기본 정렬");
		list.stream().sorted().forEach(System.out::println);
		System.out.println();
		
		System.out.println("역순 정렬");
		list.stream().sorted(Comparator.reverseOrder()) // Comparator.reverseOrder() 역정렬 // reverseOrder -> static
			.forEach(System.out::println);
		System.out.println();

	}

}

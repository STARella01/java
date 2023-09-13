package day20.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamEx {

	public static void main(String[] args) {
		// IntStream의 range( ), rangeClosed( ) 메서드 사용
		
		int[ ] arr = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Arrays.Stream() Instream 생성하기");
		IntStream intstream1 = Arrays.stream(arr);
		intstream1.forEach(s -> System.out.print(s + "\t"));
		System.out.println();
		
		System.out.println("");
		IntStream intstream2 = IntStream.of(arr);
		intstream2.forEach( s -> System.out.print(s + "\t"));
		System.out.println();
		
		// 두번째 매개변수 인덱스 포함안됨
		System.out.println("");
		IntStream intstream3 = IntStream.range(1, 5);
		intstream3.forEach(s -> System.out.print(s + "\t"));
		System.out.println();
		
		// 두번째 매개변수 인덱스 포함
		System.out.println("IntStream");
		IntStream intstream4 = IntStream.rangeClosed(1, 5);
		intstream4.forEach(s -> System.out.print(s + "\t"));
		System.out.println();
	}
}

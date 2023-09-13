package day20.stream;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class RandomToStream {

	public static void main(String[] args) {
		//  Random.ints()
		System.out.println("int형 난수 스트림");
		// ints (3) 3ro;
		IntStream isr = new Random().ints(3);
		
		isr.forEach(s -> System.out.print(s));

		// ints의 (개수, 시작값, 끝값 전(포함 X ) )
		isr = new Random().ints(10, 0, 3);
		isr.forEach(s -> System.out.print(s));
		
		System.out.println("long형 난수 스트림");
		// longs의 (개수, 시작값, 끝값 전(포함 X ) )
		LongStream Isr = new Random().longs(3, 0, 10);
		Isr.forEach(s -> System.out.print(s + "\t"));
		
		System.out.println("double형 난수 스트림");
		// doubles ()
		DoubleStream dsr = new Random().doubles(3);
		dsr.forEach(s -> System.out.print(s + "\t"));
	}
}

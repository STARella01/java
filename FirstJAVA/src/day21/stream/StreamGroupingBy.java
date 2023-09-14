package day21.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import day20.stream.Circle;
import day20.stream.Rectangle;
import day20.stream.Shape;

public class StreamGroupingBy {

	public static void main(String[] args) {
		// GroupingBy( ) : Map 객체 생성 - 메서드 Map 아님
		Shape s1 = new Rectangle(10, 3);
		System.out.println("s1( Rectangle )의 getClass 값 : "+s1.getClass()); // Object에 이 클래스 값이 들어갔다. // 키 값 자체가 객체가 되었다.
		Shape s2 = new Circle(10);
		Shape s3 = new Rectangle(20, 2);
		Shape s4 = new Circle(11);
		
		List<Shape> list = Arrays.asList(s1, s2, s3, s4);
		
		try {
			// 객체 타입으로 그룹핑 ( Rectangle , Circle )
			Map<Object, List<Shape>> map= list.stream()
					.collect(Collectors.groupingBy( f -> f.getClass() ));
			// groupingBy는 그룹핑 기준을 getClass()을 사용한다.
			// getClass()는 해당 객체의 클래스
			
			System.out.println("사각형 출력");
			map.get(Class.forName("day20.stream.Rectangle")).stream()
				.forEach(f->System.out.println(f));
			
			System.out.println("원 출력");
			map.get(Class.forName("day20.stream.Circle")).stream()
			.forEach(f->System.out.println(f));
			
		} catch (Exception e) {
			System.out.println(e.getMessage()); // 클래스를 찾을 수 없을 때
		}
		
	}

}

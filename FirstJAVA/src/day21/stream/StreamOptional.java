package day21.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class StreamOptional {

	public static void main(String[] args) {
		// 집계 함수들
		int[] arr = new int [100];
		for( int i =0; i < 100; i++) {
			arr[i] = i + 1	;
		}
		
		// 리턴값 long
		long count = Arrays.stream(arr).count();
		System.out.println("요소들의 개수 : "+count);

		// 리턴값 int
		int sum = Arrays.stream(arr).sum();
		System.out.println("요소들의 합 : "+sum);
		
		OptionalInt first = Arrays.stream(arr).findFirst();
		System.out.println("요소들 중 첫번째 값 :"+first.getAsInt());
		
		OptionalInt max = Arrays.stream(arr).max();
		System.out.println("요소들 중 최대값 : "+max.getAsInt());
		
		OptionalInt min = Arrays.stream(arr).min();
		System.out.println("요소들 중 최소값 : "+min.getAsInt());
		
		// 
		OptionalDouble avg = Arrays.stream(arr).average();
		System.out.println("요소들 중 평균 :"+avg.getAsDouble());
		
		// OptionalXXX 클래스들은 기능이 거의 유사함.
		// isPresent( )	- 반환 타입이 boolean, 값이 존재하는여부 확인용
		// orElse(T)		- 반환 타입이 T(내가 지정한 값) , 기본값 설정
		// ifPresent( Consumer )		-반환 타입이 void, 값이 존재하는 경우 Consumer 처리
		
		
		System.out.println("Optional 주요 메서드 확인");
		// 요소가 없는 빈 ArrayList 객체 생성
		List<Integer> list = new ArrayList<>();
		
		long count1 = list.stream().count();
		System.out.println("요소들의 개수 :"+count1);

		long sum1 = list.stream().mapToInt(Integer::intValue).sum();// 타입이 stream<Integer> - map들어가면 형변환 // Integer를 int로 바꿔서 사용한 것 // Integer는 객체임
		System.out.println("요소들의 합 :"+sum1);

		
		// 요소가 존재하는 경우에만 평균을 출력
		//확인용
		OptionalDouble avg2 = list.stream().mapToInt(Integer::intValue).average();
		if(avg2.isPresent()) {
			System.out.println("요소들의 평균 : "+avg2.getAsDouble());
		}
		
		OptionalInt max2 = list.stream().mapToInt(Integer::intValue).max();
		if(max2.isPresent()) {  // isPresent( )
		System.out.println("요소들 중 최대값 : "+max2.getAsInt());
		}
		
		//OptionalInt min2 = list.stream().mapToInt(Integer::intValue).min().orElse(0); // orElse값은 옵셔널로 처리 불가 - int로 바꿔야 함
		int min2 = list.stream().mapToInt(Integer::intValue).min().orElse(0); // orElse값은 옵셔널로 처리 불가 - int로 바꿔야 함
		System.out.println("요소들 중 최소값 : "+min2);
		
//		OptionalInt first2 = list.stream().mapToInt(Integer::intValue).findFirst()  // 반환타입이 void라서 삭제처리
		list.stream().mapToInt(Integer::intValue).findFirst()
				.ifPresent(a -> System.out.println("요소 중 첫번째 값 : "+a)); 
		
		
		
		
		
		
		
	}

}

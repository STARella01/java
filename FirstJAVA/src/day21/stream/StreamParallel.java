package day21.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamParallel {

	public static void main(String[] args) {
		// 병렬 처리 : 경우 따라 다름 - CPU 코어의 영향을 받는다. - core가 하나라면 싱글코어 : 순차적 처리가 적합

		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<100; i++) {
			list.add(i);
		}
		long start = System.nanoTime();
		// stream( ) 순차적 스트림 처리
		Stream<Integer> a1 = list.stream();
		list.stream().forEach(a -> {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		long end = System.nanoTime();
		System.out.println("순차 스트림 처리 시간 :"+(end - start)+"nano sec");		
		
		
		start = System.nanoTime();
		// parallelStream () 병렬 스트림 처리
		list.parallelStream().forEach(a ->{
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		end = System.nanoTime();
		System.out.println("병렬 처리 스트림 처리 시간 :"+(end - start)+"nano sec");		
		// 병렬처리 시간이 더 짧음
		
	}

}

// 순차 스트림 처리 시간 :185769700nano sec
// 병렬 처리 스트림 처리 시간 :55147700nano sec



// If I could save time in a bottle..
// The first thing I'd like to do'
package day08;

import day06.Pen;

public class GarbegeCollectingEx { // 오타 수정
	// Garbage Collecting
	// - 객체를 생성할 때 사용되는 키워드 new 이지만, 
	// 생성된 객체를 메모리에서 해제시키는 키워드는 존재하지 않는다.
	// - 없는 이유는 자바에서 자바 가상머신(JVM)이 알아서 메모리를 관리해 주며,
	// 이것을 Garbage Collector라고 얘기한다.
	// - 객체가 더 이상 프로그램에서 사용되지 않으면 가비지 컬렉터가 스스로 판단해서 메모리를 해체하여 수거
	// 키워드 : 자바 자체적으로 사용하는 명령어.
	
	
	
	
	public static void main(String[] args) {
		
		Pen p;
		for (int i  = 0; i<= 100000000; i++){
			p = new Pen();
			System.out.println(p);
		}

	}

}

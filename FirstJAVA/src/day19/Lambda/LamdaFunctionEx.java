package day19.Lambda;

public class LamdaFunctionEx {

	public static void main(String[] args) {
		
			// 람다식 표현 사용 
			InterfaceEx ie = (int x, int y) -> x+y;  // x+y가 return
			
			// 람다식 표현 미사용 시 = 기본 자바 표현
			InterfaceEx ie2 = new InterfaceEx() {
				@Override
				public int sum(int x, int y) {
					return x+y;
				}
			};
			
			System.out.println(ie.sum(1,2));		// 3
			System.out.println(ie2.sum(1,2));		// 3
	}

}


// 함수적 인터페이스 : 추상메서드 한 개를 가지고 있는 인터페이스

interface InterfaceEx{
	public int sum(int x, int y); // 함수적 인터페이스
}
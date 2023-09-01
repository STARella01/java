package day12.exception;

public class TryCatchExample {

	public static void main(String[] args) {
		
		int i = 0;
		String[] greetings = {"안녕하세요.","반갑습니다.","또 오세여^^"};
		
		while( i < 4){
			try {
				// 예외 발생 가능한 코드 부분
				System.out.println(greetings[i]); 
			} catch (ArrayIndexOutOfBoundsException e) { // 예외에 대해서 정의
				// 예외 발생 시 처리 코드 부분
				System.out.println("예외가 발생했습니다.");
				System.out.println("예외가 발생한 원인은"+e.getMessage());
				System.out.println("예외 처리를 완료했습니다.");
			} finally {
				// 항상 실행하는 부분
				System.out.println("finally 문은 항상 실행됩니다.");
			}
			
			//반복문은 무한히 반복되기 때문에 증감식 추가
			i++; // 반복문의 제어
		} // while문 끝
		
		System.out.println("메인의 마지막");
	}

}

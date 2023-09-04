package day12.exception;

public class ThrowsExample {
	
	private static String[] greetStrings = {"안녕", "Hi" ,"니하오"};
	
	public static void doIt( int index ) throws ArrayIndexOutOfBoundsException{
		System.out.println(greetStrings[index]);
	}

	public static void main(String[] args) {
		
		int i = (int) (Math.random()*4); // 랜덤이니깐!!
		try {
			doIt(i);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("메인에서 i가 잘못 선택되었습니다. 다음 명령문으로 넘어갑니다.");
		}
		System.out.println("다음 명령문이 실행되었습니다.");

	}

}

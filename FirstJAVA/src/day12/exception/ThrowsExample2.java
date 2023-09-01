package day12.exception;

public class ThrowsExample2 {

	private static String[] greetStrings = {"안녕", "Hi" ,"니하오"};
	
	public static void doIt( int index){
		try {
			System.out.println(greetStrings[index]);
		} catch (Exception e) {
			System.out.println("잘못된 인덱스.");
			e.printStackTrace(); //  printStackTrace - 화면에 띄워줌
			// getMessage() - 예외 발생 이유 알려줌
		}
	}

	public static void main(String[] args) {
		
		int i = (int) (Math.random()*4); 
		doIt(i);

	}

}



package day12.exception;

public class RuntimeExceptionExample {
	
	public static int makeException1(int input) { // java.lang.ArthmeticException
		int devide = 0;
		int result = input/devide;
		return result;
	}
	
	public static void makeException2() {  // java.lang.StringIndexOutOfBoundsException
		String s= "가";
		System.out.println(s.charAt(1));
	}
	
	// 배열 에러
	public static void makeException3() throws Exception { // java.lang.ArrayIndexOutOfBoundsException 
		int [] a = {1,2,3};
		System.out.println(a[3]);
	}
	
	// 특정 값이 없을 경우 발생
	public static void makeException4() { // java.lang.NullPointerException
		String nothing = null;
		System.out.println(nothing.split(""));
	}
	
	// 타입 변환 예외처리
	public static void makeException5() { // java.lang.NumberFormatException
		String notInt = "가나다";
		int a = Integer.parseInt(notInt); // Integer.parseInt 문자열 정수로 변경
	}
	
	// 
	public static void makeException6() { // 자기 자신의 함수를 무한대로 만들어 버림
		for(int i = 0; i < Integer.MAX_VALUE; i++) { // java.lang.StackOverflowError
			makeException6();
		}
	}
	
	// 배열에 예외가 발생했다
	public static void makeException7() { // java.lang.ArrayStoreException
		Object[] objArr = new String[3];
		objArr[0] = 0; // 문자에 정수 집어넣음 근데 오류 안뜨는 이유는 
		// 선언 자체가 Object로 되어 있기 때문에 컴파일 오류가 발생하지 않는다.
		// String s = 0;
	}
	
	// 클래스 캐스팅(형변환) 예외
	public static void makeException8() { // java.lang.ClassCastException:
		Object[] objArr = new String[3];
		objArr[0] = "0"; // 0x30 아스키 코드
		Integer a = (Integer) objArr[0]; // ( ) ->이거는 형변환 입력
		// 문자와 숫자는 관계가 없기 때문에 바꿀 수 없어서 예외처리됨
	}

	//
	public static void main(String[] args) throws Exception { 
		// RunTime Exception - Unchecked Exception
		try {
		 makeException1(5);
		 makeException2();
		 makeException3();
		 makeException4();
		 makeException5();
		 makeException6();
		 makeException7();
		 makeException8();
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
		//	makeException1(5);
		//	makeException2();
		//	makeException3();
		//	makeException4();
		//	makeException5();
		//	makeException6();
		//	makeException7();
		//	makeException8();
	}
	

}

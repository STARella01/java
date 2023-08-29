package day08;

public class ReferencePriExample {

	public static void main(String[] args) {
		// string 문자열 비교하기
		String str1 = "Hello";
		String str2 = "Hello";	
		System.out.println("str1과 str2의 비교 결과 :" + (str1 == str2) ); // true
		// 공동 사용 상황 
		
		// new를 사용한 객체 비교 - 동등 비교
		String str3= new String("Hello");
		String str4= new String("Hello");
		System.out.println("str3과 str4의 비교 결과 :" + (str3 != str4) ); // true
		System.out.println("str3과 str4의 비교 결과 :" + (str3 == str4) ); // false
		
		// 문자열 equals() 사용 시
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
		// equals - 객체의 값을 불러와서 비교
	}

}

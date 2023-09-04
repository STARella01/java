package day13.api.java_lang;

import java.util.Arrays;

public class StringMethodExample {

	public static void main(String[] args) {

		// String 메서드 사용 예
		String str = "Hello, world! 1234567890";
		System.out.println(str);
		
		// 1. substring : 문자열을 원하는 만큼 자르는 메소드
		System.out.println(str.substring(0));
		System.out.println(str.substring(1));
		System.out.println(str.substring(2));
		System.out.println(str.substring(3));
		System.out.println(str.substring(4));
		System.out.println(str.substring(0,4)); // 시작부터 끝 전까지
		System.out.println(str.substring( 7,13 )); // world! 추출
		
		// 2. split : 문자열을 원하는 기준으로 자른다 -> 배열로 반환
		str = "apple/banna/kiwi/lemon/orange";
		String[] fruit = str.split("/"); //  '/' 슬라이드를 기준으로 자르겠다. 
		for(int i = 0; i < fruit.length; i++) {
			System.out.println(fruit[i]);
		}
		System.out.println(Arrays.toString(fruit));// 이런식으로 써도 됨
		
		// 3. indexOf : 원하는 문자의 인덱스를 반환 ( 못찾는 경우 -1 반환)
		int orange_index = str.indexOf("orange");
		System.out.println("오렌지 위치 :"+orange_index); //  apple/banna/kiwi/lemon/orange
		
		System.out.println("첫번째 o의 위치 :"+str.indexOf('o')); // 이렇게 하면 lemon의 o를 호출해옴.
		// 따라서 fromindex 사용 ( 첫번째 인덱스 , 첫번째 찾은 값 o에 + 해줘라 - 포함)
		System.out.println("두번째 o의 위치 :"+str.indexOf( 'o', str.indexOf('o')+1) ); // 특정 문단 내에 무엇이 있는 지 알 수 없어서 
		
		// 4. charAt : 원하는 위치의 문자를 가져옴.
		char ch = str.charAt(str.indexOf("orange")); 
		String orange = str.substring(
				str.indexOf("orange"),
				str.indexOf("orange")+"orange".length());
		System.out.println(ch);  // o
		System.out.println(orange); // 
		
		// 5. contains : 해당 문자가 문자열에 포함되어 있는지 체크 - 반환타입 boolean
		if(str.contains("apple")) {
			// apple이 있으면
			System.out.println("사과도 있다.");
		}else {
			System.out.println("사과 없다.");
		}
		
		
		// 6. length() , equals()
		
		// 7. replace : 원하는 문자로 치환
		str ="abc@naver.com";
		
		// 내가 찾을 단어, 변경할 단어
		str = str.replace("naver", "micro");
		System.out.println(str);
		
		// 여러개 라면 맨처음 것만 바꿔줘라 명령어
		str ="abc@naver.naver.com";
		str = str.replaceFirst("naver", "micro");
		System.out.println(str);
		
		// 8. lastIndexOf : 해당 문자열의 뒤에서 부터 찾아서 위치 반환
		str = "abcd    dcda";
		System.out.println("indexOf(d) :"+str.indexOf('d'));   //3
		System.out.println("lastOfIndex (d) :"+str.lastIndexOf('d'));  //10
		
		// 9. toUpperCase , toLowerCase : 대/소문자 변환
		String email = "abcs@NaveR.CoM";
		str = "naver.com";
		
		email = email.toLowerCase();
		System.out.println(email.contains(str));
		
		
		// 10. trim : 문자열 바깥 쪽 공백 제거
		String id_1 = "     abcd   123  ";
		String id_2 = "   abcd   123    ";
		
		System.out.println("before1 :" + id_1);
		System.out.println("before2 :" + id_2);
		
		System.out.println("equals :" + id_1.equals(id_2));  // 공백 제거전 공백까지 내용으로 인식해서 false
		
		id_1 = id_1.trim();
		id_2 = id_2.trim();

		System.out.println("after1 :" + id_1);
		System.out.println("after2 :" + id_2);
		
		System.out.println("equals :" + id_1.equals(id_2)); // true 공백 날리고 내용만 비교해서 true됨
		
		
		// 11. format : 서식문자열을 이용하여 문자열을 만들어서 반환
		str = String.format("%d:%d:%d", 13,45,94);
		System.out.println(str);
		
		// 12. endsWith : 지정된 문자로 끝나는 지 검사 (확장자 등을 체크할 때 사용)
		str = "오늘할일.html";
		
		if(str.endsWith(".txt")) {
			System.out.println("확장자가 올바른 텍스트 파일입니다.");
		}else if(str.endsWith(".html") || str.endsWith(".hml") ) {
			System.out.println("웹 페이지 입니다.");
		}
			System.out.println("텍스트 파일이 아닙니다.");
		}
		
	
	

	} // main end



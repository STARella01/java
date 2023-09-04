package day13.api.java_lang;

public class StringBuilderExample {

	public static void main(String[] args) {
		// StringBuilder
		String str = "Hello, world! 1234567890";
		StringBuilder sb = new StringBuilder(str);
		System.out.println("String builder에 있는 문자열 :"+str);
			
		// 1. append
		sb.append(10);
		System.out.println("append 10의 결과"+sb); //
		
		sb.append(true);
		System.out.println("append (true)의 결과"+sb); //
		
		// 2. insert (인덱스, "추가할 문자")
		sb.insert(7, "insert 합니다.");  // offset 어느 위치에 뭘 집어 넣겠다.
		System.out.println("insert 결과"+sb);
		
		// 3. delete (시작인덱스, 끝인덱스)
		sb.delete( sb.indexOf("insert"), sb.indexOf("insert")+"insert합니다.".length() ); // 어디서부터 어디까지 삭제하겠다.
		System.out.println("delete 결과 :"+sb);
		
		// 4. deleteCharAt()
		sb.deleteCharAt(12);
		System.out.println("deleteCharAt(12)의 결과 :"+sb);
		
		// 5. setCharAt()
		sb.setCharAt(12, '!');
		System.out.println(sb);
		
		// 6. replace()
		// sb.replace(start, end, str)
		sb.replace(12, 14, "!");   // 12번 뒤, 14번 앞에 있는 애를 !로 변경해서 출력해라
		System.out.println("replace() 결과 :"+sb);
		
		// 7. reverse 
		sb.reverse();
		System.out.println(sb);
	}

}

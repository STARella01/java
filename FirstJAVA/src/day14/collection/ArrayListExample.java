package day14.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List list = new ArrayList( );		// 클래스 아니고 인터페이스의 리스트
		
		// 추가
		list.add("one");							// new String ( ""); 과 같음
		boolean a = list.add("second");
		list.add("3rd");
		list.add(new Integer(4));
		list.add(new Float(5.0f));
		
		boolean b = list.add("second");		// 리스트는 중복 저장이 가능
		list.add(new Integer(4));
		list.add("SECOND");
		
		System.out.println(a);		// true
		System.out.println(b);		// true
		System.out.println(list);	// [one, second, 3rd, 4, 5.0, second, 4, SECOND]
		
		//	수정 Set
		list.set(6, 8); // index 6번째 ,  변경할 엘리멘트 8
		System.out.println(list); 	// [one, second, 3rd, 4, 5.0, second, 8, SECOND]
		
		// 제거 remove - 명령 순서대로 제거
		list.remove(0); // index 0번을 제거합니다.
		list.remove("SECOND");  // index 텍스트 "SECOND"를 제거합니다.
		System.out.println(list); // [second, 3rd, 4, 5.0, second, 8]
		
		// 얻어오기 get();
		Object o = list.get(5); // 형태가 지정되어 있지 않아서.. object 사용
		System.out.println(o); // 8
		
		// 사이즈
		int size = list.size();
		int idx = list.indexOf("second");
		System.out.println("list의 크기는 :"+size); // list의 크기는 :6
		System.out.println("첫번째, second= "+idx); // 첫번째, second= 0
		
		// String o = list.get(5); // 두 번째 second 출력하려고 하면 에러남.. - 제너릭 설정을 하지 않아 타입이 지정되지 않음.
		// 기본이 Object 타입으로 설정되었다는 말. - 강제 캐스팅이 필요하다
		String s = (String)list.get(4);
		// String s = list.get(5).toString; - 문자열로 전체 다 변환한다는 말
		System.out.println("문자열의 길이 :"+s.length()); // 길이 확인을 위해
		
		// 정리 clear
		list.clear();
		if(list.isEmpty()) {
			System.out.println("list is Empty!");
		}
		
		
 
	}

}
// 글씨 쓰고 다옴표로 묶기 단축키 찾기
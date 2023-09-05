package day14.collection;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		// Map<K, V>  // K, V 객체
		Map maps = new HashMap();
		
		// 추가
		String s1 = new String("홍길동");
		maps.put("name", s1);
		maps.put("hiredate", new Date());
		maps.put("salary", 20000);
		
		System.out.println(maps);
 
		// 불러오기 ( 하나씩 불러올 때 사용)
		System.out.println();
		System.out.println(maps.get("hiredate"));
		System.out.println(maps.get("salary"));
		System.out.println(maps.get("name"));

		System.out.println();
		
		//	map안에 엘리먼트를 entrySet() 메소드를 이용하여 조회
		Set<Map.Entry<String, Object>> s = maps.entrySet();
		System.out.println(s);
		for(Map.Entry<String, Object> me : s) {
			System.out.println(me.getKey() + " : "+me.getValue());
		}
		
		System.out.println();
		
		// KeySet() 메서드로 map 키를 리턴받고, get(key) 메서드를 사용하여 조회
		Set<String> ss = maps.keySet();
		for(String key: ss) {
			System.out.println("여기 맞아?");
			System.out.println(key + "::"+maps.get(key));
		}
		
		// Iteration : 컬렉션에서 저장되어 있는 엘리먼트를 검색하는 절차를 지정
		// Iterator Interface : 컬렉션에 저장된 엘리먼트를 순차적으로 하나씩 접근하고자 할 때 사용.
		// - Set 계열 - Collection interface에 정의된 Iterator() 메서드를 통해서 Iterator 객체를 반환 받아 사용
		// - List 계열 : listIterator() 메서드를 통해서 ListIterator 객체를 반환 받아 사용
		
		// Iterator 인터페이스의 주요 메서드
		// > boolean hasNext()
		// > E next()
		// > void remove()
		
		System.out.println(" ** values를 이용한 value 출력 **"); // 덮어씌우는 방식
		// 값 있는지 없는지 확인하면서 넘겨줌
		Collection valueList = maps.values();  // 반환타입과 맞춰줘야 함 그래서 Collection 사용
		System.out.println(valueList);		  
		Iterator iter = valueList.iterator();
		while(iter.hasNext()) { 	// 값이 있다면 다음 값을 출력해라 - hasNext boolean 타입			
			System.out.println(iter.next());
		}
	}

}

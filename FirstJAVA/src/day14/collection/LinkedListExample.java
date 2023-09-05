package day14.collection;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// 
		// 문자열 제너릭 사용
		// ArrayList는 내부 배열에 객체를 저장하여 인덱스로 관리, LinkedList는 인접 참조를 링크하여
		// 체인처럼 관리
		// LinkedList는 특정 인덱스의 객체를 제거하면 앞 뒤 링크만 변경되고, 나머지 링크는 변경되지 않아
		// 비번한 객체의 삭제와 사입은 ArrayList보다 좋은 성능을 발휘한다.
		
		//  ArrayList 동적이지만 순차적 
		//  LinkedList 각각 다른 공간이 체인형태로 이어져 있음 , 추가 삭제가 쉬움 , 자주 추가하고 삭제하는 것에 사용하면 좋음
		LinkedList<String> list = new LinkedList<>();
		
		// 추가 - push와 비슷
		list.add("hello");
		list.add("java");
		list.add("banana");
		// list.add("apple");
		list.addFirst("apple2"); 	// 헤드에 값을 추가
		list.addLast("zoo");		// 끝에 값을 추가
		
		System.out.println("data add "+list);

		//	제거
		list.remove(); // head 엘리먼트 삭제 - remove queue라는 인터페이스에서 받아온 거임.
		System.out.println("list data after remove() : "+list); // hello 삭제
		
		list.remove(2);	// 2번 엘리먼트 삭제
		System.out.println("data remove "+list); // apple 삭제
		
		// 변경
		list.set(1, "new"); // 1번 엘리먼트를 변경
		System.out.println("data set "+list);
		
		// 빼기 - 조회만 함. 
		String str1 = list.peek(); // 헤더 엘리멘트 조회 또는 peekFirst 사용
		String str2 = list.peekLast();
		System.out.println("str1 :"+str1);
		System.out.println("str2 :"+str2);
		System.out.println("data peek"+list);
		
		// 
		String str3 = list.poll(); // 엘리먼트 조회 후 삭제 - pop과 같음
		System.out.println("str3 : "+str3);
		System.out.println("data poll "+list);
		
		String str4 = list.pop(); // 엘리먼트 조회 후 삭제 - poll과 같음
		System.out.println("str4 "+str4);
		System.out.println("data pop "+list);
		
		
		list.push("push element");	// push 시 추가 위치 주의
		System.out.println("data push "+list);
	}

}

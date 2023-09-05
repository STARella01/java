package day14.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 해싱 : 하나의 문자열을 보다 빨리 찾을 수 있도록 주소에 직접 접근할 수 있는 짧은 길이의 값이나
		// 키로 변환하는 것. 이 해시값을 이용하여 문자열을 메모리에 저장합니다.
		// 검사 시 , 문자열을 비교하는 것이 아니라 해시값을 비교하기 때문에 한 번에 검색이 가능함.
		// 문자열의 형태와 해시값은 전혀 연관성이 없기 때문에 메모리상 여러 곳에 흩어져 저장됨.
		
		// ex ) 로또 (중복수 나오는 거 고민할 필요 없음) , 카테고리 만들 때
		// 분류에서 나와서 특정값의 리스트 항목 낼 때, 자료 분류할 때, 특정 패턴 특정 값 추려낼 때 사용
		
		Set set = new HashSet<>();
		
		set.add("three");
		set.add("one");
		set.add("two");
		set.add("four");
		set.add("five");
		
		set.add(new Integer(4)); // [ 4, four, one, three, two, five ] 
		boolean isAdded = set.add("five"); // 중복으로 false 뜬다
		
		System.out.println(set);
		System.out.println(isAdded);
		
		System.out.println(set.size()); // 6
		
		set.remove("two");
		System.out.println(set); // [4, four, one, three, five]
		
		set.clear();
		System.out.println(set); // []
		
		if(set.isEmpty()){
			System.out.println("set is Empty!"); // set is Empty!
		}
		
	}

}

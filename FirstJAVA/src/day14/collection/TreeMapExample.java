package day14.collection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		Map<String, Integer> accounts = new TreeMap<String, Integer>();
		
		accounts.put("홍길동이는 이제 그만나와", 10000);
		accounts.put("홍길동이는 이제 그만나와2", 50000);
		accounts.put("홍길동이는 이제 그만나와3", 90000); // root load? why?
		accounts.put("홍길동이는 이제 그만나와4", 70000);
		
		System.out.println(accounts);
		
		System.out.println();
		System.out.println("홍길동이는 이제 그만나와4 :"+accounts.get("홍길동이는 이제 그만나와4"));
		System.out.println("누구1 :"+accounts.get("누구1")); // 지정 안된 애는 null값 나옴
		
		System.out.println();
		Set<Map.Entry<String, Integer>> s = accounts.entrySet();
		for(Entry<String, Integer> me : s ) {
			System.out.println(me.getKey()+":"+me.getValue());
		}
		
		System.out.println();
		Set<String> ss = accounts.keySet(); // 키만 반환
		for(String key : ss) {
			System.out.println(key + "::" +accounts.get(key)); // get(key)값으로  accounts 밸류값 받아오는
		}
		
		// 맵의 키는 변수명,  값은?  

	}

}

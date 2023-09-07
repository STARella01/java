package day15.quiz;

import java.util.HashMap;

public class CollectionQuiz1 {

	public static void main(String[] args) {
		String[ ] frist_pa = {"leo", "kiki", "eden"};
		String[ ] second_pa = 	{"marina", "josipa", "nikola", "vinko", "filipa"};
		String[ ] third_pa = {"mislav", "stanko", "mislav", "ana"};
		
		String [ ] frist_com = {"kiki", "eden"};
		String	[ ] second_com = {"marina", "josipa", "nikola", "filipa"};
		String [ ] third_com = {"mislav", "stanko", "ana"};
		
		System.out.println("첫번째 사례 :"+solution(frist_pa, frist_com));
		System.out.println("두번째 사례 :"+solution(second_pa, second_com));
		System.out.println("세번째 사례 :"+solution(third_pa, third_com));
	}

	 public static String solution(String[] participant, String[] completion) {
		 String answer = "";	 
		 // Hash Map
		 HashMap<String, Integer> hm = new HashMap<String, Integer>(); // Integer 부분 boolean으로 해도 됨.		 
		 // 참여자 집어넣기
		 for (String player:participant) hm.put(player, hm.getOrDefault(player, 0)+1); // defaultValue 만약에 없으면 0 		 //	+1 하는 이유 =
		 System.out.println("참가자 처리 결과: "+hm);
		 for (String player:completion) hm.put(player, hm.get(player) - 1); // 값을 구분할 수 있음 
		 System.out.println("완주자 처리 결과 :"+hm);
		 for(String key : hm.keySet()) {  // keySet - 컬렉션
			 if(hm.get(key) != 0)  // 키 값이 0이 아닌 애
			 answer = key;
		 }
		 return answer;
	 }
}

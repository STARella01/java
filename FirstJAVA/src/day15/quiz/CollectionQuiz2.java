package day15.quiz;

import java.util.PriorityQueue;
import java.util.Queue;

public class CollectionQuiz2 {

	public static void main(String[] args) {
			
		int[ ] scoville = { 1,2,3,9,10,12 };
		int K = 7;
		System.out.println("음식을 최소 몇 번 섞었을 때 원하는 맵기가 될까?" + solution(scoville, K)); // k값은 임의로 변경 가능함.		
	}
	
	public static int solution(int[] scoville, int K) {
		// 어떤 타입으로 리턴할 건지 미리 정해서 코딩하기
		int answer = 0; // 시도 횟수를 알고싶어
		
		// scoville 값을 저장 : 음식
		PriorityQueue<Integer> que = new PriorityQueue<Integer>();
		for(int i : scoville) {
			que.add(i);
		}
		while(true) {
			answer++; // 첫번째 시도
			//섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째 맵지 않은 음식의 스코빌 지수 * 2)
			int result = que.poll() + (que.poll() * 2); 
			que.add(result);
			
			// 정해진 맵기 K값을 넘어서는 섞은 음식인 경우, 그 회차를 반환한다.
			if(que.peek() >= K )
				return answer;
			
			// K이상으로 만들 수 없는 경우 -1  // 음식 섞었는데 맵기를 충족시키지 못한 경우 - 섞을 음식 없는 데 내가 원하는 값도 안나온 경우
			if(que.size() == 1)
				return -1;			
		}

	}
	
}

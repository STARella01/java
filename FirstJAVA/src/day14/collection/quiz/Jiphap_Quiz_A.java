package day14.collection.quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Jiphap_Quiz_A {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6};
		int[] arr2 = {4,5,6,7,8,9};
		
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		
		for(int i =0; i < arr1.length; i++) {
			list1.add(arr1[i]);
			list2.add(arr2[i]);
			
			System.out.println("ArrayList1 :"+list1);
			System.out.println("ArrayList2 :"+list2);
			
			// 합집합 Union
			ArrayList union = new ArrayList(list1);
			System.out.println(union);
			for(Object o : list2) {
				if(union.contains(o))
					union.add(o);
			}
			System.out.println("합집합 :"+union);
			
			
			// 교집합 Intersection
			ArrayList intersection = new ArrayList();
			for(Object o : list2)
				if(list1.contains(o))
					intersection.add(o);
			System.out.println(intersection);
			
			
			// 차집합1
			// ArrayList diff2 = new.ArrayList();// 1번에 있는 애로
			//2번에 있는 애랑 비교해봤는데
			// if 조건식 추가
			// 거기서 누구를 제거해줘라 remove
			// 그리고 출력 sout
			
			// 차집합2 - 똑같지만 값은 상호 적용
			
			
			
		}

	}

}

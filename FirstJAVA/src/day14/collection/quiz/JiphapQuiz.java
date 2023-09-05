package day14.collection.quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JiphapQuiz {

	private static Collection<? extends Integer> list;

	// ArrayList1 : [ 1, 2, 3, 4, 5, 6 ]
	// ArrayList2 : [ 4, 5, 6, 7, 8, 9 ] 
	
	// 두 리스트의 합집합, 교집합, 차집합을 구해서 출력해 보세요.
	// 합집합 : [1, 2, 3, 4, 5, 6, 7, 8, 9]
	// 교집합 : [4, 5, 6,]
	// 차집합 : [1, 2, 3] ,[ 7, 8, 9]
	
	public static void main(String[] args) {
		
		// ArrayList1, 2 추가한 다음에
		Set<Integer> hi1 = new HashSet();
		hi1.add(new Integer(1));
		hi1.add(new Integer(2));
		hi1.add(new Integer(3));
		hi1.add(new Integer(4));
		hi1.add(new Integer(5));
		hi1.add(new Integer(6));
		
		Set<Integer> hi2 = new HashSet();
		hi2.add(new Integer(4));
		hi2.add(new Integer(5));
		hi2.add(new Integer(6));
		hi2.add(new Integer(7));
		hi2.add(new Integer(8));
		hi2.add(new Integer(9));

        // 결과 출력
        System.out.println("합집합 :"+hi1);
        System.out.println("교집합 :"+hi1);
        System.out.println("차집합 :"+hi1);
		
		// 합집합 
		
		
		// 교집합
		
		
		// 차집합
        
        

	}

}

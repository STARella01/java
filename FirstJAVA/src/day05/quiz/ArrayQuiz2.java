package day05.quiz;

public class ArrayQuiz2 {

	public static void main(String[] args) {
		// numArr의 값들의 총합과 평균을 구해서 출력하세요.
		int[][] numArr = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20},
				{30,30,30}
		};
		
		int sum = 0;
		int items = 0; // 배열의 개수 구하기 위해 선언 - 전체 요소의 개수
		for(int i = 0; i <numArr.length; i++) {
			items += numArr[i].length;
			for(int j = 0; j <numArr[i].length; j++) {
				sum += numArr[i][j];
			}
		}
		System.out.println("총합 : "+sum);
		System.out.println("평균 : "+sum/ (double)items);
		
		
		
		
//		System.out.println(numArr);
//		
//		for(int i = 0; i <numArr.length; i++) {
//			for(int j = 0; j <numArr[i].length; j++) {
//				for(int k = 0; k <numArr[i][j].length; k++) {
//					System.out.println(numArr[i][j][k]);
//				}
//			}
//			System.out.println();
//		}
		

	}

}

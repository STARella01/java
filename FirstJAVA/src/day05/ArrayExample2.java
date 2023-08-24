package day05;

public class ArrayExample2 {

	public static void main(String[] args) {
		// 다차원 배열 - 배열안에 배열이 존재하는 것
		// 1차원 배열 : int를 요소로 가지고 있는 배열
		// 배열이라는 건 저장 공간을 의미 , 배열은 정적인 구조를 가지고 있다. 한 번 정해지면 정해진 사이즈로 배열이 생성된다.		
		int [] number = { 1,2,3,4,5 };
		
		//배열의 요소 : length - 1번 방 (저장공간)
		System.out.println(number[number.length -1]);  //5 나옴
	
		// 2차원 배열 : int[] 인트 배열을 요소로 가지고 있는 배열  - 데이터 타입 다룰 때 사용한다.
		int[][] arr2 = {     // int[1차원][2차원]
				{3,3,3},  // 배열 0
				{4,4,4},  // 배열 1
				{5,5,5},  // 배열 2
				number  // 배열 3 
		};
		
		System.out.println("1 : " + arr2[1][2]);  //4
		System.out.println("2 : " + arr2[2][1]);  //5
		System.out.println("3 : " + arr2[3][arr2[3].length -1]);  // 5 -> 배열의 개수를 정확히 알 수 없을 때 사용
		// System.out.println("4 : " + arr2[3][arr2[3].length -1]);  // 5 -> 배열의 개수를 정확히 알 수 없을 때 사용
		System.out.println("int[]의 개수 : " + arr2.length);
		
		// 2중 for문으로 전체 배열을 출력해 보세요.
		
		// 3차원 배열 : int[][]을 요소로 가지고 있는 배열 - 2차원 배열을 가지고 있음
		// int [][][] arr3 = {arr2, arr2, arr2, arr2}
		int [ ][ ][ ] arr3 = new int[4][ ][ ]; // 2차 배열의 개수가 4개라는 뜻 , 맨처음부분 배열의 개수 의미
		arr3[0] = arr2;
		arr3[1] = arr2;
		arr3[2] = arr2;
		arr3[3] = arr2;
		
		// 4차원 배열 : int[ ][ ][ ]을 요소로 가지고 있는 배열
		int[ ][ ][ ][ ] arr4 = {arr3, arr3, arr3, arr3,};
		
		// n차원 배열 : 배열의 요소로 (n-1)차원 배열을 가지고 있는 배열
		
		// n차원 배열의 모든 요소를 n중 반복문을 사용하여 탐색할 수 있음.
		
		// Q. arr2의 요소들의 값을 알아오는 반복문 작성..
//		int [ ][ ][ ] arr5 = new int[4][4][4];
//		System.out.println(" arr2의 요소들의 값 : " + arr2[4][arr2[3].length -1]);
	
		for(int i = 0; i <arr2.length; i++) {
			for(int j = 0; j <arr2[i].length; j++) {
				System.out.println(arr2[i][j]+"\t");
			}
			System.out.println();
		}
		
		for(int i = 0; i <arr3.length; i++) {
			for(int j = 0; j <arr3[i].length; j++) {
				System.out.print("[");
				for(int k = 0; k <arr3[i][j].length; k++) {
					System.out.println(arr3[i][j][k]);
				}
				System.out.print("],");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		

	}

}

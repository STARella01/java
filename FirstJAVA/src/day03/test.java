package day03;

public class test {

	public static void main(String[] args) {
		// 
		int test1 = (int)(Math.random()*101);
		
		System.out.println("3항 연산의 결과 :" + test1); // 점수에 대한 출력 
		
		if(test1% 2 == 1) {
			System.out.println("홀슈");
		}
		else {
			System.out.println("짝수");
		}
		
	}

}

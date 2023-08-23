package day03;

public class switchExample {

	public static void main(String[] args) {
		// switch(수식) ~ case -> 수식부분은 특정값이 나와야 함.
		// if문으로 구현해도 상관 없지만
		
		int jumsu = (int)(Math.random()*100);
		System.out.println("점수 :" + jumsu);
		
		// Switch
		switch (jumsu/10) {
		case 9:
			System.out.println("당신은 A");
			break; // switch case 구문에 나가야 함.
		case 8:
			System.out.println("당신은 B");
			break; // switch case 구문에 나가야 함.
		case 7:
			System.out.println("당신은 C");
			break; // switch case 구문에 나가야 함.
		case 6:
			System.out.println("당신은 D");			
			break; // switch case 구문에 나가야 함.
		default:
			System.out.println("당신은 F");
			System.out.println("재수강 대상자");
			break;
		}

	}

}

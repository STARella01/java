package day03;

public class IFExample4 {

	public static void main(String[] args) {
		// 중첩 if문
		int jumsu = (int)(Math.random()*110);
		
		System.out.println("점수 :" + jumsu);
		
		if(jumsu >= 90) {
			if(jumsu > 100) {
				System.out.println("잘못 입력된 점수 입니다.");
			}else{
				System.out.println("당신의 학점은 A입니다.");
			}
		}else if(jumsu >= 80) { // 80이상인 경우
			System.out.println("당신은 B");
		}else if (jumsu >= 70) { // 70이상인 경우
			System.out.println("당신은 C");
		}else if (jumsu >= 60) { // 60이상인 경우
			System.out.println("당신은 D");
		}else { // 그 외인 경우
			System.out.println("당신은 F");
			System.out.println("재수강 하시오.");
		}	
			
	}

}

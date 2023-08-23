package day03;

public class IFExample3 {

	public static void main(String[] args) {
		// 다중 if문 : if(조건식) ~ else if(조건식) ~ else
		// 특정 내용을 균등하게 잘라내고 볼 때 사용함
		
		int jumsu = (int)(Math.random()*100); // 해당 순번을 포함하지 않는 미만의 값 여기에서 100을 쓰면 0부터  99까지를 뜻한다.
		
		
		System.out.println("점수 :" + jumsu); // 점수에 대한 출력 
		
		if(jumsu >= 90){ // 90이상인 경우 
			System.out.println("당신은 A");				
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

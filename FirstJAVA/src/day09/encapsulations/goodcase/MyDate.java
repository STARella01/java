package day09.encapsulations.goodcase;

public class MyDate {

	private int day;
	private int month;
	private int year;
	
	// 이제부터 날짜값 제한 만들어 줄거임
	// getter
	public int getDay() {
		return day;
	}
	
	// setter : 입력값 검증해야 함
	public void setDay(int day) {
		//나의 답
//		day = 35;
//		
//		if(day <= 31) {
//			System.out.println("my birth day is" +day);
//		}else{
//			System.out.println("잘못된 입력값");
//		}
//		this.day = day;
		
		//풀이
		if((day < 1) || (day > 31)) {
			System.out.println("잘못된 날짜입니다.");
			this.day = 1; // 0이 나오면 안됨 기본 디폴트값 1로 설정 - 원래는 return시켜야 하는데
							//여기에는 간단한 식으로만 구현해서 일단 디폴트 값 추가해 준 거임.
		}else {
			this.day = day;
		}
		
		
		
	}
	
}

package day08.quiz;

public class Airplane {
	/*
	 *  1. Airplane을 상속 받습니다. 생성자는 이름을 받아서 초기화
	 *  2. flyMode는 int형 변수로 선언합니다.
	 *  3. fly() 메서드를 오버라이딩 합니다.
	 *  	fly() 메서드 안에서는 flyMode가 1이면 "고속 모드로 비행합니다." 출력
	 * 		flyMode가 0이라면, super를 통해 부모님의 메서드를 호출
	 */
	
	String name ;
	
	// 생성자
	public Airplane(String name) {
		this.name = name;
	}
	
	// 메서드
	void takeOff() {
		System.out.println("비행기가 이륙합니다.");
	}
	void fly() {
		System.out.println("일반 모드로 비행합니다.");
	}
	void land() {
		System.out.println("비행기가 착륙합니다.");
	}
}

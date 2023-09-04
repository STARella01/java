package day10.abstract_;

public abstract class Shape { // 추상 클래스 - 부모로써 다형성 표현에 사용
	// 
	private int x;
	private int y;
	
	// 기본 생성자 
	public Shape() { } 
	// 아무것도 없어서 부모가 Object임 - 계층 구조
	
	// x축 y축
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	} 
	
	public abstract double getArea() ; // 추상 메서드 - 구현되어 있지 않음.

	public String position() {
		return "[x="+x+", y="+y+"]";
	}
	
	// 원형 도형
}

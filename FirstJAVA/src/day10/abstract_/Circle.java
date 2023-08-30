package day10.abstract_;

public class Circle extends Shape {
	
	private int radius;
	
	public Circle(int r) {
		this(0, 0, r);
	}
	
	//생성자
	public Circle(int x, int y, int r) {
		super(x,y);
		this.radius = r;
	}

	@Override
	// 원의 넓이 구하기
	public double getArea() {
		return (Math.PI * radius * radius) ; // Math.PI - 원주율 공식
	}
	
	

}

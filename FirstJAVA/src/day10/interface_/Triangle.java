package day10.interface_;

public class Triangle implements Shape {
	
	int width;
	int height;
	
	// 생성자
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	// 추상 메서드라서 반드시 정의해야 함.
	@Override
	public double getArea() {
		// 삼각형 구하기 width * height / 2
		return width * height / 2;
	}

}

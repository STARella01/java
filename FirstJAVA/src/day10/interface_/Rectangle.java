package day10.interface_;

public class Rectangle implements Shape {

	int width;
	int height;
	
	// 생성자
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		// 사각형 구하기 width * height
		return width * height;
	}

}

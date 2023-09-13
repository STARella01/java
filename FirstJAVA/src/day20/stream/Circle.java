package day20.stream;

public class Circle extends Shape {
	
	// 필드
	double r;

	// 생성자
	Circle() {
		this(1); // 이거 뭐임?
	}
	
	Circle(double r) {
		this.r = r;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return (r*r)*Math.PI;
	}

	@Override
	double length() {
		// TODO Auto-generated method stub
		return (r*2)*Math.PI;
	}

	@Override
	public String toString() {
		return "넓이 :"+this.area()+ ",둘레 :"+this.length();
	}
	
}

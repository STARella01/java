package day10.interface_;

public class InterfaceExample {

	public static void main(String[] args) {
		
		Rectangle rect = new Rectangle(20, 34);
		Triangle tri = new Triangle(20, 34);
		
		//tri.
		Shape s1 = new Rectangle(30, 40);

		System.out.println("사각형 : "+rect.getArea() );
		System.out.println("삼각형 : "+tri.getArea() );
		System.out.println("원형 : "+s1.getArea() );

	}

}

package day07;

public class PenCustructorExample {

	public static void main(String[] args) {
		// 생성자 테스트
		Pen redPen = new Pen("red"); // day7에서 생성한 pen class 불러옴
		System.out.println("펜의 색은"+redPen.color+"입니다.");
		
		// day06.Pen // 다른 패키지에 있는 클래스 불러올 때 패키지 명까지 붙여서 불러온다.
		
		Pen pen2 = new Pen("Yellow", 1000);
		System.out.println("펜의 색은"+pen2.color+"이고 \n" + "가격은" + pen2.price + "원 입니다.");
		
		// 자바7 버전이후로 기본 생성자 꼭 만들지 않아도 되는 기능 추가됨. 
	}

}

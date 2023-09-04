package day11.innerClass;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AnnonymousExample {
	
	private Frame f;
	
	public AnnonymousExample() {
		f = new Frame("익명 클래스");
	}
	
	public void launchFrame() {
		// 익명 클래스 사용
		// 익명 클래스는 이름이 없기 때문에 생성자도 가지지 않고, 호출 및 상속을 할 수 없음.
		// 생성자를 가지지 않고 인스턴스를 만들어야 하기 때문에 이미 만들어진 인터페이스나
		// 클래스를 상속 또는 구현해서 만들어야 한다.
		// 내부 클래스와 달리 호출도 필요없는, 여러 번이 아닌 '한 번만 사용'할 클래스에 주로 사용.
		// 또는 클래스 내에 메서드를 재정의 하기 용이해 함수형 프로그램과 비슷하게 활용할 수 있음. (함수형 프로그램 만들 수 있어서 많이 사용)
		// 인터페이스와 익명 클래스를 같이 사용한다면 여러 상황에서 쓰일 수 있는 유틸리티 클래스 만들 수 있음.
		// 한 번만 사용 or 변수에 넣어서 사용
		f.addWindowListener(new WindowAdapter() { // new WindowAdapter() 객체 생성하는 척 했지만 사실 내용 없음.
			//지금 이 순간에만 효과를 발휘하는 애
			// 생성자는없는데 객체는 가짐     
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("닫기");
				System.exit(0); 
			}
		});
		f.setSize(300, 200);
		f.setVisible(true);

	}

	public static void main(String[] args) {
		
	}

}

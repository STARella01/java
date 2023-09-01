package day11.innerClass;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InnerLocalExample {
	
	private Frame f;  // awt frame 생성  // 멤버 변수
	
	public InnerLocalExample() { // 멤버 생성자
		f =new Frame("Inner Local Class");
	}
	
	public void launchFrame() { 
		// Local Inner Class - 메소드 안에다 클래스를 집어 넣는다.  메소드 동작과 같이 시작하고 끝나는 애.
		// 완전한 클래스 형태이기 때문에 클래스와 같은 기능을 한다.
		// 로컬 이너 클래스는 외부에 있는 모든 멤버에 대해서 참조 가능
		// 다만 지역 변수를 참조할 때는 지역변수가 Final로 선언되어야 함.
		// Final
		final String btn = "X버튼";
		
		class MyWindowAdapter extends WindowAdapter{
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println(btn+ "X버튼 누름!");
				// super.windowClosing(e);
				System.exit(0);
			}
		}
		f.addWindowListener(new MyWindowAdapter( ));
		f.setSize(300, 200);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		
		InnerLocalExample le = new InnerLocalExample();
		le.launchFrame();

	}

}

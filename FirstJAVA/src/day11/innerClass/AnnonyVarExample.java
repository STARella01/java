package day11.innerClass;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AnnonyVarExample {
	
	private Frame f;
	
	public AnnonyVarExample() {
		f = new Frame("Annony Variable Class");
	}
	
	// 멤버 변수
	// 익명 클래스 형태로 만들어 짐  WindowAdapter handler = new WindowAdapter() { 정의된 거 없음 };
	WindowAdapter handler = new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("닫기");
			// 창 닫기
			System.exit(0); 
		}
	};

	public void launchFrame() { 
		f.addWindowListener(handler);
		f.setSize(300, 200);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {

	}

}

package day11.innerClass;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.management.loading.PrivateClassLoader;

	// 대표적인 내부 클래스 사용 예제 - JAVA GUI(Graphic user interface)
	// JAVA GUI frame works ?
	// - 프로그램을 그래픽화(프레임창) 시켜 작동 시키는 것을 말함. - AWT(만들기 쉽고 무거움), SWING(만들기 어려운데 가벼움) 패키지
	// - Frame 또는 Jframe 클래스를 이용해서 프레임 창을 구현. 각종 이벤트 및 버튼, 채널, 입력창, 메뉴바, 속성 같은 구성 요소들을
	// 각 클래스들을 이용해서 구현
	// - Frame(A)클래스가 각종 구성요소(B)클래스들을 전부 호출해서 사용 , 구성요소(B) 클래스 들은 각 프레임 창별로 달라지는
	// 형태로 개별 클래스화 하면 여러 측면에 낭비가 일어날 수 있음 -> 때문에 내부클래스 사용.

public class InnerClassExample {

		// 내부 클래스 
		private Frame f; // awt frame 생성  // 멤버 변수
		
		public InnerClassExample() {  // 멤버 생성자
			f = new Frame("Inner 예제");  // 동작 시 해당 프레임 생성
		}
		
		public void launchFrame() {  // 멤버 메서드
			f.addWindowListener(new MyWindowAdapter());  // MyWindowAdaptor - 생성자
			f.setSize(300, 200);
			f.setVisible(true);
		}
	
		public static void main(String[] args) {
	
			InnerClassExample ie = new InnerClassExample();
			ie.launchFrame(); // launchFrame을 실행해라
			
		}
	
		// 멤버 내부 클래스 - 전체 영역이 아닌 창 영역에만 영향을 미친다.
		private class MyWindowAdapter extends WindowAdapter{  //  WindowAdapter은 추상 클래스다 - 기능은 정의되어 있지 않았다.
			// 따라서 처음에 창을 만들었을 때 닫기 이벤트가 실행되지 않았던 것.
			@Override
			public void windowClosing(WindowEvent e) { // WindowAdapter에 있는 윈도우 클로징 버튼을 클릭했을 때 이벤트를 적는다.
				System.out.println("닫기");
				// super.windowClosing(e);
				// 창 닫기
				System.exit(0); 
				// 이전 창들은 이미 무한으로 선언되어서 콘솔에서 꺼야함. // Display Selected Console 창에서 중지 처리하면 됨.
			}
		}//
		// 멤버 내부 클래스는 컴파일 시에 같이 컴파일 되고 온전한 클래스이기 때문에 상속 및 다형성 기능 사용이 가능함.
		// 윈도우 어댑터는 띄워놓은 프레임에 최소, 최대, X등의 버튼을 누르는 이벤트 처리 시 사용.
		// 때문에 프레임을 만들 때 마다 필요하지만, 각 프레임에 종속되어야 하기 때문에 하나의 클래스로 만들기엔
		// 여러가지 제약이 걸린다.
		
}

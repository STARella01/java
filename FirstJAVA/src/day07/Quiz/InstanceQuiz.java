package day07.Quiz;

public class InstanceQuiz {

	/*
	 *  다음에 설명하는 객체에 클래스를 생성하여 확인하세요.
	 *  
	 *  모니터 클래스 객체를 생성 !!
	 *  - 모니터는 해상도, 크기, 밝기, 상태(on/off), 속성을 가짐.
	 *  - 모니터는 기본 해상도, 크기, 밝기 값을 100. 상태는 off
	 *  - 모니터는 버튼을 누르는 메소드, 즉, 전원 on/off 기능이 존재함. 해당 메서드 실행 시 전원이 커져 있다면 꺼지고, 꺼져 있다면 켜져야 함. 
	 *  
	 * */
	
	// 
	// 상태는 논리값 true false
	// 해상도, 크기, 밝기 기본값 100
	// 스캐너 버튼 추가 on 입력 시 - on / off 입력 시 off
	// 
	public static void main(String[] args) {	
		Monitor1 m1 = new Monitor1();
		System.out.println(m1.brightness);
	}
}

class Monitor1{
	int ratio; // 해상도
	int size; // 크기
	int brightness; // 밝기
	boolean onOff=false; // 전원 상태
	
	Monitor1(){
		ratio = 100;
		size = 100;
		brightness = 100;
		onOff = false;
	}
}


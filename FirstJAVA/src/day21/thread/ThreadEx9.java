package day21.thread;

public class ThreadEx9 {

	public static void main(String[] args) {
		// Yield() 메서드 : 동일한 우선순위를 가진 다른 스레드에게 실행 양보
		YieldTread t1 = new YieldTread();
		YieldTread t2 = new YieldTread();

		t1.start();
		t2.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) { }
		
		t1.isContinue = false;  // t1 양보
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) { }
		t1.isContinue = true;  // t1 다시 실행
		
		// 스레드 종료
		t1.isBreak = true;
		t2.isBreak = true;
	}

}

// 스레드 상속받는 클래스
class YieldTread extends Thread{
	boolean isBreak = false;
	boolean isContinue = true;
	
	@Override
	public void run() {
		while(!isBreak) {
			if(isContinue) {
				try {
					Thread.sleep(100);   // 확인 위해 속도 늦춤..
					System.out.println(getName()+"실행 중"); // getName - 스레드 이름 가져옴
				} catch (Exception e) { }
			}else {
				Thread.yield();
			}
		}
		System.out.println(getName()+"종료"); // getName - 스레드 이름 가져옴
	}
}
// 출력된 Thread1 = t2

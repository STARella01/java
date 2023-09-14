package day21.thread;

public class ThreadEx7 {

	public static void main(String[] args) {
		// interrupt() 메서드 : 스레드가 일시정지 상태에 있을 때, interruptException 예외를 발생 시켜서 정상 종료 시킴
		//  sleep() 를 사용하지 않은 상태의 중지
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				int i = 1;
				while(true) {
					System.out.println("t1"+i);
					i++;
					if(Thread.interrupted( )) {  // t1에 interrupt()  실행 메세지에 대한 interrupted( ) 조건 충족
						break;
					}
				}
				System.out.println("스레드 실행 종료");
			}
		});
		
		
		// 메인 스레드 구간 
		t1.start();
		try {
			Thread.sleep(10000);		// 10초
		} catch (InterruptedException e) { }
		t1.interrupt();	// t1에 interrupt() 실행 메세지를 보냄
		// 메인 스레드 구간 끝

	}

}

package day21.thread;

public class ThreadEx6 {

	public static void main(String[] args) {
		// interrupt() 메서드 : 스레드가 일시정지 상태에 있을 때, interruptException 예외를 발생 시켜서 정상 종료 시킴
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					int i = 1;
					while(true) {
						System.out.println("t1"+i);
						Thread.sleep(1000);
						i++;
					}
				} catch (InterruptedException e) { 
					System.out.println("스레드 내에서 일시정지:"+e.getMessage());
				}
				System.out.println("스레드 실행 종료");
			}
		});
		
		
		// 메인 스레드 구간 
		t1.start();
		try {
			Thread.sleep(10000);		// 10초
		} catch (InterruptedException e) { 
			System.out.println("메인에서 일시정지:"+e.getMessage());
		}
		t1.interrupt();					// 일시정지 상태일 때, interruptedExcaption 정상 종료 / 아닐 경우 무시
		// 메인 스레드 구간 끝

	}

}

package day22.thread;

public class ThreadEx12 {

	public static void main(String[] args) {
		// 데몬 스레드 예 
		DaemonThread dt1 = new DaemonThread();
		DaemonThread dt2 = new DaemonThread();

		// 데몬 스레드로 설정
		dt1.setDaemon(true);
		dt2.setDaemon(true);
		
		dt1.start();
		dt2.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) { }
		System.out.println("main 종료");
	}
}

// 데몬 스레드
class DaemonThread extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println(getName());
			try {
				sleep(500);
			} catch (InterruptedException e) { }
		}
	}	
}

// [ 실행 결과 ]
//	Thread-0
//	Thread-1
//	Thread-0
//	Thread-1
//	Thread-0
//	Thread-1
//	Thread-0
//	Thread-1
//	Thread-0
//	Thread-1
//	Thread-0
//	Thread-1
//	Thread-0
//	Thread-1
//	Thread-0
//	Thread-1
//	Thread-0
//	Thread-1
//	Thread-0
//	Thread-1
//	main 종료
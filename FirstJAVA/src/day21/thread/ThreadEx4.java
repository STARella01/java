package day21.thread;

public class ThreadEx4 {

	public static void main(String[] args) {
		// 스레드의 우선순위 설정 SetPriority 사용
		
		Thread t1 = new Thread( ( ) -> { // run( )은 매개변수가 없다.
			
			System.out.println("t1 스레드 시작 ");
			for(int i =0; i<20; i++) {
				System.out.print("t1 :"+i+" ");
			}
		});
		
		Thread t2 = new Thread( ( ) -> { // run( )은 매개변수가 없다.
			System.out.println("t2 스레드 시작 ");
			for(int i =0; i<20; i++) {
				System.out.print("t2 :"+i+" ");
			}
		});
		
		// 우선 순위 설정
		t1.setPriority(7);
		t2.setPriority(3);
		
		// Thread.MAX_PRIORITY		-> 10
		// Thread.NORM_PRIORITY	-> 5
		// Thread.MIN_PRIORITY    	-> 1
		
		t1.start();
		t2.start();
	}

}

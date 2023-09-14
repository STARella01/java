package day21.thread;

public class ThreadEx5 {

	public static void main(String[] args) {
		
		// sleep( ) 메서드 : 지정된 시간까지 일시정지
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i<10; i++) {
					System.out.println("t1 :"+i);
					try {
						Thread.sleep(1000);  // sleep을 만나면 해당 동작하는 스레드는 멈춘다.
					} catch (InterruptedException e) {
						System.out.println(e.getMessage());
					}
				}
				System.out.println("스레드 실행 종료");
				
			}
		});
		t1.start();
		
// 		[실행 결과]
//		t1 :0
//		t1 :1
//		t1 :2
//		t1 :3
//		t1 :4
//		t1 :5
//		t1 :6
//		t1 :7
//		t1 :8
//		t1 :9
//		스레드 실행 종료


	}

}

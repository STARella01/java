package day21.thread;

public class ThreadEx3 {

	public static void main(String[] args) {
		// 람다식 스레드 사용
		Thread t1 = new Thread( ( ) -> { // run은 매개변수가 없다.
			
			System.out.println("t1 스레드 시작 ");
			for(int i =0; i<20; i++) {
				System.out.print("t1 :"+i+" ");
			}
		});
		
		Thread t2 = new Thread( ( ) -> { // run은 매개변수가 없다.
			System.out.println("t2 스레드 시작 ");
			for(int i =0; i<20; i++) {
				System.out.print("t2 :"+i+" ");
			}
		});
		
		// 병렬 처리됨
		t1.start();
		t2.start();
		
	} // main 메소드 끝

}

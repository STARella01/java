package day21.thread;

public class ThreadEx10_1 {

	public static void main(String[] args) {
		
		// 동기화 -> 여러 스레드가 동일한 자원에 접근하여 사용하는 경우에
		// 서로 영향을 줄 수 있는 상황이 된다. 때문에 동기화를 통해서 사용하는 자원에 접근을
		// 제한하여 작업이 종료되기 전에 접근할 수 없게 하는 것.
		 
		// 게임 객체 생성
		SmartPhoneGame game = new SmartPhoneGame();
		
		// 플레이어1 객체 생성 후 스레드 실행
		Player1 p1 = new Player1();
		p1.setSmartPhoneGame(game);
		p1.start();
		
		// 플레이어2 객체 생성 후 스레드 실행
		Player2 p2 = new Player2();
		p2.setSmartPhoneGame(game);
		p2.start();

	}

}

// 스마트폰 게임 클래스
class SmartPhoneGame{
	private int level;
	
	public int getLevel() {
		return this.level;
	}
	
// 	public synchronized void increaseLevel( ) {  // 메서드에 동기화 설정하는 방식
	public void increaseLevel(){
		
		synchronized (this ) { // synchronized 블럭 설정 시작!  // this 부분은 클래스가 들어옴 즉, SmartPhoneGame class가 들어온다
			// 블럭 설정하는 방법 
			while(true) {
				this.level ++;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) { }
				
				// 현재 스레드의 이름과 레벨 출력
				System.out.println(Thread.currentThread().getName()+"Level :"+this.level);
				
				// 레벨이 5가 되면
				// if(this.level % 10 == 0) break;
				if(this.level == 5 ) {
					notifyAll( ); // 알림 깨움 - 스레드에게 준비하라고 알려줌 -> 현재 대기 상태인 모든 스레드를 실행 중 상태로 전환
					// notify( ) -> 현재 대기 상태인 스레드들 중 하나만 실행 중으로 상태 전환. 단, 직접 지정 불가
					try {
						wait( );	// 그리고 잠든다. -> 현재 실행 중인 스레드를 대기 상태로 전환
					} catch (InterruptedException e) { } 
					break;
				}
				
				// 레벌이 10의 배수가 되면 종료 
				if(this.level % 10 == 0) break;
			}
		} // 동기화 블럭 끝

	}// ==increaseLevel end==
}

class Player1 extends Thread{
	private SmartPhoneGame game;
	
	public void setSmartPhoneGame(SmartPhoneGame game) {
		this.setName("Player1");
		this.game = game;
	}
	@Override
	public void run() {
		game.increaseLevel();
	}
}

class Player2 extends Thread{
	
	private SmartPhoneGame game;
	
	public void setSmartPhoneGame(SmartPhoneGame game) {
		this.setName("Player2");
		this.game = game;
	}
	@Override
	public void run() {
		game.increaseLevel();
	}
	
}

// 게임기 하나에 2명의 플레이어가 나눠쓰는 상황

package day22.thread;

public class ThreadEx11 {

	public static void main(String[] args) {
		// 생산 스레드와 소비 스레드 예시
		// 통장에 돈이 입금 되어야 출금 가능
		// 입금은 잔액이 없어야 입금 가능
		
		// 통장 객체 생성 -> 1개 엄마와 아들이 공통으로 사용하는 자원 -> 그래서 싱크로나이즈드 사용
		Account acc = new Account();
		// 엄마 스레드 객체 생성
		Mother mother = new Mother(acc);
		// 아들 스레드 객체 생성		
		Son son = new Son(acc);
		
		mother.start();
		son.start();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {

		} // 스레드 중지
		son.interrupt();
		mother.interrupt();
		// 인터럽트로 빠져나갈 경우 : 
	
		System.out.println("main 종료");
		System.exit(0);  // 프로세스 종료
	}

}

// 통장 클래스 
class Account {
	// 필드
	int money;
	
	synchronized void withdraw() {
		while(money == 0) {  // 돈이 0원이 되면 멈춰라 
			try {
				wait();
			} catch (InterruptedException e) { break; }

		}
		notifyAll();
		System.out.println(Thread.currentThread().getName()+money+"원 출금");
		
		money = 0; // 출금 -> 집어넣는 즉시 바로 다 뺀다.
	}
	
	synchronized void deposit() {
		while(money > 0) {
			try {
				wait();
			} catch (InterruptedException e) { break; }
		}
		// 랜덤 입금 1 ~ 5 만원
		money = (int)((Math.random()*5)+1)*10000;
		notifyAll();
		System.out.println();
		System.out.println(Thread.currentThread().getName()+money+"원 입금");
	}
	
}

// 엄마 스레드
class Mother extends Thread{
	
	// 필드
	Account account;
	
	// 객체
	public Mother(Account account) {
		super("엄마");  // super는 스레드 의미
		this.account = account;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				account.deposit();
				sleep((int)(Math.random()*20000));  // 랜덤하게 나온 시간에 
			} catch (InterruptedException e) { break; }
		}
	}
	
	
}

// 아들 스레드
class Son extends Thread{
	// 필드
	Account account;
	// 객체
	Son(Account account){
		super("아들");
		this.account = account;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				account.withdraw();
				sleep((int)(Math.random()*300));  
			} catch (InterruptedException e) { break; }
		}
	}
}

// [ 실행 결과 ]
//	엄마50000원 입금
//	아들50000원 출금
//	main 종료
//	아들0원 출금
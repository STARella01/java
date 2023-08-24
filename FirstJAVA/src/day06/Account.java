package day06;

public class Account {
	
	// 실 객체를 클래스로 만드는 과정을 '객체 추상화'라고 함.
	
	// 객체 : 1) 기능을 위한 객체, 2) 데이터 저장을 위한 객체
	// Account (은행 계좌)
	// - 명사적 특성 (속성) : 계좌명, 계좌번호, 비밀번호, 잔액, 이자 ...
	// - 동사적 특성 (기능) : 예금하다, 출금하다, 잔액조회 / 이체(출금 후 입금)

	// 변수 선언 (멤버 변수 - 속성) / 명사적 특성
	public String name;
	public String accountNumber;
	public String passwd;
	public long balance;
	public float interst;
	
	// 메서드 선언(기능) / 기능적 특성
	// 예금 입금하다
	public void saveMoney(long amount) {
		balance = balance+amount; // balance += amount;
	}
	//출금하다
	public void withdrawMoney(long amount) {
		balance = balance-amount; // balance += amount;
	}
	//잔액확인
	public long getBalance() { // 정보 출력이라 매개 변수 필요 없음
		return balance;
	}
	
	
	
}

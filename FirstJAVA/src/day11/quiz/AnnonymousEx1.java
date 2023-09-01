package day11.quiz;

public class AnnonymousEx1 {

	public static void main(String[] args) {
		
		Machine tv = new TV("TV");
		Machine computer = new Machine();
		
		// tv
		Machine.machineWork(new Remocon() {
			// 익명 클래스
			@Override
			public void on() {
				System.out.println(tv.getName()+"를 켭니다.");
			}
			
			@Override
			public void off() {
				System.out.println(tv.getName()+"를 끕니다.");
			}
		}, tv); 
		
		// computer
		Machine.machineWork(new Remocon() {
			
			@Override
			public void on() {
				System.out.println("컴퓨터를 켭니다.");
			}
			
			
			@Override
			public void off() {
				System.out.println("컴퓨터를 끕니다.");
			}
		}, computer);
		
	}

}

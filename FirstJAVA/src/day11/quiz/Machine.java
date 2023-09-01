package day11.quiz;

public class Machine {
	
	//public으로 해도 됨
	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public static void machineWork(Remocon remocon, Machine machine) { 
		remocon.on(); // 리모콘의 on( ) 메서드
		remocon.off(); // 리모콘의 off( ) 메서드
	}
	
	// 잠온다...
	
	
	

}

package day21.thread;

public class ProcessEx {

	public static void main(String[] args) {
		// 자바에서 다른 프로그램의 프로세스를 실행할 수 있는 방법
		try {
			// Process p1 = Runtime.getRuntime().exec("cmd.exe"); 
			
			// 메모장 실행
			Process p1 = Runtime.getRuntime().exec("notepad.exe");
			// System.out.println(p1.pid());   pid확인용으로 선언
			
			// 그림판 실행
			Process p2 = Runtime.getRuntime().exec("mspaint.exe");
			
			//  위치에 따라 결과값에 큰 영향을 미침
			p1.waitFor(); //  p1프로세스가 종료될 때까지 대기 
			p2.destroy(); // p1프로세스가 종료되면 실행   
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

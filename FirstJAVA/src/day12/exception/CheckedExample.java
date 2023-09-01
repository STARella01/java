package day12.exception;

import java.io.IOException;

// Checked Exception의 경우에는 반드시 예외처리해야 함.
// 올바르게 설계되어 있더라도 사용자가 잘못된 값을 입력하면 예외가 발생할 수 있음.
// ex )) IOException, FileNotFoundException, SQLException

public class CheckedExample {

	
	// 메인이 예외를 처리할 수 없으면 종료됨.
	public static void main(String[] args) {
		System.out.println("값을 입력받는 프로그램!!");
		
		byte[] data = new byte[100]; // 한 번에 100바이트 씩 받겠다. // 한 번에 처리할 개수 지정
		
		try {
			System.in.read(data); // read 키보드 입력값 읽어들임	
		}catch(IOException ie){
			ie.printStackTrace();
		}
		System.out.println("입력한 문자열은 :           ");
		System.out.println(new String(data).trim()); // trim 불필요한 내용 다 잘라내겠다는 뜻
	}

}

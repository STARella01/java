package day12.exception;

import java.io.FileInputStream;
import java.io.IOException;

public class AutoResourceManagerExample {

	public static void main(String[] args) {
		
		// 지역변수 나가면 없어짐 -> 자동으로 자원 정리해줌
		try (FileInputStream in = new FileInputStream("a.txt")){  // java.io.FileNotFoundException
			System.out.println("read data : "+in.read());  // 파일 읽어 들이겠다. // 이게 있으면 exception 처리해줘야 한다는 얘기
		} catch (NullPointerException | IOException ex) { // import 되어야 한다. // NullPointerException 또는 IOException 
			//System.out.println(in)  // in - 변수 참조 못함. - 지역 변수로 선언되어 사용되고 있기 때문에
			System.out.println("예외 처리합니다.");
			System.out.println(ex.toString());
		}

		// try catch 전에 선언
		FileInputStream in2 = null;
		try {
			in2 = new FileInputStream("a.txt");
			System.out.println("read data : " + in2.read());
		} catch (NullPointerException ex) {
			System.out.println("예외처리 합니다.");
			System.out.println(ex.toString( ));
		}catch (IOException ex) {
			System.out.println(in2);
			System.out.println("예외처리 합니다.");
			System.out.println(ex.toString( ));
		}finally {
			try { in2.close(); } catch( IOException e ){ }
			//in2.close(); - 만약 이렇게 사용하면 입출력 입력 사항 쓰라고 에러 뜸
		}
		
		
		

	}

}

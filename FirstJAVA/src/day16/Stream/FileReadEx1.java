package day16.Stream;

import java.io.File;
import java.io.FileReader;

public class FileReadEx1 {

	public static void main(String[] args) {
		// 
		File f = new File("D:\\Develop\\java\\FirstJAVA\\file\\w.txt");
		
		FileReader in = null;
		
		try {
			in = new FileReader(f);
			while(true) {
				int data = in.read();
				// System.out.printf("%X",data); // 16진수로 확인하려는 경우
				System.out.print((char)data);  // character로 불러와서 2바이트 씩 읽어오기 때문에 깨질 일이 없음.
				if(data == -1) {
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace(); // 예외 정보 출력 메소드 e.printStackTrace()
		}finally {
			try {in.close();} catch (Exception e2) { e2.printStackTrace(); }
		}

	}

}

package day16.Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamEx1 {

	public static void main(String[] args) {
		// 
		InputStream fis = null;
		
		try {
			// FileInputStream (읽을 파일의 경로)
			fis = new FileInputStream("D:\\Develop\\java\\FirstJAVA\\file\\test.txt");
			byte[ ] buffer = new byte[ 1000 ]; // 1000바이트 씩 덩어리로 읽으라고 명령
			String content = "";
			while(true) { // 데이터 사이즈 정확히모르기 때문에
//				int data = fis.read(); // 1바이트씩 데이터를 읽어들임 , 마지막 끝까지 읽음
//				System.out.println(data); // 문자 깨지는 이유 1바이트 씩 받아와서..
//				System.out.println((char)data); 	// read() 1바이트 씩 읽기 , char는 2바이트 짜리 
				
				int data = fis.read(buffer); // 지금까지 읽은 데이터의 크기
				System.out.println(data);
				
				if (data != -1) content = new String(buffer , 0, data);
				else break;
				/*if(data == -1) // 데이터가 -1인 경우, 더 이상 데이터가 없는 경우
					break;*/
				System.out.println(content);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("해당 경로의 파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("파일을 읽을 수 없습니다.");
		}
		finally {
			try {
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	} // next byte data 읽은 데이터 개수
	// 어딘가에 저장해놓고 
	
}

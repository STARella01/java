//package day16.Stream;
//
//import java.io.FileInputStream;
//import java.io.InputStream;
//
//public class FileInputStreamEx2 {
//	
//	public static void main(String[] args) {
//		int readCount = 0;	
//		// 입력 스트림 객체 생성
//		InputStream fis = null;
//		try {
//			fis = new FileInputStream("D:\\Develop\\java\\FirstJAVA\\file\\test.txt");
//			
//			// 입력할 데이터를 저장할 변수 선언
//			byte[ ] buffer = new byte[256]; // 배열이기 때문에 heap에 생성
//			int readCount = fis.read(buffer); // read 처음 블록을 읽기 buffer에 저장
//			while(readCount != -1) {
//				String data = new String(buffer, 0, readCount);
//				System.out.println(data);
//				readCount = fis.read(buffer);
//			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally {
//			try { fis.close(); } catch (Exception e2) { e2.printStackTrace(); }
//		}
//
//	
//		
//	}
//	
//}

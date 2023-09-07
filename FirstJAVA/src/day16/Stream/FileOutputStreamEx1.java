package day16.Stream;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileOutputStreamEx1 {

	public static void main(String[] args) {
		// 문자열을 입력 받아서 해당 문자열을 파일로 내보내기
		
		// Scanner로 입력
		Scanner scan = new Scanner(System.in);
		System.out.println("파일명을 입력하세요.");
		String name = scan.next();
		
		// 빈 객체 선언
		OutputStream fos = null;
		// checked exception
		try {
			// fileOutputStream
			fos = new FileOutputStream("D:\\Develop\\java\\FirstJAVA\\file\\"+name+".txt");  // \는 escape 문자라서, \\
			System.out.println("문장 입력 :");
			scan.nextLine(); // 버퍼 정리를 위해 추가
			String str = scan.nextLine();	
			
			byte[ ] bs = str.getBytes(); // 1글자당 2byte - 바이트 형태로 전달하기 위해 사용
			
			fos.write(bs); // 파일을 쓰는 OutputStream 주 메서드
			System.out.println("파일이 정상적으로 저장되었습니다.");
			
		} catch (Exception ie) {
			ie.printStackTrace();
		}finally {
			try {
				fos.close();
				scan.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}

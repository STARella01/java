package day16.quiz;

import java.io.File;
import java.io.FileReader;

public class FileQuiz {

	public static void main(String[] args) {
		// 	
		File f = new File("D:/filetest4/서시.txt"); // 절대 경로
		File dir = new File("./"); // 현재 디렉터리   .은 현재 , /은 디렉터리 - // 상대 경로
		
		// 1번 
		System.out.println("isDirectory? "+f.isDirectory());
		System.out.println("isDirectory? "+dir.isDirectory());
		
		// D:\\fileset5\\testFile\\temp\\ 을 생성
		File dst = new File("D:\\fileset5\\testFile\\temp");
		try {
			dst.createNewFile();
		} catch (Exception e) {
				e.printStackTrace();
				System.out.println("파일 생성 중 에러가 발생하면 나오는 곳!!");
		}
		// 만약에 해당 폴더가 없으면 생성하기
		if(!dst.exists()) {
			dst.mkdirs();				
		}
		
		// 특정 디렉터리로 파일을 이동
		File test = new File("D:\\filetest4\\서시.txt");
		File dst1 = new File("D:\\fileset5\\testFile\\temp\\서시.txt");
		test.renameTo(dst1);

		// 3번 서시 txt를 console에 출력
		File f1 = new File("D:\\fileset5\\testFile\\temp\\서시.txt");
		FileReader in = null;
		
		try {
			in = new FileReader(f1);
			while(true) {
				int data = in.read();
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

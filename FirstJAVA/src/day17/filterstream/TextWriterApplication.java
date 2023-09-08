package day17.filterstream;

import java.io.File;
import java.io.FileOutputStream;

public class TextWriterApplication {

	public static void main(String[] args) {
		
		String data1 = "홍길동,M,hgd@gmail.com,30";	// ", 콤마"는 필드, 컬럼 구분자
		String data2 = "차은우,F,hgd2@gmail.com,25";	// "\n" 은 행 즉, 레코드 구분자
		
		File f= new File("D:\\Develop\\java\\FirstJAVA\\file\\"+"customer.txt");
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(f);
			fos.write(data1.getBytes());
			fos.write('\n'); // 레코드 구분자
			fos.write(data2.getBytes());
			System.out.println("File Saved!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(fos != null) try { fos.close(); } catch (Exception e2) { } 
		}

	}

}

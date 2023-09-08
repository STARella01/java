package day17.filterstream;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import util.Closer;

public class DataWriteApplication {

	public static void main(String[] args) {
		
		// 파일 객체 만들기 - 파일경로및디렉토리  위해
		File file= new File("D:\\Develop\\java\\FirstJAVA\\file\\"+"customer.data");
		
		// 노드 스트림
		FileOutputStream fos = null;
		// 필터 스트림 - Data
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);
			// DataInput / OutputStream은 데이터를 순서대로 추가 , 불러올 때도 순서대로 불러야 함.
			dos.writeUTF("홍길동"); dos.writeChar('M'); dos.writeUTF("hgd@gmail.com"); dos.writeInt(30);  // dos.writeChar('M'); - 한 글자니까 char
			dos.writeUTF("차은우"); dos.writeChar('F'); dos.writeUTF("hgd2@gmail.com"); dos.writeInt(25);
			System.out.println("File Saved!");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(dos != null) Closer.close(dos);
			if(fos != null) Closer.close(fos);
		}
		
		// 출력하기
		
		
		

	} // 메인 메서드

}

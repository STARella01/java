package day17.filterstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import util.Closer;

public class StringInputExample {

	public static void main(String[] args) {
		// 한 줄 씩 입력 받아서 내용을 저장
		File file= new File("D:\\Develop\\java\\FirstJAVA\\file\\"+"stringline.txt");
		//
		InputStreamReader isr = null;	// 키보드 입력값 처리 - String line으로 출력할거임!!
		BufferedReader br = null;			// 	
		// 파일 저장
		FileOutputStream fos = null;
		//
		OutputStreamWriter osw= null;
		BufferedWriter bw = null;
		
		String inputString;
		System.out.println("저장할 내용을 입력 후 ctrl+z를 눌러주세요.");
		try {
			isr = new InputStreamReader(System.in);  	// byte를 char로 변경해준다.
			br = new BufferedReader(isr);
			
			// 파일저장
			fos = new FileOutputStream(file);				// 노드 스트림으로 파일 받음.	byte
			osw = new OutputStreamWriter(fos);			// 노드 스트림으로 파일 받음.	byte를 char로 바꾼다.
			bw = new BufferedWriter(osw);					// 노드 스트림이 또 다른 노드 스트림을 받을 수 있다는 의미
			
			//입력 받기
			while((inputString = br.readLine()) != null) {				
				bw.write(inputString+"\n");
				// bw.newLine();  // \n 안쓰고 이거 써도 됨.
			} 
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(br != null) Closer.close(br);
			if(bw != null) Closer.close(bw);
		}

	}
	// 실행 정상 종료	ctrl + z
	// break 				ctrl+c    / ctrl + pause break 키 눌러도 됨..
	
}

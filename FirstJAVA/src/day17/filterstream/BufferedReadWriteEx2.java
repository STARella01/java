package day17.filterstream;

import java.io.*;  // 이렇게 선언하면 따로 import할 필요가 없다.  

public class BufferedReadWriteEx2 {

	public static void main(String[] args) {
		// 작성된 텍스트를 저장 읽어오기
		String htmlCode ="<html><head><style> \n";
		htmlCode +="div{	\n"
					+ " width : 100px; \n"
					+ " height : 100px; \n"
					+ "color : white;"
					+ "background : red; \n"
					+ "padding : 50px; \n"
					+ "font-size : 30px; \n"
					+ "}\n";
		htmlCode += "</style></head><body>";
		htmlCode += "<div>Hello World!!</div>";
		htmlCode += "</body></html>";
		
		FileReader input = null;
		FileWriter	 output = null;
		BufferedReader bufInput = null;
		BufferedWriter	bufoutput = null;
		
		try {
			String path = "D:\\Develop\\java\\FirstJAVA\\file\\index.html";
			
			// 노드 스트림
			output = new FileWriter(path);
		
			// 필터 스트림
			bufoutput = new BufferedWriter(output);
		
			
			// 반환
			while(path != null) {		// line 내용이 비어있지 않다면
				bufoutput.write(path, 0, path.length()); // 복사하는 것..
				bufoutput.newLine(); // 줄바꿈 \n을 입력한 것과 같음
			}
						
			
			System.out.println(path);
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(bufInput != null) 
				try {bufInput.close();} catch (Exception e2) { } // close가 없으면 파일 안 닫힘.
			if(bufInput != null) 
				try {bufoutput.close();} catch (Exception e) { }
		}
		
	}

}

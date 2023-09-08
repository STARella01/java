package day17.filterstream;

import java.io.*;  // 이렇게 선언하면 따로 import할 필요가 없다.  

public class FilterStreamExample {

	public static void main(String[] args) {

		FileReader input = null;
		FileWriter	 output = null;
		BufferedReader bufInput = null;
		BufferedWriter	bufoutput = null;
		
		try {
			String inFile = "D:\\Develop\\java\\FirstJAVA\\file\\test.txt";
			String outFile = "D:\\Develop\\java\\FirstJAVA\\file\\test_out.txt";
			
			// 필터스트림은 대상이 노드 스트림을 대상으로 한다.
			// 노드 스트림
			input = new FileReader(inFile);
			output = new FileWriter(outFile);
		
			// 필터 스트림
			bufInput = new BufferedReader(input);
			bufoutput = new BufferedWriter(output);
			
			String line;
			line = bufInput.readLine(); // 한 번에 한 라인씩 읽어준다. - 문자열에 \n을 만날 때까지 입력
			System.out.println(line); // test.txt 파일에 줄이 넘어가기 전까지(enter) 첫줄 부분을 출력
			
			// 반환
			while(line != null) {		// line 내용이 비어있지 않다면
				bufoutput.write(line, 0, line.length()); // 복사하는 것..
				bufoutput.newLine(); // 줄바꿈 \n을 입력한 것과 같음
				line = bufInput.readLine();	
			}
			System.out.println(inFile + ">>"+outFile); // 인파일에 있는 내용을 아웃파일로 처리 한다.
			
			
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
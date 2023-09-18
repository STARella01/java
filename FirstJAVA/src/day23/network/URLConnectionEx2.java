package day23.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class URLConnectionEx2 {

	public static void main(String[] args) {
		
		// URL Connection 예제2
		
		URL url = null;
		String address = "https://www.egovframe.go.kr/EgovIntro.jsp?menu=1&submenu=1";
		// String address = "https://www.egovframe.go.kr/home/sub.do?menuNo=9";
		
		
		BufferedReader br = null;
		String readline = "";
		try {
			url = new URL(address);
			br = new BufferedReader(
					new InputStreamReader(url.openStream()) // HTTP URL Connection 내에 있는 httpInputStream 불러옴.
					// getContent로 body 내용 받아온 것.
					// getContent 내용을 받아와서 text 형태로 변경해야 하니까
					// reader로 읽어들여서 그 값을 처리한다. -> openStream 얘가 그것들을 간단히 처리해주는 애임.
					);
			while( ( readline = br.readLine( ) ) != null ){	//  readline = br.readLine() 아니라면 다음 내용 반복
				System.out.println(readline);	
			}
			
		} catch (Exception e) {
				System.out.println(e.getMessage());
		}
		
	}  // main 메서드 

}

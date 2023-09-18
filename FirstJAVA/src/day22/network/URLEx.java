package day22.network;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

public class URLEx {

	public static void main(String[] args) {
		
		// URL 클래스
		
		try {
			URL url = null;
			url = new URL("https://www.egovframe.go.kr/EgovIntro.jsp?menu=1&submenu=1");
			System.out.println("authority : "+url.getAuthority());
			System.out.println("content : "+url.getContent());
			System.out.println("host : "+url.getHost());
			System.out.println("port : "+url.getPort());
			System.out.println("path : "+url.getPath());
			System.out.println("file : "+url.getFile());
			System.out.println("query : "+url.getQuery());
			
			// url 정보 통해서 
			int data = 0;
			try {
				Reader is = new InputStreamReader(url.openStream()); // 열었을 때 저장되는 주소를 읽어들여서 :url.openStream() 텍스트로 전환:InputStreamReade
				while((data = is.read()) != -1) { // -1나오면 더이상의 데이터는 없다
					System.out.print((char)data); //
				}
				System.out.println();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}

	}

}

// [ 실행 결과 ]

//	authority : www.egovframe.go.kr
//	content : sun.net.www.protocol.http.HttpURLConnection$HttpInputStream@2ea6137
//	host : www.egovframe.go.kr
//	port : -1
//	path : /EgovIntro.jsp
//	file : /EgovIntro.jsp?menu=1&submenu=1
//	query : menu=1&submenu=1


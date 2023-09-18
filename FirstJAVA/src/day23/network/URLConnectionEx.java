package day23.network;

import java.net.URL;
import java.net.URLConnection;

public class URLConnectionEx {

	public static void main(String[] args) {
		
		// URL Connection 예제
		
		URL url = null;
		String address = "https://www.egovframe.go.kr/EgovIntro.jsp?menu=1&submenu=1";
		// String address = "https://www.egovframe.go.kr/home/sub.do?menuNo=9";
		
		
		try {
			url = new URL (address);
			URLConnection conn = url.openConnection(); // URLConnection은 추상 클래스 A  // openConnection 연결 정보에 대한 객체 정보 반환
			System.out.println("conn.toString() : " +conn);
			System.out.println("getAllowUserInteraction() : "+conn.getAllowUserInteraction()); // 사용자와 관련된 유저인터렉션은 false 허용되어 있지 않다.
			System.out.println("getConnectionTimeOut() :"+conn.getConnectTimeout()); // 0 타임 아웃이 설정되어 있지 않다는 뜻
			System.out.println("getContent( ) : "+conn.getContent()); //  getContent는 오브젝트 기본적으로는 텍스트지만 바이너리 정보도 들어가기 때문에 오브젝트
			System.out.println("getContentExcoding() :"+conn.getContentEncoding());	// 지금 현재 설정된 인코딩 설정값은?
			System.out.println("getContentLength() : "+conn.getContentLength());	// 데이터 값이 없어서 -1 출력됨 // getContent는 바디부분을 의미
			System.out.println("getContentType() :"+conn.getContentType());	// getContentType() :text/html;charset=UTF-8
			System.out.println("getData() :"+conn.getDate());		// 1970년01월01일 00시 그리니치 천문대의 0시 0분 기준 한국은 +9  // 1694999901000 뒤에 000빼고 계산해야 한다.
			System.out.println("getDefaultUseCaches() :"+conn.getDefaultUseCaches()); // 캐시 사용 여부 확인
			System.out.println("getDoInput() :"+conn.getDoInput());	// boolean 타입
			System.out.println("getDoOutput() :"+conn.getDoOutput()); // boolean 타입
			
			System.out.println("getExpiration() :"+conn.getExpiration()); // 
			System.out.println("getHeaderFields() : "+conn.getHeaderFields());
			
			System.out.println("getIfModifieldSince() :"+conn.getIfModifiedSince());
			System.out.println("getIfModifieldSince() :"+conn.getLastModified());
			
			System.out.println("getReadTimeOut() :"+conn.getReadTimeout());
			System.out.println("getURL() :"+conn.getURL());
			System.out.println("getUseCaches(): "+conn.getUseCaches());
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}

	}  // main 메서드 

}

// proxy 드러나지 않고 대리로 , 대리인에게 위임장을 건내주는 것 / 그래서 프록시 서버가 있었구나
// 실제 중요한 장비들을 숨기기 위해 사용, 너무 많은 개체가 있을 경우 , 캐시 서버같은 것(  )
// VPN도 프록시의 일종이라고 보면 됨.

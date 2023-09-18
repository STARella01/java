package day22.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	public static void main(String[] args) {
		
		// InetAddress 클래스
		
		// Checked Exception
		try {
			// getByName 메서드로 InetAddress 객체 생성  - 그 중 하나 추려냄
			InetAddress ip = InetAddress.getByName("www.naver.com"); // ip 223.130.200.107 -> 프록시 서버
			// DNS가 ip주소를 인간들이 알아보기 쉽게 도메인으로 제공해주는 것이다.
			// ip 주소는 여러 개이며, 그 중 하나가 제공된다.
			// ip는 특정 위치에 있는 주소에 가는 여러가지 방법으로 생각하면 됨. 
			System.out.println("host name "+ip.getHostName());
			System.out.println("ip "+ip.getHostAddress());
			
			// getAllByName( ) 메서드 InetAddress 객체 배열 생성 - 다 보여줌
			InetAddress[] ips = InetAddress.getAllByName("www.naver.com");
			for(InetAddress i : ips) {
				System.out.println("ip주소 "+i);
			}
			
			// ip 주소값을 byte[ ] 배열로 리턴
			byte[ ] ipAddr = ip.getAddress(); //
			// byte 자료형의 표현 범위 -128(1000 0000) ~ 127(0111 1111) 비트로 따져서 (정확히는 -128이 맞지만 정수표시하면 128로도 씀)
			for (byte b : ipAddr) {
				System.out.print(((b < 0) ? b+256 : b)+".");
			}
			System.out.println();
			
			// getLocalHost() 메서드 InetAddress 객체 생성 호출
			InetAddress local = InetAddress.getLocalHost();  // getLocalHost 자기 자신이기 때문에 주소 정보 필요 X
			System.out.println("내 컴퓨터 ip : "+local);
			
			// getByAddress( ) 메서드로 InetAddress 객체 생성 호출
			InetAddress ip2 = InetAddress.getByAddress(ips[0].getAddress());
			System.out.println(ips[0].getHostName()+"주소 : "+ip2);
			
			
		} catch (UnknownHostException e) {
			System.out.println(e.getMessage());
		}

	}

}

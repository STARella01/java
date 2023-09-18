package day23.network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class BroadCastEx1 {

		// 동일한 포트번호 가진 서버가 2개 있어야 사용 가능		
		public static void main(String[] args) {
			//  UDP Server ... DatagreamSocket DatagramPacket

			try {
				// 서버
				DatagramSocket socket = new DatagramSocket(9000); // 수신
				socket.setBroadcast(true); // 브로드 캐스트를 사용하기 윈한 설정
				
				DatagramPacket inPacket;		// 보낼 데이터		
				byte[] inMsg = null;
				
				while(true) {
					// 데이터를 받기 위한 바이트 배열 생성
					inMsg = new byte[1024];  // 최대 1024까지
					
					// DatagramPacket 객체 생성
					inPacket = new DatagramPacket(inMsg, inMsg.length);  // 1024 크기 데이터를 처리
					
					// 패킷 데이터 수신
					socket.receive(inPacket);	// 
					// 문자열로 저장
					String msg = new String(inMsg, 0, inPacket.getLength());
					System.out.println("클라이언트 메세지 :"+msg);	// 화면에 출력해 줘
					
					// 클라이언트 아이피
					InetAddress address = inPacket.getAddress();	// 
					// 클라이언트 포트
					int port = inPacket.getPort();
					System.out.println("클라이언트 주소 : " +address);
					System.out.println("클라이언트 포트번호 : "+port);
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		} // main 메서드 
}

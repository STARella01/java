package day23.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {

	public static void main(String[] args) {
		// UDP Client
		try {
			BufferedReader sysin = new BufferedReader(new InputStreamReader(System.in));
			// 서버 아이피 (127.0.0.1) -> 로컬 호스트 (localhost)
			// InetAddress serverIP = InetAddress.getByName("127.0.0.1");	// 유니 캐스트
			// InetAddress serverIP = InetAddress.getByName("255.255.255.255"); // 브로드 캐스트 주소
			InetAddress serverIP = InetAddress.getByName("230.0.0.1");
			while(true) {
				// 한 줄 읽기
				String data = sysin.readLine();
				DatagramSocket dataSocket = new DatagramSocket();
				// 문자열을 바이트 배열에 저장
				byte[] msg1 = data.getBytes();
				
				// 서버로 전송 ( 데이터, 데이터 길이, 서버아이피, 포트 넘버 )
				DatagramPacket outpaPacket = new DatagramPacket(msg1, msg1.length, serverIP, 9000);
				dataSocket.send(outpaPacket);
				// 소켓 닫기
				dataSocket.close();
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}  // main 메서드 

}

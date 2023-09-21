package day23.network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.util.Scanner;

public class UDPClient {
   
   public static void main(String[] args) {
      // UDPClient
      System.out.print("닉네임을 입력해주세요 > ");
      Scanner sc = new Scanner(System.in);
      String name =sc.next();
      
      try {
         // 키보드 입력
         BufferedReader sysin = new BufferedReader(new InputStreamReader(System.in));
         // 서버 아이피 (127.0.0.1 -> 로컬 호스트 (localhost))
//         InetAddress serverIP = InetAddress.getByName("127.0.0.1");   // 유니캐스트
//         InetAddress serverIP = InetAddress.getByName("255.255.255.255");   // 브로드캐스트 주소
         InetAddress serverIP = InetAddress.getByName("230.0.0.1");   // 멀티캐스트 주소
         
			ServerSocket serverSocket = new ServerSocket();
            InetAddress inetAddress = InetAddress.getLocalHost();
            String localhost = inetAddress.getHostAddress();
 
            serverSocket.bind(new InetSocketAddress(localhost, 1235));
         
         while(true) {
            // 한줄 읽기
            String data = name+" > "+sysin.readLine();
            DatagramSocket datasoket = new DatagramSocket();
            // 문자열을 바이트 배열에 저장
            byte[] msg1 = data.getBytes();
            
            // 서버로 전송(데이터, 데이터 길이, 서버IP, 포트 번호)
//            DatagramPacket name1 = new DatagramPacket(sName, sName.length,serverIP,1235);
//            datasoket.send(name1);
            DatagramPacket outpaPacket = new DatagramPacket(msg1, msg1.length,serverIP,1235);
            datasoket.send(outpaPacket);
            // 소켓 닫기
            datasoket.close();
            
         }
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }
   }

}

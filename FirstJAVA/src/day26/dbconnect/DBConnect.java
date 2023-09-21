package day26.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {

	public static void main(String[] args) {
		// JDBC 연동 테스트
		
		// 데이터베이스 접속 객체 ( Connection 클래스 )
		Connection conn = null;
		
		// Checked Exception : SQL
		try {
			// 1. 드라이버 로드
			// MySQL 사용 드라이버
			// MySQL 6.xx 버전 미만 :  com.mysql.jdbc.Driver 
			// MySQL 6.xx 버전 이후 :  com.mysql.cj.jdbc.Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Connection 객체 생성 - Driver Manager
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root" , "root1234");
			// url -> JDBC 연결을 위한 주소 
			// MySQL 6.xx 버전 미만 :  jdbc:mysql://호스트이름:포트번호/DB이름
			// MySQL 6.xx 버전 이후 :  jdbc:mysql://호스트이름:포트번호/DB이름?serverTimezone=UTC
			// 매개변수 : serverTimezone=UTC		
			// SSL 설정 오류 발생시 &&useSSL=false 추가
			System.out.println(conn);
			System.out.println("데이터베이스 접속 성공!");
			
			// 3. Statement 객체 생성 ... createStatement( ) 메서드 사용
			Statement stmt = conn.createStatement(); // conn에서 얻어온다
			
			// 4. SQL 작성  
			String sql = "Insert into Persons (firstName, lastName, age, city)"
					+"values('덕우','김','46','Seoul')"; // Insert 
			
			// 생성 
			String sql2 = "update Person set firstName = '길동' where id=18";
			// 삭제
			String sql3 = "delete from Person where id=18";
			
			// 5. Statement 객체를 통해서 작성된 SQL을 실행
			int result = stmt.executeUpdate(sql);
			if(result != 0) {
				System.out.println(" Insert SQL 성공");
			}else {
				System.out.println("SQL 실패");
			}			
		}catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
		}
		catch (SQLException sqle) {
			// 
			System.out.println("SQL 연동 오류");
			System.out.println(sqle.getMessage());
		}finally {
			try 
				{ if(conn!=null) conn.close(); }  
			catch (Exception e) { }
		}
		
	} // 메인 메서드 
	
	
	
}
	
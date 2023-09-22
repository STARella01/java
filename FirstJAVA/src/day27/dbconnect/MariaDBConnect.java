package day27.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MariaDBConnect {

	public static void main(String[] args) {
		
		// 객체 생성
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// 1. 드라이버 로드 
			Class.forName("org.mariadb.jdbc.Driver");
			
			// 2. Connection 
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:13306/testdb" , "root", "root1234");
			System.out.println(conn);	
			System.out.println("DB 접속 성공");
			
			// 3. 객체 생성
			stmt = conn.createStatement();
			
			// 4. SQL 작성  
			String sql = "Insert into Persons (firstName, lastName, age, city)" +"values('ㅇㅅㅇ','강','50','Madrid')"; // Insert 
			
			rs = stmt.executeQuery(sql);  // SQL의 답을 토해내라라는 명령어 executeQuery
			int result = stmt.executeUpdate(sql);
			
			if(result != 0) {
				System.out.println(" Insert SQL 성공");
			}else {
				System.out.println("SQL 실패");
			}			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
		} catch (SQLException sqle) {
			System.out.println("SQL 연동 실패");
			System.out.println(sqle.getMessage());
		} finally {
			try {
			if(conn != null) conn.close();	
			} catch (Exception e) { }
		}
		

	} // 메인메서드 종료

}

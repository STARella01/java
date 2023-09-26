package day29.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnectTest {

	// PreparedStatement
	
	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin@localhost:1521/XEPDB1";
		String user = "mytest";
		String password = "mytest";
		
		Connection conn2 = null;
		PreparedStatement pstmt2 = null;
		
		try {
			//  1. driver loading	
			Class.forName(driver);
			
			// 2. driver manager 이용 Connection 객체 생성
			conn2 = DriverManager.getConnection(url, user, password);
			System.out.println(conn2);
			System.out.println("DB연동 성공");
			
			// 3. SQL 작성
			String sql = "insert into (id , lastname, firstname, age, city) values ( ? , ? , ? , ? , ? )";
			
			// 4. PreparedStatement 객체 생성
			pstmt2 = conn2.prepareStatement(sql);
			// ?에 값을 대입
			pstmt2.setString(1, "testuser");
			pstmt2.setInt(2, 20);
			
		} catch (ClassNotFoundException ce) {
			System.out.println("드라이버 로드 실패");
		} catch (SQLException sqle) {
			System.out.println("DB 연동 실패");
			System.out.println(sqle.getMessage());
		}

	}

}

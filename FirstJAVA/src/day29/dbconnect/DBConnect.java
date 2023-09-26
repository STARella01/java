package day29.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnect {
	
//  JAVA에서 DB연동하기 ( Oracle )
//	1. driver loading
//	2. driver manager 이용 Connection 객체 생성
//	3. SQL 작성 ( statement 객체 생성할 때는 SQL먼저 작성할 필요 없지만 PreparedStatement는 SQL 먼저 작성해야 함.)
//	4. PreparedStatement 객체 사용 ( Statement 객체 대용 )
//	5. SQL 실행
	
//	왜 PreparedStatement를 사용할까?
//	SQL에 전달하여 처리하는 값을 변환하는 것이 Statement는 까다롭다는 점.
//	PreparedStatement는 이것을 간결하게 할 수 있게 작업해 줌.
//	간단하게 값을 전달할 때에 SQL에 ?로 처리하여 값을 지정하고, 변환처리는 자동으로
//	?는 인덱스 값을 사용하여 참조하기 때문에 여러 개인 경우 1번부터 순서대로 지정.


	public static void main(String[] args) {
		// 오라클 DB Connect -- PreparedStatement
		
		// 연결 정보 입력
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1"; // thin 시스템에 대한 구분값 - 생략 불가
		String user = "mytest";
		String password = "mytest";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		
		try {
			//  1. driver loading
			Class.forName(driver);
			
			// 2. driver manager 이용 Connection 객체 생성
			conn = DriverManager.getConnection(url, user, password);
			System.out.println(conn);
			System.out.println("DB연동 성공");
			
			// 3. SQL 작성
			String sql = "insert into test(name, age) values( ?,? )"; // ?로 값 대입할 곳 수정
			
			// 4. PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			// ?에 값을 대입
			pstmt.setString(1, "testuser");
			pstmt.setInt(2, 20);
			
			// 5. SQL 실행
			int result = pstmt.executeUpdate(); // sql인자로 받지 않음. - 이미 들어가 있음.
			if(result != 0 ) {
				System.out.println("레코드 추가 성공");
			} else {
				System.out.println("레코드 추가 실패");
			}
			
			String sql2 = "select * from test";
			
			pstmt = conn.prepareStatement(sql2);
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.printf("이름 : %s, 나이 : %d\n" ,rs.getString("name"), rs.getInt("age"));
			}
			
			// 숙제
			// 테이블 생성
			// 오라클에 mytest 계정에 Persons 테이블을생성
			// id, lastname, firstname, age, city를 가지는 테이블 생성 
			// 각 테이블에 정보를 입력빋아 데이터를 생성할 수 있게 만든다. (id는 자동생성)
			// 모든 레코드 추가가 성공하면, Persons 테이블에 있는레코드 전체를 출력하는 코드를 작성!
			
			
		} catch (ClassNotFoundException ce) {
			System.out.println("드라이버 로드 실패");
		} catch (SQLException sqle) {
			System.out.println("DB 연동 실패");
			System.out.println(sqle.getMessage());
		} 
		

	}
	 
	

}

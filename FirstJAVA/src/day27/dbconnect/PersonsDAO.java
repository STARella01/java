package day27.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import day26.dbconnect.PersonsVO;

public class PersonsDAO { // DB 접속해서 CRUD 작업 
	
	// 커넥션을 위한 멤버 변수
	String url ="jdbc:mariaDB://localhost:13306/testdb";
	String user = "root";
	String password = "root1234";
	
	// DB 연동을 위한 객체 선언
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	public PersonsDAO() {
		try {
			// 드라이버 로드
			Class.forName("org.mariadb.jdbc.Driver");
			
			// Connection 객체 생성
			conn = DriverManager.getConnection(url, user, password);  // 
			
		} catch (ClassNotFoundException ce) {
			System.out.println("드라이버 로드 실패");
			System.out.println(ce.getMessage());
		} catch (SQLException sqle) {
			System.out.println("SQL 연동 실패");
			System.out.println(sqle.getMessage());
		}
	}
	
	// insert 
	public int insertPersons(PersonsVO vo) {
		int result = 0;
		
		String sql = "Insert into Persons ( lastName, firstName, age, city)" +"values('장우','최','33','Madrid')"; // Insert
						// 해당 위치 vo.getLastName 이런 거 추가 필요함.
		try {
			// SQL 처리를 위한 Statement 객체 생성
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			
		}  catch (SQLException sqle) {
			System.out.println("SQL 연동 실패");
			System.out.println(sqle.getMessage());
		} finally {
			try {
				if (conn != null) conn.close();
				if (stmt != null) stmt.close();
				if (rs != null) rs.close();
			} catch (Exception e2) {

			}
		}
		return result;
	}
	
	// select All 모든 테이블 정보 출력
	public List<PersonsVO> selectAll() { 
		List<PersonsVO> list = new ArrayList<PersonsVO>();
		
		String sql = "select*from Persons Order by id desc"; 
		// 데이터 불러오는 처리는 반드시 자동적으로 순서대로 진행되지 않을 수 있다. 따라서 desc처럼 명시해놓는 것이 좋다.
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int ID = rs.getInt("id");
				String FirstName = rs.getString("firstName");
				String LastName = rs.getString("lastName");
				int Age = rs.getInt("age");
				String City = rs.getString("city");
				
				PersonsVO vo = new PersonsVO( ID, FirstName, LastName, Age, City  );
				list.add(vo);
			}
		} catch (SQLException sqle) {
			System.out.println("SQL 연동 실패");
			System.out.println(sqle.getMessage());
		}  finally {
			try {
				if (conn != null) conn.close();
				if (stmt != null) stmt.close();
				if (rs != null) rs.close();
			} catch (Exception e2) {

			}
		}
		
		return list; // 리스트를 반환해라!
	}
	
	
	// select1 (int ID 받아서 처리)
	public PersonsVO selectOne (int ID) {
		PersonsVO vo = null;
		
		String sql = "select*from Persons where id= ' "+ID+" ' "; // 보안상의 이슈로 다음처럼 사용해도 됨.
		// 문자일 경우에는 필터링이 가능해서 공격 코드를 넣을 수 없도록 다음처럼 적용함.
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				vo = new PersonsVO {
					rs.getInt("id");
					rs.getString("lastName");
					rs.getString("firstName");
					rs.getInt("age");
					rs.getString("city");
				}
			}	
		} catch (Exception e) {
			// TODO: handle exception
		} catch (SQLException sqle) {
			System.out.println("SQL 연동 실패");
			System.out.println(sqle.getMessage());
		}  finally {
			try {
				if (conn != null) conn.close();
				if (stmt != null) stmt.close();
				if (rs != null) rs.close();
			} catch (Exception e2) {

			}
		}
		
		return vo;
		
	}
	
	
	// 수정
	public int updatePersons(PersonsVO vo){
		int result = 0;
		
		String sql= "update Persons set lastName='"+vo.getLastName()+"", firstName='"+vo.getfirstName()+"",
				firstName='"+vo.getLastName()+" firstName='"+vo.getLastName()+";
	}
	
	
	// 단 , 조건사항이 마리아 DB인 경우에만 이런식으로 사용
//	public PersonsDAO(String url, String user, String password) {
//		super();
//		this.url = url;
//		this.user = user;
//		this.password = password;
//		
//		try {
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	}
	
	
	
	//	[PersonsDB 처리하는 프로그램]
	
	
	//	2. 선택조회( 회원 ID들 이용한 정보 조회 )
	
	
	//	3. 레코드 추가(PersonsDB에 레코드 정보를 입력 받아서 추가)
	
	
	//	4. 레코드 수정(ID를 입력받아서 해당 레코드를 수정) (** 수정시에 ID에 해당하는 정보를 사전출력하여 변경 합니다.)
	//	  ex) 변경할 ID[10] 입력하세요 : 변경할 성[홍]을 입력하세요 :  ... 
	
	
	//	5. 레코드 삭제(ID를 입력받아서 해당 레코드를 삭제)
	//	  메뉴 선택 :
	

}// PersonsDAO Class end

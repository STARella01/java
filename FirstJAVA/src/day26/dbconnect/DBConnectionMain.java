package day26.dbconnect;

import java.util.List;
import java.util.Scanner;

public class DBConnectionMain {

	public static void main(String[] args) {
		// 
		PersonsDAO dao = new PersonsDAO();
//		Scanner scan = new Scanner(System.in);
//		// Scanner scan = scan.reset();
//		PersonsVO vo = new PersonsVO( );
//		
//		System.out.println("Persons 정보 입력 (Insert) : ");
//		
//		System.out.print(" 성 입력 : ");
//		vo.setLastName ( scan.next( ) );
//		System.out.print(" 이름 입력 : ");
//		vo.setFirstName ( scan.next( ) );
//		System.out.print(" 나이 입력 : ");
//		vo.setAge ( scan.nextInt( ) );
//		System.out.print(" 도시 입력 : ");
//		vo.setCity ( scan.next( ) );
//
//		// SQL 동작 여부 확인!
//		int result = dao.insert(vo);
//		if(result != 0) {
//			System.out.println( "입력 성공" );
//		}else {
//			System.out.println( "입력 실패" );
//		}
//		scan.close();
		
		// 메인에서 전체 출력
		List<PersonsVO> list =  dao.allPersons();
		for ( PersonsVO vo1 : list ) {
			System.out.println(vo1);
		}
		
		
	} // 메인 메서드 종료

}

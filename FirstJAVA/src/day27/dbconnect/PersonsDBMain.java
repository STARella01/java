package day27.dbconnect;

import java.util.List;
import java.util.Scanner;

public class PersonsDBMain {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while() {
			System.out.println("[ PersonsDB 처리 프로그램 ]");
			System.out.println( " 1. 전체 조회 ");
			System.out.println( " 2. 선택 조회 ");
			System.out.println( " 3. 레코드 추가 ");
			System.out.println( " 4. 레코드 수정 ");
			System.out.println( " 5. 레코드 삭제 ");
			System.out.println( " 0. 종료 ");
			System.out.println( " 메뉴 선택 : ");
			
			int sel = scan.nextInt();
			
			switch (sel ) {
			case 1 :	// 전체 조회
				selectAll ();
				break;
			case 2 :	// 선택 조회
				selectOne ();
				break;
			case 3 :	// 레코드 추가
				Insert ();
				break;
			case 4 :	// 레코드 수정
				update();
				break;
			case 5 :	// 레코드 삭제
				break;
			case 0 :	// 종료
				System.out.println("프로그램 종료");
				System.exit(0); // 종료 처리
			default:
				System.out.println("");
				break;
				
			}
		
		}
		
		static void selectAll () {
			PersonsDAO dao = new PersonsDAO();
			List<PersonsVO> list = dao.selectAll();
			for(PersonsVO vo : list) {
				System.out.println(vo);
			}
		}
			
		static void selectOne () {
			System.out.println("출력할 레코드의 아이디를 입력하세요.");
			PersonsVO vo = dao.selectOne(scan.nextInt());
			System.out.println(vo);
		}
			
		static void Insert () {
			
		}
			
		static void update () {
			
		}
			
		
	}

}

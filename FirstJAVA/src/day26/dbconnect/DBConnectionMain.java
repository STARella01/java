package day26.dbconnect;

import java.util.List;
import java.util.Scanner;

public class DBConnectionMain {

	public static void main(String[] args) {
		// 
		PersonsDAO dao = new PersonsDAO();
		Scanner scan = new Scanner(System.in);
		// Scanner scan = scan.reset();
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
		
		System.out.println("수정하기");
		System.out.println("id = 13 정보 수정하기");
		PersonsVO vo = dao.selectOne(13);
		
		System.out.printf("수정할 성을 입력하세요.(" +vo.getLastName()+" ) :" );
		vo.setLastName(scan.next());
		String firstName = scan.next();
		if (firstName.equals("")) {
			vo.setLastName(firstName);
		}
		
		System.out.printf("수정할 이름을 입력하세요.(" +vo.getFirstName()+" ) :" );
		vo.setLastName(scan.next());
		String lastName = scan.next();
		if (lastName.equals("")) {
			vo.setLastName(lastName);
		}
		
		System.out.printf("수정할 나이를 입력하세요.(" +vo.getAge()+" ) :" );
		vo.setLastName(scan.next());
		String age = scan.next();
		if (age.equals("")) {
			vo.setLastName(age);
		}
		
//		int age = scan.nextInt();
		
		System.out.printf("수정할 도시를 입력하세요.(" +vo.getCity()+" ) :" );
		vo.setLastName(scan.next());
		String city = scan.next();
		if (city.equals("")) {
			vo.setLastName(city);
		}
		
		int result = dao.UpdatePersons(vo);
		if (result != 0) {
			System.out.println( "입력 성공" );
		}else {
			System.out.println( "입력 실패" );
		}
		
	
		
		
	} // 메인 메서드 종료

}

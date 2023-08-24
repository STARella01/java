package day06;

import java.util.Scanner;

public class CustomerManager {
	//변수명 파란색 표시 -> 멤버 변수 참조하고 있다는 뜻
	
	// 멤버 변수 지정
	// 배열에 저장할 수 있는 최대 고객의 수
	static final int MAX =100;	// 상수
	
	// 고객 정보를 저장할 변수를 배열로 선언 : 이름 성별 이메일 출생년도
	static String[]  nameList = new String[MAX];
	static String[]  genderList = new String[MAX];
	static String[]  emailList = new String[MAX];
	static int[] birthYearList = new int[MAX];
	
	// 배열을 참조하기 위해서 인덱스 필요
	static int index= -1; // 배열은 0번부터 시작하기 때문에 최초의 인덱스는 -1이어야 함.
	
	// 배열의 처음 선언한 크기보다 같거나 작은 개수의 자료를 저장
	// 그래서 현재 데이터가 몇개 저장되어 있는지 알 수 있는 변수를 선언해야 함.
	static int count = 0; //저장 개수
	
	// 기본 입력장치로 부터 데이터를 입력받기 위해서 Scanner라고 하는 객체 선언
	static Scanner scan = new Scanner(System.in);
	

	public static void main(String[] args) {
		// 고객 관리 프로그램의 메뉴
		while(true) { // 작업 계속 이어져야 해서.
				// 고객 메뉴 (text ui)
				System.out.printf("\n[INFO] 고객 수:%d, 인덱스: %d\n", count, index);
				System.out.println("메뉴를 입력하세요.");
				System.out.println("(I)nsert, (P)revious, (N)ext, (C)urrent, (U)pdate, (D)elete, (Q)uit");
				System.out.println("메뉴 입력 :");
				String menu = scan.next();
				menu = menu.toLowerCase();
				
				// 메뉴 선택 시 동작 구현
				switch (menu.charAt(0)) { // 메뉴 첫번째 글자 보겠다 0
					case 'i' : 
						System.out.println("고객 정보를 입력을 시작합니다.");
						if(count >= MAX) { // 만약 아까 지정한 고객 수인 100이 넘을 경우
							System.out.println("더 이상 저장할 수 없습니다.");
						}else {  // 지정한 고객 수인 100이 넘지 않을 경우
							insertCustomerData(); 
							System.out.println("고객 정보를 저장했습니다.");
						}
						break;
					case 'p' : 
						System.out.println("이전데이터를 출력합니다.");
						if(index <= 0 ){ // 0이 맨 처음이니까 이전 데이터가 없다.
							System.out.println("이전데이터가 없습니다.");
						}else {
							index--;
							printCustomerData(index);
						}
						break;
					case 'n' : 
						if(index  >= count-1 ){
							System.out.println("다음데이터가 없습니다..");
						}else { // 다음 데이터로 넘어가야 하니까 +
							index++;
							printCustomerData( index );
						}
						System.out.println("다음데이터를 출력합니다.");
						break;
					case 'c' : 
						System.out.println("현재 데이터를 출력합니다."); // && and 두 조건을 모두 충족 시켜야 함.
						if( (index >= 0)&&( index < count )  ) { // 인덱스 값은 카운트 값을 벗어나면 안된다 
							printCustomerData(index);
						}else {
							System.out.println("출력할 데이터가 선택되지 않았습니다.");
						}
						break;
					case 'u' : //데이터를 불러와서 수정값 입력 -> 변경
						System.out.println("데이터를 수정합니다."); 
						// 풀이
						if(( index >= 0 ) && ( index < count )) {
							System.out.println(index + " 번째 데이터를 수정합니다."); 
							updateCustomerData(index);
						}else{
							System.out.println("수정할 데이터가 선택되지 않았습니다."); 
						}
						
							// 근데 뭘 수정할 건데? 전체수정? 아니면 특정 영역 수정?
//							printCustomerData(int index);
//							if( index  count ) { 
//								// 데이터 값을 가져오고
//								// 데이터 값들을 비교 
//								// 몇 번째 데이터를 수정할거니?
//								// 수정 내용들을 삽입
//								// confirm 
//							}else {
//								// 데이터를 수정하지 않고 프로그램을 종료하는 경우
//								
//								//  입력 영역 맨처음으로 돌아가는 경우
//							}else if{
//								
//							}
							
						break;
					case 'd' : // 삭제 - 삭제 처리 후 빈 공간 채워야 한다? 지우고 남은 데이터 땡겨와야 함
						System.out.println("데이터를 삭제합니다.");
						if((index >= 0) && (index < count)) {
							System.out.println(index+"번째 데이터를 삭제합니다.");
						}else {
							System.out.println("삭제할 데이터가 선택되지 않았습니다..");
						}
						break;
					case 'q' : 
						System.out.println("프로그램을 종료합니다.");
						scan.close(); // 입력창 끔
						System.exit(0); // 프로세스 종료
						break;				
					default: // 잘못된 이외의 키 값을 넣었을 때
						System.out.println("메뉴를 잘못 입력했습니다.");
						break;	 // 생략해도 됨.			
				}
		} 
		
	} // main method end

	//고객 데이터 입력 추가
	public static void insertCustomerData() { //매개변수 X 반환값 X
		// 이름 성별 이메일 출생년도 입력
		System.out.print("이름 :");
		String name = scan.next();
		
		System.out.print("성별 (M/F) :");
		String gender = scan.next();
		
		System.out.print("이메일 :");
		String email = scan.next();
		
		System.out.print("출생년도");
		int  birthYear = scan.nextInt(); 
		
		
		//고객 객체를 배열에 저장
		nameList[count] = name;
		genderList[count] = gender;
		emailList[count] = email;
		birthYearList[count] = birthYear;
		count++; // 늘리는 이유 - count번째 배열에 객체를 저장한 후 count값 증가시킴	
	} // insertCustomerData end
	
	
	// 현재 고객 정보 출력
	public static void printCustomerData(int index) { // 메소드에서 사요되는 지역 변수
		System.out.println("======== CUSTOMER INFO========");
		System.out.println("이름:" +nameList[index]);
		System.out.println("성별:" +genderList[index]);
		System.out.println("이메일:" +emailList[index]);
		System.out.println("출생년도:" +birthYearList[index]);
		System.out.println("============================");
	}
	
	public static void updateCustomerData(int index) {
		System.out.println("-----------------UPDATE CUSTOMER INFO----------------");
		
		System.out.println("이름 (" +nameList[index]+") : ");
			String name = scan.nextLine();
			if(name.length() != 0 ){
				nameList[index] = name;
			}
		nameList[index] = scan.next();
		
		
		System.out.println("성별 (" +genderList[index]+") : ");
			String gender = scan.nextLine();
			if(gender.length() != 0 ){
				genderList[index] = gender;
			}
		genderList[index] = scan.next();
		
		System.out.println("이메일 (" +emailList[index]+") : ");
			String email = scan.nextLine();
			if(email.length() != 0 ){
				emailList[index] = email;
			}
		emailList[index] = scan.next();
		
		System.out.println("출생년도 (" +birthYearList[index]+") : ");
			int birthYear = scan.nextInt();
			if(birthYear != 0 ){
				birthYearList[index] = birthYear;
			}
		birthYearList[index] = scan.nextInt();
		
		System.out.println("------------------------------------------------------------");
	}

	public static void deleteCustomerData(int index) {
		for(int i= index; i <count - 1; i++) {
			nameList[ i ] = nameList[ i+1 ];
			genderList[ i ] = genderList[ i+1 ];
			emailList[ i ] = emailList[ i+1 ];
			birthYearList[ i ] = birthYearList[ i+1 ];
		}
		count--;  // 카운트 빼주삼
	}
	
	// 
}

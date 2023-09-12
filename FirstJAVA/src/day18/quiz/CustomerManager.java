package day18.quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import util.Closer;

public class CustomerManager {
	
	static ArrayList<Customer> cusList = new ArrayList<>();  // 고객 데이터를 저장
	static Scanner scan = new Scanner(System.in);
	static File file = new File("D:\\Develop\\java\\FirstJAVA\\file");

	public static void main(String[] args) {
		// 맨 처음
		readCustomerData(); // 프로그램 시작 전에 정보를 입력받아야 함.
		
		
		// 메뉴 생성
		while(true) {
			System.out.printf("\n[Info] 고객 수 : %d",cusList.size());
			System.out.println("\t\t 메뉴를 입력하세요.");
			System.out.println("(I)nsert, (P)revious, (S)elect, Select (A)ll,  (N)ext, (C)urrent, (U)pdate, (D)elete, (Q)uit");
			System.out.println("메뉴 입력 :");
			String menu = scan.next();
			menu = menu.toLowerCase(); // 이거 사용하는 이유 - i 눌러도 I로 입력될 수 있도록
			
			switch (menu.charAt(0)) {
			case 'i':
			case 'ㅑ':
				System.out.println("고객정보 입력을 시작합니다.");
				// 고객 정보 입력 처리 insertCustomerData()
				insertCustomerData();
				System.out.println("고객정보를 저장했습니다.");
				break;
				
			case 'w':
			case 'ㅈ':
				System.out.println("고객정보 파일에 저장합니다.");
				// 고객 정보 저장 처리 writeCustomerData()
				writeCustomerData();
				break;
				
			case 's':
			case 'ㄴ':
				System.out.println("고객정보 출력을 시작합니다.");
				// 고객 정보 출력 처리 PrintCustomerData(Customer customer) - 출력, 수정, 삭제 시 select 쓸거임.
				if( cusList.size() >= 0 ) {
				printCustomerData ( selectCustomerData());
				}else {
					System.out.println();
				}
				break;	
				
			case 'a':
			case 'ㅁ':
				System.out.println("고객정보 전체 데이터 출력을 시작합니다.");
				// 고객 정보 전체 출력 처리 printAllustomerData()
				if( cusList.size() > 0 ) { // 고객리스트의 개수가 0보다 크다면 
				printAllCustomerData ();	// 를 전부 불러와라
				}else {
					System.out.println("출력할 데이터가 없습니다.");
				}
				break;		
				
			case 'u':
			case 'ㅕ':
				System.out.println("고객정보 수정합니다.");
				// 고객 정보 수정 처리 updateCustomerData()
				if(cuslist.size() > 0) {
					updateCustomerData(selectCustomerData());
				}else {
					System.out.println("수정할 고객정보가 없습니다.");
				}
				break;					
			case 'd':
			case 'ㅇ':
				System.out.println("고객정보를 삭제합니다.");
				//고객 정보 삭제 처리.. deleteCustomerData()
				if(cuslist.size() > 0) {
					deleteCustomerData(selectCustomerData());
				}else {
					System.out.println("삭제할 고객정보가 없습니다.");
				}
				break;
			case 'q':
			case 'ㅂ':
				System.out.println("프로그램을 종료합니다.");
				scan.close();
				System.exit(0);				
				
	

			default:
				System.out.println("메뉴를 잘못 입력했습니다.");
				break;
			}
			
		}

	}

	public static void insertCustomerData() {
		// Customer Data를 추가
		System.out.println("이름 :");
		String name = scan.next();
		System.out.println("성별 (M / F):");
		String gender = scan.next();
		System.out.println("이메일 :");
		String email = scan.next();
		System.out.println("출생년도 :");
		int birthYear = scan.nextInt();
		
		Customer c1 = new Customer();
		// 중복 체크하게 되면? -  	// 동등 비교를 위해 HashCode와 equals  -> 비교를 위해 수정 필요
		for(Customer c : cusList) {
			if(c.equals(c1)) {
				System.out.println("중복 데이터 입니다.");
				return; // c와 c1이 같으면 나가버려라 
			}
			
			cusList.add(c1);
		} //  중복체크 end
		
		
		
		cusList.add(c1); // c1 객체 생성 후 cusList에 add 추가하기 
	}
	
	public static Customer selectCustomerData() {
		// 이름으로 사람 찾기
		while(true) {
			System.out.println("출력, 수정 또는 삭제할 사람의 이름을 입력해 주세요.");
			System.out.println("또는 메뉴로 돌아가고 싶으면 q를 눌러주세요!");
			String name = scan.next();
			Customer cus = new Customer(); //객체 만든 이유 : 반환하는 객체 필요해서
			for(int i = 0; i <cusList.size(); i++) {
				if(cusList.get(i).getName().equals(name)) {
					return cusList.get(i);
				}
			}
			if(name.equals("q") || name.equals("Q") || name.equals("ㅂ")) {
				return cus;
			}
			System.out.println("입력하신 이름을 가진 데이터가 존재하지 않습니다.");
		}
		//return null;
		

	}
	
	public static void printCustomerData(Customer customer) {
		if(customer.getName() == null) {
			System.out.println("메뉴로 돌아갑니다.");
		}else {
			System.out.println(customer.toString());
		}
	}
	
	public static void printAllCustomerData() {
		// 전체 데이터 출력
		int i =0;
		while(i <= cusList.size() -1) {
			System.out.println(cusList.get(i).toString());
			i++;
		}System.out.println("전체 데이터를 출력했습니다.");
	}
	
	public static void updateCustomerData(Customer customer) {
		if(customer.getName() == null ) {
			System.out.println("메뉴로 돌아갑니다.");
		}else {
			System.out.println(" ======= update customer info =======");
			System.out.println("이름 : " +customer.getName()); // 수정하기 전 이름 확인하고 수정하겠다는 얘기
			scan.next();
			System.out.println("성별 : " +customer.getGender()); // 수정하기 전 이름 확인하고 수정하겠다는 얘기
			scan.next();
			System.out.println("이메일 : " +customer.getEmail()); // 수정하기 전 이름 확인하고 수정하겠다는 얘기
			scan.next();
			System.out.println("출생년도 : " +customer.getBirthYear()); // 수정하기 전 이름 확인하고 수정하겠다는 얘기
			customer.setBirthYear(scan.nextInt()); // set 사용하는 이유 : 다시 입력값을 넣어줘야 하니까!
		}
	}
	
	public static void deleteCustomerData(Customer customer) {
		if(customer.getName() == null) {
			System.out.println("메뉴로 돌아갑니다.ㄴ");
		}else {
			cusList.remove(customer);
			System.out.println("데이터가 삭제되었습니다.");
		}
	}
	
	public static void writeCustomerData() {
		
		// 파일의 존재여부 체크하는 조건문
		if(file.exists()) {
			System.out.println("파일이 존재합니다");
		}else {
			System.out.println("파일이 없습니다.");
			File dir = new File(file.getParent());
			dir.mkdirs();
		}
		
		 FileOutputStream fos = null;
		 ObjectOutputStream oos = null;
		 try {
			fos= new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(cusList);
			System.out.println("Customer 데이터 저장 완료!");			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(fos != null) Closer.close(oos);
			if(oos != null) Closer.close(fos);
		}
	}
	
	@SuppressWarnings("unchecked")  // 노란줄 표시하지 말기
	public static void readCustomerData() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		 try {
			 fis= new FileInputStream(file);
			 ois = new ObjectInputStream(fis);
			 cusList = (ArrayList<Customer>)ois.readObject();  // 캐스팅 (ArrayList<Customer>)
			System.out.println("파일이 없습니다.");			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException");
		}finally {
			if(fis != null) Closer.close(ois);
			if(ois != null) Closer.close(fis);
		}
		
	}
	
}


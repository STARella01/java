package day17.quiz1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListQuiz {

	public static void main(String[] args) {

		//1. User를 저장하는 List를 선언하세요

		
		
		Scanner scan = new Scanner(System.in);

		while(true) {

			System.out.println("메뉴를 입력하세요.");
			System.out.println("[ 1. 회원 등록 | 2. 전체 회원 정보 보기 | 3. 회원정보 검색 | 4. 회원정보 삭제 | 5. 종료 ]");
			System.out.print(">>> ");
			int menu = scan.nextInt();

			System.out.println("사용자가 입력한 메뉴 : " + menu);
			
			if(menu == 1) {
				/*
				Scanner를통해 이름과, 나이를 입력받고 User객체에 저장합니다.
				그리고 User객체를 list에 추가하세요.
				*/
				
				
			}else if(menu == 2) {

				System.out.println("====== 모든 회원 정보 ======");
				/*
				 * people의 길이만큼 회전하면서 people의객체를 꺼내 저장합니다. (객체의 타입에 유의)
				 * 꺼낸 하나의 객체에서  공개된 메서드를 통해 이름, 나이를 출력하세요.
				 * 
				 */

				System.out.println("==========================");


			}else if(menu == 3) {
				System.out.println("찾을 이름을 입력하세요.");
				System.out.print(">>> ");
				String name = scan.next();

				for(int i=0; i<people.size(); i++) {
					User p = people.get(i);
					String pName = p.getName();

					if(pName.equals(name)) {
						System.out.println("이름: " + name + ", 나이: " + p.getAge());
						break;
					} 
					//people List의 인덱스는 size -1이 됩니다.
					if (i == people.size() -1) {
						System.out.println(name +"님은 목록에 없습니다.");
					}

				}


			}else if(menu == 4) {
				/*
				 * 1. scan 을 통해 삭제할 이름을 입력 받으세요.
				 * 2. list 의 길이 만큼 회전하면서 객체에서 name을 꺼내 비교합니다.
				 * 3. 입력받은 이름과 동일한 이름이 있다면 people객체를 삭제
				 * 
				 */



				// scan.close();
			}else if(menu == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}

	}

}

class User{
	
	String name;
	int age;
	
	ArrayList<String> people = new ArrayList<>( );
	
	public User(String name, int age, ArrayList<String> people) {
		super();
		this.name = name;
		this.age = age;
		this.people = people;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ArrayList<String> getPeople() {
		return people;
	}

	public void setPeople(ArrayList<String> people) {
		this.people = people;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", people=" + people + "]";
	}
	
	

}
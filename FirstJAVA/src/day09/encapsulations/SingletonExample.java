package day09.encapsulations;

import day09.encapsulations.singleton.Company;

/*
 *  singleton design pattern 
 *  
 *  private 제한자와 static 제한자를 사용하여 클래스의 인스턴스 개수를 제한하는 프로그래밍 방법
 *  
 * */

public class SingletonExample {

	public static void main(String[] args) {
		// singleton 호출 시 new를 사용하지 않고 메서드를 이용해서 객체 생성
		// 메서드로 호출해 오려면 static이어야 함.
		// Class method로 접근 class명쓰고 method명 쓴다.
		Company c1 =  Company.getCompany();
		Company c2 =  Company.getCompany();
		
		System.out.println(c1);
		System.out.println(c1 == c2);
		System.out.println(c2);

	}

}

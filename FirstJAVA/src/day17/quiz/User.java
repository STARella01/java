package day17.quiz;

public class User {

	// 필드 - 멤버변수 / 멤버 메서드 / 생성자
	
	private String name;
	private int age;
	
	// 생성자
	public User() { } // 기본 생성자
	
	public User(String name, int age) { 
		this.name = name;
		this.age = age;
	}
	
	// getter setter
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getAge() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return		"[이름 : " +name+"나이 :" +age+"]"; 
				
//				"User [getName()=" + getName() + ", getAge()=" + getAge() + ", getClass()=" + getClass()
//				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	


}



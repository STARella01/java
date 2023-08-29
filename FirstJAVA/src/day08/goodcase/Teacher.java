package day08.goodcase;

import day08.inheritance.Person;

public class Teacher extends Person {

	 public String teacherId;
	 public String subject;
	
	public String getDetails() {
		return "이름 :" +name+"나이 :" +age+"사번 :" +teacherId+"부서 :" +subject;
	}
}

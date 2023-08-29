package day08.badcase;

import day08.inheritance.Person;

public class Employee extends Person {
	
	public  String companyId;
	public  String department;
	
	public String getDetails() {
		return "이름 :" +name+"나이 :" +age+"사번 :" +companyId+"부서 :" +department;
	}
		
}

package day08.goodcase;

import day08.goodcase.Person;

public class Student extends Person {

	 public String studentId;
	 public String major;
	 
	 public Student() {
		 //기본 생성자, super(); 생력되어 있음.
	 }
	 public Student(String name, int age) {
		 super(name, age);
	 }
	 public Student(String name, int age, String studentId, String major) {
		super(name, age); // super 대신 this 사용할 수 있음
		this.studentId = studentId;
		this.major = major;
	 }
	
	public String getDetails() {
		return "이름 :" +name+"나이 :" +age+"사번 :" +studentId+"부서 :" +major;
	}
	
	
}

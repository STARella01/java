package day09.polymorphism;

public class Employee extends Person {
	
	public  String companyId;
	public  String department;
	
	 public Employee() {
		 
	 }
	 
	 public Employee(String name, int age, String department) {
		 super(name, age);
		 this.department = department;
	 }
	
	
	public String getDetails() {
		return "이름 :" +name+"나이 :" +age+"사번 :" +companyId+"부서 :" +department;
	}
	
	
	
}

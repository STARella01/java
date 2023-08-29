package day08.inheritance;

public class Employee {
	// 이름, 나이, 사번, 부서
	String name;
	int age;
	String companyId;
	String department;
	
	public String getDetails() {
		return "이름 : " +name+"\t 나이:"+age+"\t 사번:"+companyId+"\t 부서:"+department;
	}

	
}

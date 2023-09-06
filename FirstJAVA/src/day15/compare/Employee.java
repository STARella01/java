package day15.compare;

public class Employee {

	String name;
	int salary;
	
	public Employee() { // 기본 생성자
		
	}

	// field 정의
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	@Override
		public String toString() {
			return name+":"+salary;
		}

	
}

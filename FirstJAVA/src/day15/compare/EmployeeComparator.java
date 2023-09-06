package day15.compare;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// 이름을 기준으로 정렬 - 이름 비교
		return o1.name.compareTo(o2.name);  // comparable에서 상속받아 옴 - 글자 하나하나에 대한 인코딩 값 비교한 것.
		
		
		
		
		
		
	}
	
}

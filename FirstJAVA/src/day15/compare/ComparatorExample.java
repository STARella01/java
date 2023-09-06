package day15.compare;

import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {
		Employee e1 = new Employee("차은우1",20000);
		Employee e2 = new Employee("차은우2",30000);
		Employee e3 = new Employee("차은우3",70000);
		Employee e4 = new Employee("차은우4",40000);

		// 자동정렬하는 TreeSet , TreeMap에서 정렬할 수 있는 기준이 필요함.
		// => Comparator를 이용한 정렬 =>comparator class를 생성 이후 적용 - 생성자에 추가 적용
		TreeSet<Employee> list = new TreeSet<>(new EmployeeComparator());
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		for(Employee s : list) {
			System.out.println(s);
		}
	}

}

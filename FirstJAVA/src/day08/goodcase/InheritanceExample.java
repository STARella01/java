package day08.goodcase;

import day08.goodcase.Person;

public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Person p = new Person();
//		p.name = "인간1";
//		p.age = 25;
//		p.height = 179.8f; // protected
//		p.weight = 70f; // default
		
		Person p = new Person("홍길동", 25, 179.8f);
		System.out.println(p.getDetails());
		
//		Student s = new Student();
//		s.name = "학생1";
//		s.age = 30;
		
		//Student s = new Student();
		Student s = new Student("이순신",30,"20230828","해양학과");
		s.studentId = "20230828";
		s.major = "해양학과";
		System.out.println(s.getDetails());
		
		Student s2 = new Student();
		System.out.println(s2.getDetails());
		
		
		Teacher t = new Teacher();
		t.name = "선생1";
		t.age = 35;
		t.teacherId = "20230828";
		t.subject = "물리학";
		System.out.println(t.getDetails());
		
		Employee e = new Employee();
		e.name = "구직자1";
		e.age = 40;
		e.companyId = "20230828";
		e.department = "전산팀"; 
		System.out.println(e.getDetails());
	}

}

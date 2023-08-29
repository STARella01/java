package day09.polymorphism;

public class PolyphismExample22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Person p;
			p = new Teacher("홍선생", 22, "JAVA Programming");
			System.out.println(p instanceof Person);  // true
			System.out.println(p instanceof Teacher); // true
			System.out.println(p.getDetails());
			
			p = new Employee("홍선생", 23, "교무처");
			System.out.println(p instanceof Person);  // true
			System.out.println(p instanceof Employee); // true
			System.out.println(p.getDetails());
			
			p = new Student("홍선생", 17, "20230829","요술");
			System.out.println(p instanceof Person);  // true
			System.out.println(p instanceof Student); // true
			System.out.println(p.getDetails());
			
			p.walk();
//			p.study();
	}

}

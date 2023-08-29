package day09.polymorphism;

public class HeteroCollectionExample {

	public static void main(String[] args) {
			
		Person[] pArr = new Person[4];
		
		pArr[0] = new Person("홍씨",20);
		pArr[1] = new Student("홍씨",17,"20230829","요술");
		pArr[2] = new Teacher("홍씨",200,"JAVA Programming");
		pArr[3] = new Employee("홍씨",20,"회사원");
		
		for(int i = 0; i <pArr.length; i++ ) {
			System.out.println(pArr[i].getDetails());
		}
		
		// 향상된 for문
		for(Person p : pArr) { // 받을 수 있는 객체 
			System.out.println(p.getDetails()); // 순차적 처리
		}
		
		
	}

}

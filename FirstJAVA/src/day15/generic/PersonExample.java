package day15.generic;

public class PersonExample {

	public static void main(String[] args) {
		Person<Character> p1 = new Person<>('딸', 8);
		System.out.println(p1.getName());
		
		Person<String> p2 = new Person<>("아빠", 46);
		System.out.println(p2.getName());

		// 제너릭은 이처럼 메서드에 다양한 타입을 사용할 수 있게 해준다. -> public <T extends Object> T test(T t) 이렇게 선언해 줬기 때문에
		System.out.println(p1.test(4.8));  	// 4.8 double 
		System.out.println(p1.test("4.8" ));	// String
		System.out.println(p1.test(5)); 		// int
		System.out.println('5'); 				// character
	}

}

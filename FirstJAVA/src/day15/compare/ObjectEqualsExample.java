package day15.compare;

import java.util.HashSet;
import java.util.TreeSet;

public class ObjectEqualsExample {

	public static void main(String[] args) {
		
		// 객체간 동등 비교
		Dog d1 = new Dog("진돗개", "뽀삐", 15);
		Dog d2 = new Dog("말티즈", "삐삐", 5);
		Dog d3 = new Dog("진돗개", "뽀삐", 15);

		// Dog d3 = d1 ?
		System.out.println(d1 == d3); // 정보가 맞다고 주소까지 같진 않기 때문에 false
		System.out.println(d1.equals(d3)); // 이거는 문자열에 대한 비교이기 때문에 true
		System.out.println(d1); // Dog [dogId = 진돗개, dogName =뽀삐]1919564487
		System.out.println(d3); // Dog [dogId = 진돗개, dogName =뽀삐]1919564487
		
		// HashSet은 동등비교를 통해서 같은 객체인지 아닌지 비교 - set은 중복을 허용하지 않으므로 
		HashSet<Dog> set = new HashSet<Dog>();
		System.out.println(set.add(d1)); // true		
		System.out.println(set.add(d2)); 
		for(Dog dog : set) {
			System.out.println(dog);
		}
		// System.out.println(set.add(d3)); // false
		
		// TreeSet
		TreeSet<Dog> tset = new TreeSet<Dog>();
		System.out.println(tset.add(d1));
		System.out.println(tset.add(d2));
		for(Dog dog : tset) {
			System.out.println(dog);
		} // compare로 비교했는데 두 값의 차이가 없으니 0

		
	} // main 메서드 end

}

package day08.Overriding;

public class Person {
	// 이름, 나이
	protected String name; // protected는 상속관계에서 접근 가능
	protected int age;
	
	public String getDetails() {
		return "이름:"+name+"\t 나이:"+age;
	}
}

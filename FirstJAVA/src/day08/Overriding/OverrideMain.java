package day08.Overriding;

public class OverrideMain {
	public static void main(String[] agrs) {
		
		Person p1 = new Person();
		
		p1.name= "길똥이";
		p1.age= 18;
		
		System.out.println(p1);
		System.out.println(p1.getDetails());
		

		
		Student str1= new Student();
	
		str1.name= "홍제자";
		str1.age= 14;
		str1.studentId= "first";
		
		
		
	}
}

package day11.quiz3__;

public class Dog extends MarineAnimal implements Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("개는 사료를 먹습니다.");
	}
	
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("개는 잠을 잡니다.");
	}
}

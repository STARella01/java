package day11.quiz3__;

public class GoldFish extends MarineAnimal implements Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
		System.out.println("물고기는 플랑크톤을 먹습니다.");
		
	}
	
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("물고기는 잠을 잡니다.");
		
	}
}

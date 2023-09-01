package day11.quiz3;

import day11.quiz.Deer;
import day11.quiz.Lion;
import day11.quiz.ZooKeeper;

public class AnimalInterface {

	public static void main(String[] args) {
		
		AnimalInterface aniface = new AnimalInterface();
		
		Tiger tiger = new Tiger();
		Dog dog = new Dog();
		GoldFish goldfish = new GoldFish();
		Shark shark = new Shark();
		
		aniface.feed(tiger);
		aniface.feed(dog);
		aniface.feed(goldfish);
		aniface.feed(shark);
		
	}
	
	
	public void feed(AniFeed feed) {
		System.out.println(feed.getFood()+"를 줍니다.");
	}

	public void sleep(AniSleep sleep) {  
		System.out.println(sleep.getSleep()+"를 줍니다.");
	}

}





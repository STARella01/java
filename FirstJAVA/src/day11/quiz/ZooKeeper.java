package day11.quiz;

// 먹이 주는 것에 대한 명세

// 인터페이스는 부모 여러 개 가질 수 있음 - 다중 상속 가능

public class ZooKeeper {
	
	public void feed(Feed feed) { // 사슴과 사자의 공통점 먹이 
		System.out.println(feed.getFood()+"를 줍니다.");
	}
	
}





package day11.quiz3;

public class Shark extends AniHerbivore implements AniFeed, AniSleep{
	@Override
	public String getFood() {
		// TODO Auto-generated method stub
		return "물고기";
	}
	
	@Override
	public String getSleep() {
		// TODO Auto-generated method stub
		return "잔다";
	}
}

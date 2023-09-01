package day11.quiz3;

public class GoldFish extends AniHerbivore implements AniFeed, AniSleep{
	@Override
	public String getFood() {
		// TODO Auto-generated method stub
		return "플랑크톤";
	}
	
	@Override
	public String getSleep() {
		// TODO Auto-generated method stub
		return "잔다";
	}
}

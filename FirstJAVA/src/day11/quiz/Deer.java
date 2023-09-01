package day11.quiz;

public class Deer extends Herbivore implements Feed {
	
	@Override
	public String getFood() {
		return "건초";
	}
	
}

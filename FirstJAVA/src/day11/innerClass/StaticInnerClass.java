package day11.innerClass;

public class StaticInnerClass {

	// static
	public static void main(String[] args) {
		// static이 있는 것과 없는 것 접근 방식
		
		// static이 있는 경우
		University.Student us = new University.Student();
		
		// static이 없는 경우
		// HighSchool.Student high = new HighSchool.Student();  // 오류남	- 값 불러다가 쓸 수 없응께
		HighSchool high = new HighSchool();  // 외부 객체 생성
		HighSchool.Student hs = high.new Student(); // 내부 객체 생성
	}

}


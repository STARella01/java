package day19.Lambda;

public class LamdaEx {

	public static void main(String[] args) {

		LamdaInterface li = () -> { // { } - 재정의하는 부분 
			String str = "메서드 출력";
			System.out.println(str);	
		};
		li.print();
	}
} // -- mian method end --

interface LamdaInterface{
	void print();
	// void print2();  // 
}
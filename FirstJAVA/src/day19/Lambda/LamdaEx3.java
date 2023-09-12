package day19.Lambda;

public class LamdaEx3 {

	public static void main(String[] args) {
		
		
		// 두 코드는 같다
		LamdaInterface3 li3 = (String name) -> {
			System.out.println("제 이름은 "+name+"입니다.");
		};

		LamdaInterface3 li32 = name -> {	// 매개변수 하나라서 ( ) 생략함
			System.out.println("제 이름은 "+name+"입니다.");
		};
		
		// 
		li3.print("차은우");
		li32.print("차은우2");
		

	}

}


interface LamdaInterface3 {
	void print(String name);
	//void print();
}

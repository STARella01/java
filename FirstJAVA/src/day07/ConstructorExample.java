package day07;

public class ConstructorExample {

	// 생성자 (Constructor)
	
	// 객체를 생성하는 new를 통해서 인스턴스를 생성할 때 호출되는 것을 말함
	// 클래스 이름과 같은 의미를 지는 함수
	
	// 생성자 역할은 객체를 생성하여 동작할 때 필요한 모든 작업이 가능
	// 주로, 멤버 변수에 대한 초기화 작업을 진행함.
	
	// 클래스에 생성자를 정의하지 않은 경우에는 기본 생성자가 호출
	// (기본 생성자란? 호출 시 매개 변수가 정의되어 있지 않은 생성자) - 클래스에 () 이거만 하면 됨
	// 다른 생성자가 정의되어 있다면 정의된 생성자를 반드시 사용해야 한다.  -> 생성된 그걸 반드시 써야함!!
	
	public static void main(String[] args) {
		// 
		Car c = new Car();    // 클래스의 기본 생성자
		System.out.println(c.wheel);  // 기본 생성자에 선언된 값을 가져와서 출력한다.
		c.wheel = "미쉐린"; // 그러나 기본 생성자에 선언된 값을 변경할 수 있다.
		System.out.println(c.wheel); // 그러나 재정의 되기 전에 이미 실행문이 선언되면 변경전 것도 출력함.
		
		Car c2 = new Car("미쉐린", 6, "BMW", "티코");
		System.out.println(c2.wheel);
		
	}

} // -- ConstructorExample --

	// 자바 클래스 규칙
	// - public Class는 파일 이름과 같아야 한다.
	// - public Class는 '한 파일 내에 한 개만 존재'할 수 있다. -> 얘만 아니라면 여러 개 있어도 된다는 말과 같음
	// - 같은 패키지 내에서는 같은 이름의 클래스를 사용할 수 없다. -> 여러 클래스를 모아놓은 것 = 패키지
	// - 다른 패키지 내에서는 같은 이름의 클래스를 사용할 수 있다.  
	// - 다른 패키지에서는 import할 때 public class에만 접근할 수 있다. 
	// - public Class는 파일 이름이기 때문에 그 소스 파일 전체의 주제를 알 수 있는 이름을 짓는 것이 좋음.

	// - 클래스 이름은 '대문자'로 시작하는 것이 좋다! ex: Ace, Beef, Camel, Desert, Emotion, Female,  

	// 패키지가 다르다는 건 - 서로 다른 지역 변수를 가지고 있다는 것과 같다.

	class Car{
		// 멤버(속성, 필드) 선언
		String wheel;
		int numOfWheel;
		String brand;
		String name;
		// 멤버 변수는 생성되었지만 아직 정의되지 않음
		
		
		// 생략되어 있는 기본 생성자
		Car( ){
			wheel = "금호";
			numOfWheel = 4;
			brand = "기아";
			name = "K5";
		}
		// 생성자는 새로운 인스턴스를 생성할 때 가장 먼저 호출되기 때문에 값을 초기화하는 용도로 많이 사용.
		// 
		
		//Overload
		Car(String wheel, int numOfWheel, String brand, String name){ // 생성자 / 필드 생성자
			// this : 현재 인스턴스를 의미함.
			
			// 클래스 변수와 매개변수를 같은 이름으로 사용할 때,
			// 클래스 변수를 지칭하기 위해서 "this" 붙여야 한다.
			//wheel은 this 사용하기 전에는 가장 가까운 매개변수를 참조
			 this.wheel = wheel;
			 this.numOfWheel = numOfWheel;
			 this.brand = brand;
			 this.name = name; // 
			 // this 지금 현재 객체
			 
			 // this.() // 이거는 생성자를 의미한다
			
		}
		
		// 생성자는 
		
		// 메소드와 생성자의 차이점 : 타입 지정
		// 메소드는 반환 타입이 없으면 반드시 void 써야 한다.
	}//
	
	
	

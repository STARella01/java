package day09.quiz;

// 상속, 다형성 관련 문제

public class shopQuiz {

	public static void main(String[] args) {
		// Test
		Buyer b1 = new Buyer();
		b1.cash = 500000;
		b1.addToCart(new Coffee(10000, "이디야 원두"));
		b1.addToCart(new Coffee(15000, "커피빈 원두"));
		b1.addToCart(new Coffee(20000, "스타벅스 원두"));
		
		b1.addToCart(new Coffee(10000, "이디야 원두"));
		b1.addToCart(new Coffee(15000, "커피빈 원두"));
		b1.addToCart(new Coffee(20000, "스타벅스 원두"));
		
		b1.addToCart(new Coffee(10000, "이디야 원두"));
		b1.addToCart(new Coffee(15000, "커피빈 원두"));
		b1.addToCart(new Coffee(20000, "스타벅스 원두"));
		
		b1.addToCart(new Coffee(10000, "이디야 원두"));
		b1.addToCart(new Coffee(15000, "커피빈 원두"));
		b1.addToCart(new Coffee(20000, "스타벅스 원두"));
		
		b1.addToCart(new Coffee(10000, "이디야 원두"));
		b1.addToCart(new Coffee(15000, "커피빈 원두"));
		b1.addToCart(new Coffee(20000, "스타벅스 원두"));
		
		b1.addToCart(new Coffee(10000, "이디야 원두"));
		b1.addToCart(new Coffee(15000, "커피빈 원두"));
		b1.addToCart(new Coffee(20000, "스타벅스 원두"));
		
		b1.addToCart(new Coffee(10000, "이디야 원두"));



		b1.viewCart();  // 카트에 담긴 애들 노출
		b1.viewTrunk(); // 트렁크 담긴 내용
		b1.buyAll();  // 카트 정보 확인
		b1.receipt();//구매한 내용 영수증 출력
		
		for (int i = 0; i < b1.t_index; i++) {
			Product p = b1.trunk[i];
			
			if(p instanceof Vaccine) {
				Vaccine v = (Vaccine)p;
				v.checkComputer();
			}else if(p instanceof Coffee) {
				Coffee c = (Coffee)p;
				c.drink();
			}else {
				
			}
		}
		
		
	}

}

class Buyer {
	/*
	 *  Buyer에 instance 변수 (상태) 는 필요한 만큼 사용
	 */
	int cash;
	
	// 트렁크 관련 변수
	final int MAX_TRUNK_SIZE = 20;
	Product[] trunk = new Product[MAX_TRUNK_SIZE];
	int t_index = 0;
	
	// 카트 관련 변수
	final int INIT_CART_SIZE = 3;
	Product[] cart = new Product[INIT_CART_SIZE];
	int c_index = 0;
	
	/*
	 * 		Buyer의 기능 (method) 
	 * 		1. 메서드명 : buy
	 * 		기능 : 지정한 물건 (product)을 구입한다.
	 * 		바이어의 돈(cash)에서 물건의 가격을 빼고,
	 * 		내 트렁크 (trunk)에 담는다.
	 * 		만약 가진 돈이 부족하다면 구매할 수 없다.
	 * 		리턴 타입 : 없음
	 * 		매개 변수 : Product p
	 */
	// void - return타입이 없어서 사용
	
	void buy(Product p) {
		// 구매 못하는 상황
		if(cash < p.getPrice()) {
			System.out.println("가진 돈이 너무 적습니다.");
			return; // 나간다.  - return의 사용법 1. 함수의 종류/ 2. 반환값
		}else if(t_index == MAX_TRUNK_SIZE) { // 트렁크가 MAX_TRUNK_SIZE 값에 도달하면
			System.out.println("트렁크가 가득 찼습니다.");
			return; // 나간다.
		}
		
		// 구매 하는 경우
		cash -=p.getPrice(); 	 // 돈에서 물건 가격 빼서 대입해라
		trunk[t_index++] = p;  // 구매 후 트렁크에 담긴 것
	}
	

		/*
	 *  	2. 메서드명 : buyAll
	 *  	기능 : 장바구니 (cart)에 지정된 모든 물건을 구매(buy) 한다.
	 *  	리턴타입 : 없음. 
	 *  	매개변수 : 없음, Product[] cart - 멤버변수 // Product[] cart  구매하고 비운 내용을 담는 곳
	 */
		void buyAll(){//매개변수 영역) 
			
			//카트 담기는 것은  카트 2의 배수로 늘어난다. // 이후 for 동작 전 검증
			if(c_index - getNullCount() + t_index > MAX_TRUNK_SIZE) { // getNullCount -카트 인덱스에서 비어있는 공간 계산 
				//실제로 담아놓은 것과 트렁크에 담은 것이 최대 담을 수 있는 트렁크의 개수보다 크다면
				System.out.println("구매하려는 물건이 너무 많습니다.");
				return;
			} 
			for(int i = 0; i == c_index; i++) { // 트렁크가 가득 찰 때 까지, 그리고 돈이 없을 때까지 반복
				if(cart[i] != null)  // 카트는인덱스 값이 계속 늘어나고 있다. 카트 내에 비어있는 null 값이 있을 것이다 그 부분을 계산해서 빼겠다는 뜻
					buy(cart[i]);
			}
			clearCart(); // 모든 제품을 구매한 이후에는 카트가 비어질 테니 선언.
		}
		
		private void clearCart() { // 카트 비우기 - 다른 곳에서 접근 못하게
			cart = new Product[INIT_CART_SIZE]; // 비어있는 새로운 카트 만들기 
			c_index = 0;	// 대신 c_index를 0으로 만들어 준다. - 이전 배열 보내고 위에 새로운 카트 만들어 준다
							//늘어나 있는 인덱스 값을 줄인다?
		}
		
		int getNullCount() {
			int count = 0; // 개수 세어야 하니까
			for(int i =0; i < c_index; i++) { // i부터 인덱스 이전까지 (전체) 세면서
				if(cart[i] == null) // 전체 인덱스 값에서 null 값 빼줘라. - 배열을 자동으로 배열되지 않기 때문에 인덱스에 null값이 존재할 수 있음.
				// 나중에 자료 구조 collection에서는 자동으로 해줌. 
				count++;  
			}
			return count; 
		}
		
		// 구매 목록 보기
		private void viewList(Product[] pArr, int index) {
			for(int i= 0; i < index; i++) { //
				
				Product p = pArr[i]; 
				System.out.printf(i+1+".상품명[%s], 가격[%d]\n",p.getName(),p.getPrice());
				
			}
		}
		
		
		// 트렁크 보기
		public void viewTrunk() { // 언제든지 접근해서 볼 수 있도록 public 선언
			viewList(trunk, t_index); 
		} 
		
		//카트 보기
		public void viewCart() {
			viewList(cart, c_index); 
		} 
		
		
	
	/*
	 *		3. 메서드명 : addCart
	 * 		기능 : 지정한 물건을 장바구니에 담는다.
	 * 		만약에 장바구니에 담을 공간이 부족하면
	 * 		장바구니 배열의 크기를 2배로 늘린 다음에 담는다. 
	 * 		리턴 타입 : 없음
	 * 		매개 변수 : Product p
	 */

		void addToCart(Product p) {
			
			//카트 공간이 비어 있는 경우 - 비어있는 공간에 담을 수 있도록
			for(int i = 0; i < c_index; i++) { //  
				if(cart[i] == null) {
					cart[i] = p;
					System.out.println("비어있는 곳"+i+"에 넣었습니다.");
					return;
				}
			}
			
			// 카트 공간이 없는 경우 2배씩 증가
			if(c_index == cart.length) { // 
				// 배열을 다시 만든다
				Product[] newCart = new Product[cart.length * 2];
				System.arraycopy(cart, 0, newCart, 0, cart.length); // cart에 넣는다, 처음부터 0 , 어느 정도까지? cart.length까지, 
				cart = newCart;
				// 기존에 있던 카드에 있던 물건들은 옮겨놓는다
			}
			
			// 실제 동작 코드 - 저장이 이루어지는 곳
			cart[c_index++] = p;
		}
	
	/*
	 *		4. 메서드명 : cancel
	 * 		기능 : 지정한 물건을 장바구니에서 뺀다.
	 * 		뺀 곳에는 다시 물건을 담을 수 있어야 한다.
	 * 		리턴 타입 : 없음
	 * 		매개 변수 : int cart_index
	 */
		
		void cancel(int cart_index) { // c_index와 다른 개념임
			cart[cart_index -1] = null;   //   - 1하는 이유 : cart값 배열시작이 0번이 되게 하지않기 위해 / 해당 위치에 있는 인덱스 값을 삭제하겠다. 
		}
			
		
	
	/*
	 *		5. 메서드명 : receipt
	 * 		기능 : 바이어가 구매한 물건의 목록과 사용 금액 남은 금액을 출력한다.
	 * 		리턴 타입 : 없음
	 * 		매개 변수 : 없음
	 */
		
		void receipt() { 
			// 구매한 물건 목록 보여주기
			// 메서드로 빼서 만들거임			
			viewTrunk();
	
			// 사용 금액과 남은 금액 출력 
			System.out.println("사용 금액 :"+getTotalPrice(trunk, t_index));  
			System.out.println("남은 금액 :"+cash);
			
			// total 금액 계산 
		}
		
		
		int getTotalPrice(Product[] pArr, int index) { 
			int price = 0;
			for(int i = 0; i < index; i++) {
				price += pArr[i].getPrice();
			}
			
			return price;
		}
		
}

/* product 클래스를 상속 받아서 상품을 3개 이상 만들어 보세요!
 * (단, product 클래스를 변경하면 안됨)
 */

class Product{ // 부모 클래스로 사용할 예정
	
	String name;
	private int price; // private : 내 클래스 내부에서만 사용하려고 함.
		public Product(int price) {
			this.price = price;
		}
		public String getName() {
			return name;
		}
		public int getPrice() {
			return price;
		}
}


// 상속받은 클래스는 생성자에서 반드시 부모 생성자를 호출
// (호출하지 않으면 기본타입으로 생략되어 있다.)

// 아무 것도 적지 않은 생성자에는 super()가 생략되어 있다.

// Product라는 부모 클래스에는 기본 생성자가 없기 때문에 
// super(int price)타입의 생성자를 반드시 호출해야 한다.
class Coffee extends Product{ // 커피와 관련된 자식 클래스 // product에서 상속	
	public Coffee(int price, String name) {  
		super(price); // 생성자
		this.name = name; 
	}  
	
	void drink() {
		System.out.println("'" +name+"' 커피를 끓여 마셨습니다.'");
	}

}//

class SmartPhone extends Product { // 커피와 관련된 자식 클래스 // product에서 상속
	public SmartPhone(int price, String name) { // 데이터를 저장하기 위한 용도
		super(price); // 생성자 - 부모에 있는 네임 상속받을 겨
		this.name = name; 
	}  
}//

class Vaccine extends Product { // 백신과 관련된 자식 클래스 // product에서 상속
	public Vaccine(int price, String name) { // 데이터를 저장하기 위한 용도
		super(price); // 생성자
		this.name = name; 
	}  
	
	void checkComputer() {
		System.out.println(name+"이 컴퓨터를 검사합니다.");
	}
}//





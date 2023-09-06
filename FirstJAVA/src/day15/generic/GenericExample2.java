package day15.generic;

import java.util.ArrayList;

public class GenericExample2 {

	public static void main(String[] args) {
		Wallet<Card, Money> card_wallet = new Wallet<>("파란색");
		Wallet<CreditCard, Money> card_wallet2 = new Wallet<>("앨리스블루");

		
		// Wallet<String,Integer> card_wallet3 = new Wallet<>("하늘색";)
		// 위에 것이 안되는 이유는? 정의 시 제한 걸려 있어서 
		// <One extends Card, Two extends Money>
				
		card_wallet.pouch.add(new CreditCard());
		card_wallet.pouch.add(new CheckCard());
		card_wallet.pouch.add(new BusCard());
//		card_wallet2.pouch.add(new CreditCard());
		card_wallet2.pouch.add(new CreditCard());
		
		card_wallet.pouch2.add(new Dollar());
		card_wallet.pouch2.add(new Won());
		
		
		ArrayList<Integer> int_list = new ArrayList<>();
		ArrayList<String> str_list = new ArrayList<>();
		ArrayList<Object> apple_list = new ArrayList<>();
		
		
		str_list.add("제너릭 때문에 문자열만 들어감");
		str_list.add("이유 : 이건 문자열 제너릭 컬렉션이라서");
		int_list.add(100);
		int_list.add(new Integer(20));
		apple_list.add(new Person<String>("차은우", 100));
		
		
		usingArrayListMethod(apple_list);
		usingArrayListMethod(str_list);
		usingArrayListMethod(int_list);
		
		
		usingArrayListMethod(card_wallet);
		usingArrayListMethod(card_wallet2);
		
	}
	
	// 오버로드는 원래 타입이 다르면 돼야 하는데 안됨.. 그런데 제네릭은 안됨.
	// 제너릭이 다른 것만으로는 오버로딩을 할 수 없다.
	// 다만 데이터 타입이 다른 경우는 상관없음.  ArrayList가 같아서 안 됨.
	//	static void usingArrayListMethod(ArrayList<Integer> list) {
	//		System.out.println(list);
	//	} 
	//	static void usingArrayListMethod(ArrayList<String> list) {
	//		System.out.println(list);
	//	}
	
	// 그럴 때 사용하는 것이 <?> 이다. - 이 제너릭을 통해 오버로드 구현이 가능해짐.
	static void usingArrayListMethod(ArrayList<?> list) {
	System.out.println(list);
	}

	// <?>는 뭘까? : 와일드 카드, 제너릭 타입으로 오버로드를 구현하고 싶을 때 사용
	//	static void usingArrayListMethod(ArrayList<?> list) {
	//		System.out.println(list);
	//	}

	static void usingArrayListMethod(Wallet<? extends Card, ? extends Money> w) {
		System.out.println(w);
	}
}


// 제너릭에 extends는 타입의 범위를 제한하는 역할을 한다.
// 지갑 클래스 생성
// One extends Card : 첫번째 타입은 Card를 상속받는 클래스만 허용
// Two extends Money : 두번째 타입은 Money를 상속받은 클래스만 허용
class  Wallet<One extends Card, Two extends Money> {
	// class  Wallet<T extends Card, T extends Money> - 구분만 할 수 있다면 어떤 값이든 가능함.
	
	ArrayList<One> pouch;		// 멤버변수가 ArrayList 즉, 컬렉션이다.
	ArrayList<Two> pouch2;		// 멤버변수가 ArrayList 즉, 컬렉션이다.
	String color;
	
	public Wallet(String color) {
	// pouch = new ArrayList<Wallet.One>();
	// pouch2 = new ArrayList<Wallet.Two>();
	pouch = new ArrayList<>();  // 초기화
	pouch2 = new ArrayList<>(); // 초기화
	this.color =color;
	}
	
	public One get(int index) {
		return pouch.get(index); // 
	}
	
	@Override
	public String toString() {
		return "지갑 내용물 출력"; // 그냥 내용 출력
	}

}



class Card{ }

class CreditCard extends Card{ }
class CheckCard extends Card{}
class BusCard extends Card{}

class Money{ }

class Won extends Money{}
class Dollar extends Money{}

package day19.Lambda;

public class LamdaEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o = new Outer();
		o.method();		
	}
}

	@FunctionalInterface
	interface LamdeInterface5{
		void method();
	}
	
	class Outer{
		public int iv = 10;
		void method() {
			final int iv = 40;   // 람다 표현식 내에서 지역변수 접근 시, 지역변수는 상수화도 필요
			LamdeInterface5 f5 = ( ) -> {
				// 람다식 내부의 this는 람다 객체 자신을 의미
				System.out.println("Other.this.iv :"+Outer.this.iv);
				System.out.println("this.iv :" +this.iv);
				System.out.println("iv :"+ iv);
			};
			f5.method();  // 익명객체의 메서드 f5
		}
	
	}
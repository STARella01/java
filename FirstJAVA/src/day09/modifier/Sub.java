package day09.modifier;

import day09.modifier.pac.Super;

public class Sub extends Super {
	
		private int num5 = 50;
		
		public void print() {
			System.out.println("Super num1=" + num1);
			System.out.println("Super num2=" + num2);
			// System.out.println("Super num3=" + num3);  // 에러 이유 : 접근제한자가 default가 같은 패키지에 있지 않아서
			// System.out.println("Super num4=" + num4); // 에러 : 접근 제한자가 private이여서.
			System.out.println("Super num4=" + getNum4()); // 부모로부터 상속 받은 메소드가 num4 접근할 수 있게함
			System.out.println("Sub num5=" + num5);
			
		}
	
}



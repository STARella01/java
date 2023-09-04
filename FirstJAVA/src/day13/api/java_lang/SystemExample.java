package day13.api.java_lang;

public class SystemExample {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis(); // NS
		System.out.println("시작 시간 : "+start);
		
		System.out.println(System.getProperties());
		
		// 시간 지연을 위해 추가함.
		int a = 0;
		for (int i = 0; i < 100000; i++) a+=i ;
		
		long end = System.currentTimeMillis();
		System.out.println("종료 시간 :"+end);

	}

}

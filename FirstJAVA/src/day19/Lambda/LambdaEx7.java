package day19.Lambda;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class LambdaEx7 {

	public static void main(String[] args) {
		// supplier<T> : 매개변수 X , 반환타입 O
		Supplier<String> s1 = () ->{
			return "차은우";
		}; 
		System.out.println(s1.get()); // 차은우 반환
		
		s1 = () -> "이순신";
		System.out.println(s1.get());

		IntSupplier s2 = () -> {
			int num = (int)(Math.random()*6) + 1;
			return num;
		};
		System.out.println("주사위 :"+s2.getAsInt());
		
		DoubleSupplier s3 = () -> Math.PI;
		System.out.println("파이 값 : "+ s3.getAsDouble());
		
		
	}

}

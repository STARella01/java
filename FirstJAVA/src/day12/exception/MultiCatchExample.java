package day12.exception;

public class MultiCatchExample {

	
	public static int devide(int a, int b) {
		return a/b;
	}
	
	public static void doSomething(int a) throws Exception{
		if(a > 50) {
			throw new ArrayIndexOutOfBoundsException ("a값이 50보다 큽니다."); // 예외 발생 키워드 
		}else {
			System.out.println("50% 확률로 실행됨");
		}
	}
	public static void main(String[] args) {
		
		int a = (int)(Math.random() * 100);
		int b = (int)(Math.random() * 4);
		
		try {
			System.out.printf("a = %d, b= %d, result = %d\n",a,b,devide(a,b));
			doSomething(a);			
		} catch (ArithmeticException ae) {
			System.out.println("0으로 나누려고 하고 있습니다.");
			System.out.println(ae.getMessage());
		}catch (Exception e) {
			System.out.println("예외 발생했습니다.");
			System.out.println("예외 발생 원인:"+e.getMessage());	
		}


	}

}

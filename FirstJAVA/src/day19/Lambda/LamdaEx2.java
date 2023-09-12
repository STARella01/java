package day19.Lambda;

public class LamdaEx2 {

	public static void main(String[] args) {
		//Runnable 인터페이스를 이용한 람다식 
		System.out.println("시작");
		Runnable run = ( ) ->{
			for(int i = 1 ; i <= 10; i++) {
				System.out.println("첫번째 :"+i);
			}
		};	
		Runnable run2 = ( ) ->{
			for(int i = 1 ; i <= 10; i++) {
				System.out.println("두번째 :"+i);
			}	
		};
		
		// thread를 사용하여 개별적으로 동시에 같이 실행됨.
		Thread t = new Thread(run);
		Thread t2 = new Thread(run2); 

		t.start();
		t2.start();
		System.out.println("종료");
		
	}

}


//시작
//종료
//첫번째 :1
//첫번째 :2
//첫번째 :3
//첫번째 :4
//두번째 :1
//두번째 :2
//두번째 :3
//첫번째 :5
//첫번째 :6
//두번째 :4
//첫번째 :7
//첫번째 :8
//첫번째 :9
//첫번째 :10
//두번째 :5
//두번째 :6
//두번째 :7
//두번째 :8
//두번째 :9
//두번째 :10